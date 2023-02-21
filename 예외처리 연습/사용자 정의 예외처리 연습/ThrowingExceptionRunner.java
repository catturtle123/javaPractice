package exceptionalRunner;

class Amount {
	private int amount;
	private String currency;
	
	public Amount(int amount, String currency) {
		super();
		this.amount = amount;
		this.currency = currency;
	}
	
	public String toString() {
		return amount + " " + currency;
	}
	
	public void add(Amount that) throws CurrencyMatchedException {
		if (!this.currency.equals(that.currency)) {
			throw new CurrencyMatchedException("Currency do not mathced");
		}
		
		this.amount = amount + that.amount;
	}
}

class CurrencyMatchedException extends Exception{
	public CurrencyMatchedException(String msg){
		super(msg);
	}
}

public class ThrowingExceptionRunner {
	public static void main(String[] args) throws CurrencyMatchedException {
		Amount amount1 = new Amount(10,"USD");
		Amount amount2 = new Amount(20, "EUR");
		amount1.add(amount2);
		System.out.println(amount1);
		
	}
}
