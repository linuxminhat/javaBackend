package Throwing;

class ForeignCurrency4 {
	private String nameOfCurrency;
	private int amountOfCurrency;
	public ForeignCurrency4(String nameOfCurrency, int amountOfCurrency) {
		super();
		this.nameOfCurrency=nameOfCurrency;
		this.amountOfCurrency=amountOfCurrency;
	}
	public String toString() {
		return "Name" + nameOfCurrency + " " + "Amount" + amountOfCurrency;
	}
	public void addValueOfCurrency(ForeignCurrency4 that) throws Exception {
		if(!this.nameOfCurrency.equals(that.nameOfCurrency)) {
			throw new Exception("Not fit Currency Name");
		}
		this.amountOfCurrency = this.amountOfCurrency + that.amountOfCurrency;
	}
}

public class Throwing4 {
	public static void main(String[] args) {
		try {
			ForeignCurrency4 usaCurrency = new ForeignCurrency4("USD", 5000);
			ForeignCurrency4 japanCurrency = new ForeignCurrency4("YEN", 3000);
			ForeignCurrency4 ecuadorCurrency = new ForeignCurrency4("USD",1000);
			usaCurrency.addValueOfCurrency(ecuadorCurrency);
			System.out.println(usaCurrency);
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
	}

}
