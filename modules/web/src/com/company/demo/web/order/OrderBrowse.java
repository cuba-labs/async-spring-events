package com.company.demo.web.order;

import com.company.demo.entity.Order;
import com.company.demo.service.AsyncProcessingService;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.GroupTable;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Set;

public class OrderBrowse extends AbstractLookup {
    @Inject
    private GroupTable<Order> ordersTable;
    @Inject
    private AsyncProcessingService asyncProcessingService;

    public void process() {
        Set<Order> selected = ordersTable.getSelected();
        asyncProcessingService.process(new ArrayList<>(selected));
    }
}