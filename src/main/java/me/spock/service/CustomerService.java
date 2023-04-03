package me.spock.service;

import me.spock.domain.Customer;
import me.spock.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void insertCustomer(Customer customer){
        this.customerRepository.save(customer);
    }

    public List<Customer> findAllCustomers(){
        Iterator<Customer> iterator = this.customerRepository.findAll().iterator();
        List<Customer> customers = new ArrayList<>();
        iterator.forEachRemaining(customers::add);
        return customers;
    }

    public void deleteAll(){
        this.customerRepository.deleteAll();
    }
}
