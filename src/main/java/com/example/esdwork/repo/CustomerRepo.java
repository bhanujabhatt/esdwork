package com.example.esdwork.repo;

import com.example.esdwork.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo  extends JpaRepository<Customer, Long> {
}
