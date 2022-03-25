package me.spock.service

import me.spock.Application
import me.spock.domain.Account
import me.spock.domain.Address
import me.spock.domain.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification


// define the configuration context (this is a spring context like on JUNIT)
class CustomerServiceSpec extends Specification {

    @Autowired
    CustomerService customerService


    // setup delete method

    def "insert customer"() {

        setup:

        // setup test class args

        // create new address

        // create new account and add it in a accountList

        // create new customer including address and account

        when:
        customerService.insertCustomer(customer)

        then:
        def customers = customerService.findAllCustomers()

        // test retrieve juste one customer
        // test customer name
        // test customer street name

    }
}
