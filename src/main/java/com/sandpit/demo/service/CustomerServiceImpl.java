package com.sandpit.demo.service;

import com.sandpit.demo.dao.CustomerRepository;
import com.sandpit.demo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository theCustomerRepository) {
        customerRepository = theCustomerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        Customer createdCustomer = customerRepository.save(customer);
        return createdCustomer;
    }

    @Override
    public Customer findById(String id) {
        return customerRepository.findById(id);
    }


}
