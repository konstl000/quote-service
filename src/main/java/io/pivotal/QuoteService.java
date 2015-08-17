package io.pivotal;

import java.util.Random;

public class QuoteService {

	public static Quote getQuote() {
		Random random = new Random();
		
		Quote quote = null;
		switch (random.nextInt(3)){
		
		case 0:
			quote = new Quote("You miss 100% of the shots you don’t take","Wayne Gretzky");
			break;
		case 1:
			quote = new Quote("An unexamined life is not worth living.","Socrates");
			break;
		case 2:
			quote = new Quote("Winning isn’t everything, but wanting to win is.","Vince Lombardi");
			break;
		default:
			quote = new Quote("Believe you can and you’re halfway there.","Theodore Roosevelt");
			break;
		}
		
		
		return quote;
	}

}
