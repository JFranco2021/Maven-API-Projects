package com.example.billing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billing.entities.Billing;

public interface BillingRepository extends JpaRepository <Billing, Long>{

}
