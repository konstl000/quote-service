package io.pivotal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {
		 
	@RequestMapping("/quote")
	Quote getQuote(){
		return QuoteService.getQuote();
	}
		
	
}
