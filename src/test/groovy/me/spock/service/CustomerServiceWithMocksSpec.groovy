package me.spock.service

import me.spock.Application
import me.spock.domain.Address
import me.spock.domain.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(loader = SpringApplicationContextLoader.class, classes = [Application.class] )
class CustomerServiceWithMocksSpec extends Specification {

    @Autowired
    CustomerService customerService

    //TODO: create a mock for CustomerRepository


    def setup() {
        //TODO: in the setup I wanna init a customerRepository
        customerService.deleteAll()
    }


    //TODO: create a test for insert customer using the mock


    //TODO: in this test we gonna test the findAllCustomer method
    def "find all customers"() {

        setup:

        // setup test class args
        Address address = new Address()
        address.setStreet("Mongo Street")

        Customer customer = new Customer()
        customer.setAddress(address)
        customer.setName("Mr Bank Customer")

        //TODO: setup mocking


        when:
        def customers = customerService.findAllCustomers()

        then:

        //TODO: test customer size and name
        def c

    }

}