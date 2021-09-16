package com.featurespace.customerEvents.repository;

import java.util.List;

import java.util.Map;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.featurespace.customerEvents.enity.Account;
import com.featurespace.customerEvents.enity.Customer;
import com.featurespace.customerEvents.enity.Marchant;
import com.featurespace.customerEvents.ws.CustomerController;
@Component
public class CustomerTransactionRepositoryImpl  {
	private static final Logger s_logger = LoggerFactory.getLogger(CustomerTransactionRepositoryImpl.class);

	//private MongoTemplate mongoTemplate;
	public Customer depositAmountToAccount(Customer depositDetails) {
		s_logger.info("depositDetails : {} ",depositDetails);
		//mongoTemplate.save(depositDetails);
		return depositDetails;
	}

	public Marchant purchaseFromMarchant(Marchant marchantDetails) {
		//mongoTemplate.save(marchantDetails);
		return marchantDetails;
	}

	@Query("select avg(amount) as average,customerId from smc.customer group by customer order by average desc limit 5")
	public Map<String, Double> findHighestCusomerTrancation() {
		

		return null;
	}

	public List<Marchant> findHighestMarchantTrancation() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Customer> findCustomerWithHigestBalance() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateCustomerAccount(Account account) {
		
		//mongoTemplate.save(account);
		
	}

	public Account checkAccount(String customerId) {
		//Query query = new Query();

       // query.addCriteria(Criteria.where("customerId").is(customerId));
       // Account account = mongoTemplate.findOne(query, Account.class);		
        return null;
	}

	

	

	

}
