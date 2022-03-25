package me.spock;

import me.spock.domain.Account;
import me.spock.domain.Address;
import me.spock.domain.Customer;
import me.spock.service.CustomerService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {
    private static final Log LOGGER = LogFactory.getLog(Application.class);
    @Autowired
    private CustomerService customerService;

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        LOGGER.info("START Application");

        Address address = new Address();
        address.setNumber("81");
        address.setStreet("Mongo Street");
        address.setTown("City");
        address.setPostCode("CT81 1DB");

        Account account = new Account();
        account.setAccountName("Personal Account");
        List<Account> accounts = new ArrayList<>();
        accounts.add(account);

        Customer customer = new Customer();
        customer.setAddress(address);
        customer.setName("Mr Bank Customer");
        customer.setAccounts(accounts);

        customerService.insertCustomer(customer);

        List<Customer> customers = customerService.findAllCustomers();

        Customer savedCustomer = customers.get(0);
        LOGGER.info("Customers size : " + customers.size());
        LOGGER.info("Customer "+savedCustomer.getName() + " lives in " + savedCustomer.getAddress().getTown());

        LOGGER.info("END Application");
    }
}
