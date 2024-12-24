package com.vehiclemanagement.abstracts;

public abstract class Vehicle {
    //Encapsulated fields
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    //Constructor to initialize vehicle properties
    public Vehicle(String vehicleId, String model, double baseRentalRate){
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
    }
    //Getters and Setters
    public String getVehicleId(){
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {isAvailable = available;
    }
    // Abstract methods for abstraction
    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();

    @Override
    public String toString(){
        return String.format("Vehicle[ID=%s, Model=%s, Rate=%.2f, Available=%s]",
                vehicleId,model, baseRentalRate, isAvailable? "Yes" : "No");
    }

}
