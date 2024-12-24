package com.vehiclemanagement.vehicles;

import com.vehiclemanagement.abstracts.Vehicle;
import com.vehiclemanagement.customer.Customer;
import com.vehiclemanagement.interfaces.Rentable;

public class Truck extends Vehicle implements Rentable {
    private double loadCapacity;
    public Truck(String vehicleId, String model,double baseRentalRate, double loadCapacity){
        super(vehicleId, model,baseRentalRate);
        this.loadCapacity=loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days){
        return getBaseRentalRate() * days* (loadCapacity > 1000? 1.5 : 1.0);// Trucks with high load cost more;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public double getLodCapacity() {
        return loadCapacity;
    }
    public void setLodCapacity(double loadCapacity){
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void rent (Customer customer, int days){
        System.out.println(customer.getName() + "rented a truck for " + days +"days.");
    }
    @Override
    public void returnVehicle() {
        System.out.println("The truck has been returned.");
    }


}

