package com.vehiclemanagement.customer;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private  int customerId;
    private int loyaltyPoints;
    private List<String> rentalHistory;

    public Customer(int customerId, String name){
        this.customerId = customerId;
        this.name = name;
        this.loyaltyPoints =0;
        this.rentalHistory = new ArrayList<>();
    }

    //Getters and Setters(Encapsulated)
    public String getName(){

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getCustomerId() {

        return customerId;
    }
    public int getLoyaltyPoints(int points){

        return loyaltyPoints;
    }
    public void addLoyaltyPoints(int points){

        this.loyaltyPoints += points;
    }
    public List<String>getRentalHistory() {

        return rentalHistory;
    }
    public void addRental(String vehicleDetails){

        rentalHistory.add(vehicleDetails);
    }
}
