package com.sandpit.demo.rest;

import com.sandpit.demo.entity.Customer;
import com.sandpit.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class BackendRestController {

    private CustomerService customerService;

     @Autowired BackendRestController(CustomerService theCustomerService) {
        customerService=theCustomerService;
     };

    @GetMapping("/test")
    public String getTest(){
        return "test";
    }


    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerService.findAll();
    }

    @GetMapping("customer/{id}")
    public Customer getCustomer(@PathVariable String id) {
        return customerService.findById(id);
    }
    
}
