package com.company.demo.service;

import com.company.demo.entity.Order;
import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service(AsyncProcessingService.NAME)
public class AsyncProcessingServiceBean implements AsyncProcessingService {

    @Inject
    private Logger log;

    @Inject
    private ApplicationContext applicationContext;

    @Override
    public void process(List<Order> orders) {
        log.info("Start processing");

        for (Order order : orders) {
            // start async processing
            applicationContext.publishEvent(new BatchProcessingEvent(order));
        }

        log.info("Finished");
    }
}