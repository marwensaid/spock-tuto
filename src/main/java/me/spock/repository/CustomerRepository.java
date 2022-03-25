package me.spock.repository;

import me.spock.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface CustomerRepository extends CrudRepository<Customer,Long>{
}
