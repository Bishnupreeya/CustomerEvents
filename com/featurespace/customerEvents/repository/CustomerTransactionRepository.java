package com.featurespace.customerEvents.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.featurespace.customerEvents.enity.Account;
import com.featurespace.customerEvents.enity.Customer;
import com.featurespace.customerEvents.enity.Marchant;

public interface CustomerTransactionRepository extends CrudRepository<Customer, Long>{
	
	//Customer depositAmountToAccount(Customer depositDetails);
	//Marchant purchaseFromMarchant(Marchant marchantDetails) ;
	//void updateCustomerAccount(Account account) ;
	//@Query("select customerId, avg(amount) as average from smc.customer group by customer order by average desc limit 5")
	//Map<String, Double> findHighestCusomerTrancation();
	//List<Marchant> findHighestMarchantTrancation();
	//List<Customer> findCustomerWithHigestBalance();
	//Account checkAccount(String customerId);
	

}
