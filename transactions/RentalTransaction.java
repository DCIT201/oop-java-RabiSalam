package com.vehiclemanagement.transactions;

import com.vehiclemanagement.abstracts.Vehicle;
import com.vehiclemanagement.customer.Customer;

public class RentalTransaction {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;
    private double totalCost;

    public RentalTransaction(Vehicle vehicle, Customer customer,int rentalDays){
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.totalCost = vehicle.calculateRentalCost(rentalDays);
    }
    public double getTotalCost(){
        return totalCost;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public Customer getCustomer() {
        return customer;
    }
}
