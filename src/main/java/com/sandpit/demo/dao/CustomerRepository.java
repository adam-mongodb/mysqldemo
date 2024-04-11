package com.sandpit.demo.dao;

import com.sandpit.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value="Select id, name from customer where id= :id", nativeQuery = true)
    Customer findById(@Param("id") String id);

}
    


