package com.hfwas.java.chapter10;

/**
 * @Author: HFwas
 * @Date: 2021/1/24
 * @Description: com.hfwas.java.chapter10
 * 测试对象实例化的过程
 * @version: 1.0
 */
public class Customer {
    int id = 1001;
    String name;
    Account account;

    {
        name = "客户";
    }

    public Customer(){
        account = new Account();
    }
}

class Account{

}

