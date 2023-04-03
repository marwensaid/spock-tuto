package me.spock.service


import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

// define the configuration context (this is a spring context like on JUNIT)
class CustomerServiceSpec extends Specification {

    @Autowired
    CustomerService customerService


    //TODO: setup delete method

    def "insert customer"() {

        setup:

        //TODO: setup test class args

        //TODO: create new address

        //TODO: create new account and add it in a accountList

        //TODO: create new customer including address and account

        when:
        customerService.insertCustomer(customer)

        then:
        def customers = customerService.findAllCustomers()

        //TODO: test retrieve juste one customer
        //TODO: test customer name
        //TODO: test customer street name

    }
}
