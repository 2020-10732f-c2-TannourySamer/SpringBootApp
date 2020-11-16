/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.currencycalculation.facade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.myapp.currencycalculation.model.CalculatedAmount;


@FeignClient(name ="currency-exchange-service", url ="http://localhost:8000")
public interface CurrencyExchangeProxy {
    
    	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CalculatedAmount retrieveExchangeValue(@PathVariable("from") String from,@PathVariable("to") String to);
    
}
