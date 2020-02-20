package creditcard;

public class Wallets {
   private Ccard[] cards;
   private double interest = 0;
   
   public Wallets() {}
   
   public Wallets(Ccard[] cards) {
	   setCards(cards);
	   calcInterest();
   }
private void setCards(Ccard[] cards) {
	// TODO Auto-generated method stub
	this.cards = cards;
}

private void calcInterest() {
	// TODO Auto-generated method stub
	for(int i =0; i<cards.length; i++) 
		this.interest += cards[i].getInterest();
	
	
}
public double getInterest() {
	return interest;
	
}
public void setInterest(double interest) {
	this.interest = interest;
}
public Ccard[] getcards() {
	return cards;
	}

   
}
