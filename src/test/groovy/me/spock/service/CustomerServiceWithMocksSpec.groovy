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

    CustomerRepository customerRepository = Mock()

    def setup() {
        customerService.customerRepository = customerRepository
        customerService.deleteAll()
    }

    def "insert customer"() {

        setup:

        // setup test class args
        Address address = new Address()
        address.setNumber("81")
        address.setStreet("Mongo Street")
        address.setTown("City")
        address.setPostCode("CT81 1DB")

        Account account = new Account()
        account.setAccountName("Personal Account")
        List<Account> accounts = new ArrayList<Account>()
        accounts.add(account)

        Customer customer = new Customer()
        customer.setAddress(address)
        customer.setName("Mr Bank Customer")
        customer.setAccounts(accounts)

        when:
        customerService.insertCustomer(customer)

        then:
        1 * customerRepository.save(customer)

    }

    def "find all customers"() {

        setup:

        // setup test class args
        Address address = new Address()
        address.setStreet("Mongo Street")

        Customer customer = new Customer()
        customer.setAddress(address)
        customer.setName("Mr Bank Customer")

        // setup mocking
        def mockCustomers = []
        mockCustomers << customer
        customerRepository.findAll() >> mockCustomers

        when:
        def customers = customerService.findAllCustomers()

        then:
        customers.size() == 1
        customers.get(0).name == "Mr Bank Customer"

    }

}