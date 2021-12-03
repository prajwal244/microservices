package com.microservices.paymentservice.api.entity;



import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="payment")
public class Payment {
     
	
	@Id
	private int paymentId;
	private String paymentStatus;
	private String transactionId;
	private int orderId;
	private double amount;
}
