package com.sandpit.demo.service;

import com.sandpit.demo.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> findAll();

    public Customer findById(String id);

    public Customer save(Customer customer);

}
