package com.vehiclemanagement.vehicles;

import com.vehiclemanagement.abstracts.Vehicle;
import com.vehiclemanagement.abstracts.Vehicle;
import com.vehiclemanagement.customer.Customer;
import com.vehiclemanagement.interfaces.Rentable;

public class Car extends Vehicle implements Rentable {
    private int seatingCapacity;
    public Car(String vehicleId, String model,double baseRentalRate,int seatingCapacity){
        super(vehicleId, model,baseRentalRate);
        this.seatingCapacity =seatingCapacity;
    }

    @Override
    public double calculateRentalCost(int days){
        return getBaseRentalRate() * days*1.1;// Cars have an additional !0% surcharge
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent (Customer customer, int days){
        System.out.println(customer.getName() + "rented a car for " + days +"days.");
    }
    @Override
    public void returnVehicle() {
        System.out.println("The car has been returned.");
    }
    public int getSeatingCapacity(){
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
}


