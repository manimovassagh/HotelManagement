package com.github.manimovassagh.services;

import com.github.manimovassagh.models.persons.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * define a main service provider for all customers
 */
public class MainService {
    private List<Person> customers = new ArrayList<>();
    public void addNewCustomer(Person customer){
        customers.add(customer);

    }

    /**
     * get all the customers in list
     * @return customers of hotel
     */
    public List<Person> getCustomers(){
        return customers;
    }
}
