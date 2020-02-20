package creditcard;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

//1 person has 2 wallets  Wallet 1 has a Visa and Discover , wallet 2 a MC -  each card has $100 balance - calculate the total interest(simple interest) for this person and interest per wallet

public class Junit_Case1 {
	private Ccard[] cardsw1 = {new Visa(100), new Discover(100)};
	private Ccard[] cardsw2 = {new MasterCard(100)};
	private Wallets[] wallets = {new Wallets(cardsw1), new Wallets(cardsw2)};
	private Persons person = new Persons(wallets);
    
	//wallet1 has visacard and discover.
	@Test
	public void cardw1personInterest() {
		assertEquals(11.0, wallets[0].getInterest(),0);
		}
    //wallet2 has only mastercard.
	@Test
	public void cardw2personInterest() {
		assertEquals(5.00, wallets[1].getInterest(),0);
		}
	
	//each card has $100 balance calculating the total
	@Test
	public void personInterestTotal() {
		assertEquals(16.00, person.getInterest(),0);
		}
	}
