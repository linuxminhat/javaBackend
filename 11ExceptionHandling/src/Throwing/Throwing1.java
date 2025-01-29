package Throwing;
class CurrenciesDoNotMatchException extends RuntimeException {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

class Amount {
	private String currency;
	private int amount;
	public Amount(String currency, int amount) {
		super();
		this.currency=currency;
		this.amount=amount;
	}
	public void add(Amount other) throws CurrenciesDoNotMatchException {
		if(!this.currency.equals(other.currency)) {
			throw new CurrenciesDoNotMatchException("Currencies do not match each other !");
		}else {
			this.amount = this.amount + other.amount;//tham chieu den thuoc tinh "amount" cua doi tuong other
			
		}
	}
	public String toString() {
		return amount + " " + currency;
	}
}
public class Throwing1 {
	public static void main(String[] args) throws Exception {
		Amount amount1 = new Amount("USD",100);
		Amount amount2 = new Amount("YEN",200);
		try {
			amount1.add(amount2);
			System.out.println(amount1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Currencies Dont Match");
		}

	}

}
