package com.sample.springboot.purchaseOrder.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springboot.purchaseOrder.entity.PurchaseOrder;

@RestController
@RequestMapping("/api")
public class PurchaseOrderRestController {
	
	@PostMapping("/orders")
	public PurchaseOrder addOrder(@RequestBody PurchaseOrder order){
		
		return order;
		
		
		
	}
	

}
