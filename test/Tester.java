package com.vehiclemanagement.test;

import com.vehiclemanagement.vehicles.Car;
import com.vehiclemanagement.vehicles.Motorcycle;
import com.vehiclemanagement.vehicles.Truck;
import com.vehiclemanagement.customer.Customer;
import com.vehiclemanagement.agencies.RentalAgencies;

public class Tester {
    public static void main(String[] args) {
        // Initialize the rental agency
        RentalAgencies rentalAgency = new RentalAgencies();

        // Add vehicles to the fleet
        rentalAgency.addVehicle(new Car("C001", "Toyota Camry", 50.0, 5));
        rentalAgency.addVehicle(new Motorcycle("M001", "Yamaha R15", 20.0, true));
        rentalAgency.addVehicle(new Truck("T001", "Ford F-150", 100.0, 1500));

        // Display available vehicles
        System.out.println("Available Vehicles:");
        rentalAgency.displayFleet();

        // Add customers
        Customer customer1 = new Customer(1, "John Doe");
        Customer customer2 = new Customer(2, "Jane Smith");

        // Rent a vehicle
        System.out.println("\nProcessing Rentals:");
        rentalAgency.processRental(customer1, rentalAgency.getAvailableVehicle(), 3); // Rent for 3 days
        rentalAgency.processRental(customer2, rentalAgency.getAvailableVehicle(), 5); // Rent for 5 days

        // Display transactions
        System.out.println("\nRental Transactions:");
        rentalAgency.getAllTransactions().forEach(transaction -> {
            System.out.println("Vehicle: " + transaction.getVehicle());
            System.out.println("Customer: " + transaction.getCustomer().getName());
            System.out.println("Total Cost: " + transaction.getTotalCost());
            System.out.println("---");
        });

        // Show updated fleet
        System.out.println("\nUpdated Fleet:");
        rentalAgency.displayFleet();

        //Show loyalty points
        System.out.println("\nLoyalty Points:");
        System.out.println(customer1.getName() + "has" + customer1.getLoyaltyPoints(0) + "points.");
        System.out.println(customer2.getName() + "has" + customer2.getLoyaltyPoints(0) + "points.");
    }
}