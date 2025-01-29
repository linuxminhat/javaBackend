package Throwing;
class ForeignCurrency {
	private String nameCurrency;
	private int amount;
	public ForeignCurrency(String nameCurrency, int amount) {
		super();
		this.nameCurrency=nameCurrency;
		this.amount=amount;
	}
	public void add(ForeignCurrency other) {
		if(!this.nameCurrency.equals(other.nameCurrency)) {
			throw new RuntimeException("Currencies dont match");
		}
		this.amount = this.amount + other.amount;
	}
	public String toString() {
		return nameCurrency + " " + amount ;
	}
}
public class Throwing2 {
	public static void main(String[] args) {
		ForeignCurrency USACurrency = new ForeignCurrency("USD", 3000);
		ForeignCurrency USCurrency = new ForeignCurrency("USD",500);
		ForeignCurrency EUROPECurrency = new ForeignCurrency("EUROPE",2000);
		ForeignCurrency YENCurrency = new ForeignCurrency("YEN",1000);
		USACurrency.add(USCurrency);
		EUROPECurrency.add(YENCurrency);
		System.out.println(USACurrency);
		System.out.println(EUROPECurrency);
		
	}

}
