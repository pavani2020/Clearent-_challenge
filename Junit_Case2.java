package creditcard;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

//2 people have 1 wallet each,  person 1 has 1 wallet , with 2 cards MC and visa person 2 has 1 wallet – 1 visa and 1 MC -  each card has $100 balance - calculate the total interest(simple interest) for each person and interest per wallet

public class Junit_Case2 {
	private Ccard[] cardsp1 = {new MasterCard(100), new Visa(100)};
	private Ccard[] cardsp2 = {new Visa(100), new MasterCard(100)};
	private Wallets[] walletp1 = {new Wallets(cardsp1)};
	private Wallets[] walletp2 = {new Wallets(cardsp2)};
	private Persons person1 = new Persons(walletp1);
	private Persons person2 = new Persons(walletp2);
    
	//one person has 1 wallet, with 2 cards(Mc and visa)
	@Test
	public void person1Interestfifteen() {
		assertEquals(15.0, walletp1[0].getInterest(),0);
		}
    //person 2 has 1 wallet – 1 visa and 1 Mc
	@Test
	public void person2Interestfifteen() {
		assertEquals(15.00, walletp2[0].getInterest(),0);
		}
	//person1 total interest
	@Test
	public void Creditperson1Total() {
		assertEquals(15.00, person1.getInterest(),0);
		}
	//person2 total interest.
	@Test
	public void Creditperson2Total() {
		assertEquals(15.00, person2.getInterest(),0);
		}

	}
