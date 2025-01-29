package Throwing;

class ForeignCurrency5 {
	private String nameOfCurrency;
	private int amountOfCurrency;
	public ForeignCurrency5(String nameOfCurrency, int amountOfCurrency) {
//		super();
		this.nameOfCurrency=nameOfCurrency;
		this.amountOfCurrency=amountOfCurrency;
	}
	public void addValue(ForeignCurrency5 that) {
		this.amountOfCurrency=this.amountOfCurrency+that.amountOfCurrency;
	}
	public String toString() {
		return "Name" + nameOfCurrency + "Amount" + amountOfCurrency;
	}
}

public class Throwing5 {
	public static void main(String[] args) {
		try {
			ForeignCurrency5 usaCurrency = new ForeignCurrency5("USD", 5000);
			ForeignCurrency5 japanCurrency = new ForeignCurrency5("YEN", 4000);
			ForeignCurrency5 ecuadorCurrency = new ForeignCurrency5("USD", 5000);
			usaCurrency.addValue(ecuadorCurrency);
			System.out.println(usaCurrency);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
