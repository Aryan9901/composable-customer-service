package com.aryan.repository;

import com.aryan.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class CustomerRepository {
    private final Map<String, Customer> store = new ConcurrentHashMap<>();

    public Customer save(Customer customer){
        store.put(customer.id(), customer);
        return customer;
    }

    public Optional<Customer> findById(String id){
        return Optional.ofNullable(store.get(id));
    }

    public boolean deleteById(String id){
        return store.remove(id) != null;
    }
}
