package xiaohu.service.Impl;

import com.xiaohu.dao.CustomersDaoInterface;
import com.xiaohu.entity.Customers;
import com.xiaohu.service.CustomersServiceInterface;

import java.util.List;

public class CustomersServiceImpl implements CustomersServiceInterface {

    private CustomersDaoInterface customersDaoInterface;

    @Override
    public List<Customers> findAll() {
        System.out.println("执行了findAll方法");
        return customersDaoInterface.findAll();
    }
}
