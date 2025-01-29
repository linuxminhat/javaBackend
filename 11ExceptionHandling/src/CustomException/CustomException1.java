package CustomException;
class CurrenciesDoNotMatchEachOther extends Exception {
	public CurrenciesDoNotMatchEachOther(String msg) {
		super(msg);
	}
}
class ForeignCurrency1 {
	private String nameOfCurrency;
	private int amountOfCurrency;
	public ForeignCurrency1(String nameOfCurrency, int amountOfCurrency) {
		this.nameOfCurrency=nameOfCurrency;
		this.amountOfCurrency=amountOfCurrency;
	}
	public void addValueCurrency(ForeignCurrency1 that) throws CurrenciesDoNotMatchEachOther {
		if(!this.nameOfCurrency.equals(that.nameOfCurrency)) {
			this.amountOfCurrency=this.amountOfCurrency+that.amountOfCurrency;
		}else {
			throw new CurrenciesDoNotMatchEachOther("Currenciese do not match");
		}
	}
	public String toString() {
		return "Name" + "" + nameOfCurrency + "" + "Amount" + amountOfCurrency;
	}
}

public class CustomException1 {

}
