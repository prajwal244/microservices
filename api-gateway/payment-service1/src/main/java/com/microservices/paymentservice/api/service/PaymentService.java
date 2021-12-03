package com.microservices.paymentservice.api.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.paymentservice.api.entity.Payment;
import com.microservices.paymentservice.api.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository repo;
	
	
	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return repo.save(payment);
	}
	
	public String paymentProcessing() {
		//api should be 3rd party payment gateway(paypal,paytm,..)
		return new Random().nextBoolean()?"success":"false";
	}

	public Payment fetchPaymentHistory(int orderId) {
		
		return repo.findByOrderId(orderId);
	}
}
