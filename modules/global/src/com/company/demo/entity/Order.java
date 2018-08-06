package com.company.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|number,summary")
@Table(name = "DEMO_ORDER")
@Entity(name = "demo$Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 273173612085619185L;

    @Column(name = "NUMBER_")
    protected String number;

    @Column(name = "SUMMARY")
    protected String summary;

    @NotNull
    @Column(name = "PROCESSED", nullable = false)
    protected Boolean processed = false;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setProcessed(Boolean processed) {
        this.processed = processed;
    }

    public Boolean getProcessed() {
        return processed;
    }


}