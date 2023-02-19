package com.xiaohu.springboot_elasticsearch;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.indices.CreateIndexRequest;
import co.elastic.clients.elasticsearch.indices.CreateIndexResponse;
import co.elastic.clients.elasticsearch.indices.GetIndexResponse;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;

import org.elasticsearch.client.RestClient;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class SpringBootElasticsearchApplicationTests {
    private ElasticsearchClient client;
    private ElasticsearchTransport transport;
    private RestClient restClient;
    @BeforeEach
    public void CreateClient(){
        // 创建低级客户端
         restClient = RestClient.builder(
                new HttpHost("localhost", 9200)
        ).build();
        // 使用Jackson映射器创建传输层
         transport = new RestClientTransport(
                restClient, new JacksonJsonpMapper()
        );
        // 创建API客户端
         client = new ElasticsearchClient(transport);
    }
    @AfterEach
    public void CloseClient() throws IOException {
        // 关闭ES客户端
        transport.close();
        restClient.close();
    }
    @Test
    void testCreateIndex() throws IOException {

        //创建索引，
        CreateIndexResponse createIndexResponse = client.indices().create(c -> c.index("user_test1"));
        //响应状态
        Boolean acknowledged = createIndexResponse.acknowledged();
        System.out.println("索引操作 = " + acknowledged);

    }
    @Test
    public void create() throws IOException {
        // 创建低级客户端
        RestClient restClient = RestClient.builder(
                new HttpHost("localhost", 9200)
        ).build();
        // 使用Jackson映射器创建传输层
        ElasticsearchTransport transport = new RestClientTransport(
                restClient, new JacksonJsonpMapper()
        );
        // 创建API客户端
        ElasticsearchClient client = new ElasticsearchClient(transport);
        // 创建索引
        CreateIndexResponse createIndexResponse = client.indices().create(c -> c.index("user_test"));
        // 响应状态
        Boolean acknowledged = createIndexResponse.acknowledged();
        System.out.println("索引操作 = " + acknowledged);

        // 关闭ES客户端
        transport.close();
        restClient.close();
    }

    @Test
    public void query() throws IOException {
        GetIndexResponse getIndexResponse = client.indices().get(e -> e.index("user_test"));
        System.out.println("getIndexResponse.result() = " + getIndexResponse.result());
        System.out.println("getIndexResponse.result().keySet() = " + getIndexResponse.result().keySet());

    }



}
