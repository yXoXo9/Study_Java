package com.hello.order;

import com.hello.prod.Product;
import com.hello.user.User;

public class OrderService {
    public void order() {
        User us = new User();
        Product pd = new Product();
        Order od = new Order(us, pd);
    }
}
