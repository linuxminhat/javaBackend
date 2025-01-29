package CustomException;

class CurrenciesDoNotMatch extends RuntimeException {
	public CurrenciesDoNotMatch(String msg) {
		super(msg);
	}
}
class ForeignCurrencies2 {
	private String nameOfCurrencies;
	private int amountOfCurrencies;
	public ForeignCurrencies2(String nameOfCurrencies, int amountOfCurrencies) {
		super();
		this.nameOfCurrencies=nameOfCurrencies;
		this.amountOfCurrencies=amountOfCurrencies;
	}
	public void addValue(ForeignCurrencies2 that) throws CurrenciesDoNotMatch  {
		if(!this.nameOfCurrencies.equals(that.nameOfCurrencies)) {
			throw new CurrenciesDoNotMatch("Do not match !");
		}
		this.amountOfCurrencies=this.amountOfCurrencies + that.amountOfCurrencies;
	}
	public String toString() {
		return "Name" + "" + nameOfCurrencies + "Amount" + "" + amountOfCurrencies;
	}
}

public class CustomException2 {

}
