package com.example.tagfinance.data.entity;

import org.springframework.stereotype.Component;

@Component
public class TagFinance {
    private  int id;
    private String name;
    private String description;

    public TagFinance() {
    }

    public TagFinance(int id) {
        this.id = id;
    }

    public TagFinance(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public TagFinance(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
