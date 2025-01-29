package Throwing;

class ForeignCurrency3 {
	private String currencyName;
	private int amount;
	public ForeignCurrency3(String currencyName,int amount) {
		this.currencyName=currencyName;
		this.amount=amount;
	}
	public void addValue(ForeignCurrency3 that) throws Exception {
		if(this.currencyName.equals(that.currencyName)) {
			this.amount = this.amount + that.amount;
		} else {
			throw new Exception("Currency not fit each other ");
		}
	}
	public String toString() {
		return "The name of Currency is" + currencyName + " " + "The amount is" + amount;
	}
}

public class Throwing3 {
	public static void main(String[] args) {
		try {
			ForeignCurrency3 usCurrency = new ForeignCurrency3("USD",3000);
			ForeignCurrency3 usaCurrency = new ForeignCurrency3("USD",1000);
			ForeignCurrency3 japanCurrency = new ForeignCurrency3("YEN",2000);
			usCurrency.addValue(usaCurrency);
			System.out.println(usCurrency);	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
