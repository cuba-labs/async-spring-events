package com.company.demo.service;

import com.company.demo.entity.Order;
import org.springframework.context.ApplicationEvent;

public class BatchProcessingEvent extends ApplicationEvent {
    public BatchProcessingEvent(Order source) {
        super(source);
    }

    @Override
    public Order getSource() {
        return (Order) super.getSource();
    }
}