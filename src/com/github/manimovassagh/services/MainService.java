package com.github.manimovassagh.services;

import com.github.manimovassagh.models.persons.Person;

import java.util.ArrayList;
import java.util.List;

public class MainService {
    private List<Person> customers = new ArrayList<>();
    public void addNewCustomer(Person customer){
        customers.add(customer);

    }

    public List<Person> getCustomers(){
        return customers;
    }
}
