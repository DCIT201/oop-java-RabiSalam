package com.vehiclemanagement.vehicles;

import com.vehiclemanagement.abstracts.Vehicle;
import com.vehiclemanagement.customer.Customer;
import com.vehiclemanagement.interfaces.Rentable;

public class Motorcycle extends Vehicle implements Rentable {
    private boolean hasSidecar;
        public Motorcycle(String vehicleId, String model,double baseRentalRate, boolean hasSidecar){
            super(vehicleId, model,baseRentalRate);
            this.hasSidecar = hasSidecar;
        }

        @Override
        public double calculateRentalCost(int days){
            return getBaseRentalRate() * days;
        }

        @Override
        public boolean isAvailableForRental() {
            return true;
        }

        @Override
        public void rent (Customer customer, int days){
            System.out.println(customer.getName() + "rented a motorcycle for " + days +"days.");
        }
        @Override
        public void returnVehicle() {
            System.out.println("The motorcycle has been returned.");
        }
        public boolean hasSidecar(){
            return hasSidecar;
        }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
