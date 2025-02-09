package Mobils;

import java.util.HashMap;
import java.util.Map;

class Mobile {
    private String brand;
    private String model;
    private String number;

    public Mobile(String brand, String model, String number) {
        this.brand = brand;
        this.model = model;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Number: " + number;
    }
}