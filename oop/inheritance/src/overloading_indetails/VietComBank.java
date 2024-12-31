package overloading_indetails;

public class VietComBank extends bankInterest {
	public int getRateOfInterest(int interest){
		this.interest=interest;
		return interest;
	}

}
