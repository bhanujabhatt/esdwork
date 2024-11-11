package com.example.esdwork.service;

import com.example.esdwork.dto.CustomerRequest;
import com.example.esdwork.entity.Customer;
import com.example.esdwork.mapper.CustomerMapper;
import com.example.esdwork.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepo repo;
    private final CustomerMapper mapper;
    public String createCustomer(CustomerRequest request) {
        Customer customer = mapper.toEntity(request);
        repo.save(customer);
        return "Created";
    }
}
