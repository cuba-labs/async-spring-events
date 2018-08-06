package com.company.demo.service;

import com.company.demo.entity.Order;

import java.util.List;

public interface AsyncProcessingService {
    String NAME = "demo_AsyncProcessingService";

    void process(List<Order> orders);
}