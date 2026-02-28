
class Card {
	String name;
	long num;
	String exp;
	String type;

	public void display() {
		System.out.println("Card Name : " + name);
		System.out.println("Card Number : " + num);
		System.out.println("Card Expiry : " + exp);
		System.out.println("Card type : " + type);
	}
}
class CreditCard extends Card {
	int limit;

	public void creditDisplay() {
		display();
		System.out.println("CreditCard Limit : " + limit);
	}
}
class DebitCard extends Card {
	int bal;

	public void debitDisplay() {
		display();
		System.out.println("DebitCard Balance : " + bal);
	}
}
public class CardDriver {
	public static void main(String[] args) {
		CreditCard c1 = new CreditCard();
		c1.name = "HDFC";
		c1.num = 100203034;
		c1.exp = "03/30";
		c1.type = "Visa";
		c1.limit = 10000000;
		c1.creditDisplay();
		DebitCard d1 = new DebitCard();
		d1.name = "ICICI";
		d1.num = 122304303;
		d1.exp = "10/27";
		d1.type = "Mastercard";
		d1.bal = 49939293;
		d1.debitDisplay();
	}
}
