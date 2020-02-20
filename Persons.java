package creditcard;

public class Persons {
	
   private Wallets[] wallet;
   
   private double interest;
   
   public Persons() {}
   
   public Persons(Wallets[] wallet) {
	   setWallets(wallet);
	   calcInterest();
   }

private void calcInterest() {
	// TODO Auto-generated method stub
	for(int i =0; i<wallet.length; i++) {
		this.interest += wallet[i].getInterest();
		}
	
}
public Wallets[] getwallet() {
	return wallet;
	
}

public void setWallets(Wallets[] wallet) {
	this.wallet = wallet;
}
public double getInterest() {
	return interest;
	
}
public void setInterest() {
	this.interest = interest;
}

}
