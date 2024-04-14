package com.hello.order;

import com.hello.prod.Product;
import com.hello.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }
}
