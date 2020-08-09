package com.me.encapsulation;
/*
Restricts direct access to data members (fields) of a class.
        Fields are set to private
Each field has a getter and setter method
        Getter methods return the field
        Setter methods let us change the value of the field

 */
public class Car {
    private int tires;
    private String make;
    private String model;

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
