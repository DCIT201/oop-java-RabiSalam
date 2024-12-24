package com.vehiclemanagement.interfaces;

import com.vehiclemanagement.customer.Customer;
public interface Rentable {
    void rent(Customer customer, int days);
    void returnVehicle();
}
