package com.javaprogramming;

public class Motherboard {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Motherboard(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    private String manufacturer;

}
