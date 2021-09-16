package com.featurespace.customerEvents.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.featurespace.customerEvents.enity.Customer;
import com.featurespace.customerEvents.enity.Marchant;
import com.featurespace.customerEvents.ws.dataObjects.CustomerDepositRequest;
import com.featurespace.customerEvents.ws.dataObjects.CustomerPaymentRequest;
public interface CustomerEventService {
	boolean depositAmount(CustomerDepositRequest deposit);
	boolean  purchaseAmount(CustomerPaymentRequest purchase);
	Map<String, Double> findAverageHighestSpent();
	List<Marchant> findHighestMarchantTrancation();
	List<Customer> findCustomerWithHigestBalance();

}
