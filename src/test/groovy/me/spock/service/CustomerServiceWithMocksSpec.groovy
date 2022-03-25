package me.spock.service

import me.spock.Application
import me.spock.domain.Account
import me.spock.domain.Address
import me.spock.domain.Customer
import me.spock.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(loader = SpringApplicationContextLoader.class, classes = [Application.class] )
class CustomerServiceWithMocksSpec extends Specification {

    @Autowired
    CustomerService customerService

    // create a mock for CustomerRepository


    def setup() {
        // in the setup I wanna init a customerRepository
        customerService.deleteAll()
    }


    // create a test for insert customer using the mock


    // in this test we gonna test the findAllCustomer method
    def "find all customers"() {

        setup:

        // setup test class args
        Address address = new Address()
        address.setStreet("Mongo Street")

        Customer customer = new Customer()
        customer.setAddress(address)
        customer.setName("Mr Bank Customer")

        // setup mocking


        when:
        def customers = customerService.findAllCustomers()

        then:

        // test customer size and name
        def c

    }

}