package com.featurespace.customerEvents.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.featurespace.customerEvents.enity.Account;
import com.featurespace.customerEvents.enity.Customer;
import com.featurespace.customerEvents.enity.Marchant;
import com.featurespace.customerEvents.repository.CustomerTransactionRepository;
import com.featurespace.customerEvents.repository.CustomerTransactionRepositoryImpl;
import com.featurespace.customerEvents.ws.dataObjects.CustomerDepositRequest;
import com.featurespace.customerEvents.ws.dataObjects.CustomerPaymentRequest;
@Service
@Transactional
public class CustomerEventServiceImpl implements CustomerEventService {
	
	@Autowired
	private CustomerTransactionRepository  customerTransactionRepository ;
	
	
	List<Customer> customerList = new ArrayList<Customer>();
	List<Marchant> marchantList = new ArrayList<Marchant>();
	List<Account> accountList = new ArrayList<Account>();
	public boolean depositAmount(CustomerDepositRequest deposit) {
		
		if (deposit != null) {
			Customer customer = new Customer();
			customer.setCustomerId(deposit.getCustomerId());
			customer.setDepositId(deposit.getDepositId());
			customer.setTime(deposit.getDepositTime());
			customer.setAmount(deposit.getDepositAmount());
			//Customer customerdet = customerTransactionRepository.depositAmountToAccount(customer);
			Customer customerdet = null;
			//customerTransactionRepository.depositAmountToAccount(customer);
			
			customerTransactionRepository.save(customer);
			
			/*Account account = customerTransactionRepository.checkAccount(customerdet.getCustomerId());
			Double amount = 0.0;
			if (account != null) {
				amount = account.getAmount();
			}
			else {
				account = new Account();
			}
			account.setCustomerId(customerdet.getCustomerId());
			account.setAmount(amount + customerdet.getAmount());
			account.setEventType(deposit.getEventType());
			customerTransactionRepository.updateCustomerAccount(account);*/
			return true;
		}
		
		return false;
	}

	/*public boolean purchaseAmount(CustomerPaymentRequest purchase) {
		if (purchase != null) {
			Account account = null;
			account = customerTransactionRepository.checkAccount(purchase.getCustomerId());
			if (account == null)
			{
				return false;
			}
			Double amount = account.getAmount() - purchase.getAmount();
			
			if (amount > 0 ) {
			Marchant marchant = new Marchant();
			marchant.setCustomerId(purchase.getCustomerId());
			marchant.setMarchantId(purchase.getMarchantId());
			marchant.setTrasanctionId(purchase.getTransactionId());
			marchant.setTime(purchase.getTransactionTime());
			customerTransactionRepository.purchaseFromMarchant(marchant);
			
			account.setCustomerId(marchant.getCustomerId());
			account.setAmount(amount + marchant.getAmount());
			account.setEventType(purchase.getEventType());
			customerTransactionRepository.updateCustomerAccount(account);
			
			return true;
			}
		}
		
		return false;
	}*/

	public Map<String, Double>  findAverageHighestSpent() {
		//Map<String, Double>   cust = (Map<String, Double>) customerTransactionRepository.findHighestCusomerTrancation();
		//select avg(sequence_number) as average,mq_state_id from smc.message group by mq_state_id order by average desc limit 5;

		// TODO Auto-generated method stub
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

	@Override
	public boolean purchaseAmount(CustomerPaymentRequest purchase) {
		// TODO Auto-generated method stub
		return false;
	}

}
