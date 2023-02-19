package xiaohu.dao;

import com.xiaohu.entity.Customers;

import java.util.List;

public interface CustomersDaoInterface {

    //查询所有
    List<Customers> findAll();
}
