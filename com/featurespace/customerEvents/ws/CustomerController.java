package com.featurespace.customerEvents.ws;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.featurespace.customerEvents.enity.Customer;
import com.featurespace.customerEvents.enity.Marchant;
import com.featurespace.customerEvents.ws.dataObjects.CustomerDepositRequest;
import com.featurespace.customerEvents.ws.dataObjects.CustomerPaymentRequest;

import com.featurespace.customerEvents.service.CustomerEventService;

@RestController
public class CustomerController {
	private static final Logger s_logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired
	private CustomerEventService customerEventService;
	
	@Autowired
    public CustomerController(CustomerEventService customerEventService) {
        this.customerEventService = customerEventService;
    }
	
	@RequestMapping(value = "/deposit" ,method = RequestMethod.POST)
	public ResponseEntity<String>  depositInAccount(@RequestBody CustomerDepositRequest depositRequest) {
		s_logger.info(" deposit details {}",depositRequest.toString());
		customerEventService.depositAmount(depositRequest) ;
			return (ResponseEntity.ok("OK"));
	}
	@RequestMapping(value = "/transaction" ,method = RequestMethod.POST)
	public ResponseEntity<String>  paymentFromAccount(@RequestBody CustomerPaymentRequest paymentRequest) {
		if ( customerEventService.purchaseAmount(paymentRequest)) {
			return ResponseEntity.ok("SUCCESS");
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	/*@RequestMapping(value = "/customer" ,method = RequestMethod.GET)
	public ResponseEntity<String>  gethigestAvgSpentFromAccount(@RequestBody CustomerPaymentRequest paymentRequest) {
		Map<String, Double>  customer = (Map<String, Double>) customerEventService.findAverageHighestSpent();
		s_logger.info("customer : {}",customer.size());
		return ResponseEntity.ok("SUCCESS");
		/// customer id, avg amount
	}*/
	
	/*@RequestMapping(value = "/marchant" ,method = RequestMethod.GET)
	public ResponseEntity<String>  gethigestAvgSpentFromMarchant(@RequestBody CustomerPaymentRequest paymentRequest) {
		List<Marchant> march = customerEventService.findHighestMarchantTrancation();
			return ResponseEntity.ok("SUCCESS");
				
		/// marchant id, avg amount
	}
	
	@RequestMapping(value = "/customer" ,method = RequestMethod.GET)
	public ResponseEntity<String>  gethigestBalanceLeftInAccount(@RequestBody CustomerPaymentRequest paymentRequest) {
		customerEventService .findCustomerWithHigestBalance();
		return ResponseEntity.ok("SUCCESS");
		/// customer id, avg amount
	}*/
	
	
}
