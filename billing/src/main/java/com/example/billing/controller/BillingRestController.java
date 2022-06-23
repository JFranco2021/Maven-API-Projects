package com.example.billing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.billing.entities.Billing;
import com.example.billing.repository.BillingRepository;

@RestController
@RequestMapping("/billing")
public class BillingRestController {
	
	@Autowired
	BillingRepository billingRepository;
	
	@GetMapping()
	public List<Billing> list(){
		return billingRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Billing get(@PathVariable String id) {
		return null;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> put(@PathVariable String id, @RequestBody Billing input){
	return null;
	}
	
	@PostMapping
	public ResponseEntity<?> post(@RequestBody Billing input){
		Billing save = billingRepository.save(input);
		return ResponseEntity.ok(save);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable String id){
		return null;
	}

}
