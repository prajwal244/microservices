package com.microservices.paymentservice.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservices.paymentservice.api.entity.Payment;

public interface PaymentRepository extends MongoRepository<Payment, Integer> {

	Payment findByOrderId(int orderId);

}
