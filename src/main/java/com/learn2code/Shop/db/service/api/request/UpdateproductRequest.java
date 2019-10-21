package com.learn2code.Shop.db.service.api.request;

import org.springframework.lang.NonNull;

import java.util.Objects;

public class UpdateproductRequest {

    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private double price;
    @NonNull
    private int available;

    public UpdateproductRequest(String name, String description, double price, int available) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailable() {
        return available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateproductRequest that = (UpdateproductRequest) o;
        return Double.compare(that.price, price) == 0 &&
                available == that.available &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, available);
    }
}
