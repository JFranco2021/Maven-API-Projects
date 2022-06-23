package com.example.billing.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Billing {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long customerId;
	private String number;
	private String detail;
	private Double amount;

}
