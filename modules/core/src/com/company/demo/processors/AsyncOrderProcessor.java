package com.company.demo.processors;

import com.company.demo.entity.Order;
import com.company.demo.service.BatchProcessingEvent;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.security.app.Authenticated;
import org.slf4j.Logger;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.transaction.Transactional;

@Component("demo_AsyncOrderProcessor")
public class AsyncOrderProcessor {
    @Inject
    private Logger log;
    @Inject
    private Persistence persistence;

    @Async
    @EventListener
    @Transactional // automatically manage transaction
    @Authenticated // work as admin user
    public void process(BatchProcessingEvent event) {
        log.info("Processing {}", event.getSource().getInstanceName());

        EntityManager em = persistence.getEntityManager();

        Order order = em.merge(event.getSource());

        order.setProcessed(true);
    }
}