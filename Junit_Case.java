package creditcard;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//	1 person has 1 wallet and 3 cards (1 Visa, 1 MC 1 Discover) – Each Card has a balance of $100 – calculate the total interest (simple interest) for this person and per card

public class Junit_Case {
	private Ccard[] cards = {new Visa(100), new MasterCard(100),new Discover(100)};
	private Wallets[] wallet = {new Wallets(cards)};
	private Persons person = new Persons(wallet);
	
    //visacard Interest return.
	@Test
	public void visapersonInterest() {
      assertEquals(10.0, cards[0].getInterest(),0);
		}
    //Mastercard Interest return.
	@Test
	public void MasterpersonInterest() {
		assertEquals(5.00, cards[1].getInterest(),0);
		}
	//Discovercard Interest return.
	@Test
	public void DiscoverpersonInterst() {
		assertEquals(1.00, cards[2].getInterest(),0);
		}
	//All the cards Intrerst total return. 
	@Test
	public void AllThreeCardsInterest() {
		assertEquals(16.00, person.getInterest(),0);
		}
	}
