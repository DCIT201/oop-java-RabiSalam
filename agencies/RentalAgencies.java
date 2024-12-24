package com.vehiclemanagement.agencies;


import com.vehiclemanagement.abstracts.Vehicle;
import com.vehiclemanagement.customer.Customer;
import com.vehiclemanagement.transactions.RentalTransaction;

import java.util.ArrayList;
import java.util.List;

public class RentalAgencies {

    private List<Vehicle> vehicles;
    private List<RentalTransaction> transactions;
    private List<Vehicle> fleet;

    public RentalAgencies() {
        this.vehicles = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Vehicle getAvailableVehicle() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailableForRental()) {
                return vehicle;
            }
        }
        return null; // No available vehicle
    }

    public void processRental(Customer customer, Vehicle vehicle, int days) {
        RentalTransaction transaction = new RentalTransaction(vehicle, customer, days);
        transactions.add(transaction);
        vehicle.setAvailable(false); // Mark the vehicle as rented
        customer.addRental(transaction.toString());
    }

    public List<RentalTransaction> getAllTransactions() {
        return transactions;
    }


//Method to add a vehicle to the fleet
    public void displayFleet() {
        for (Vehicle vehicle : fleet) {
            System.out.println(vehicle);
        }
    }
}




