package footballer_collections;


public class footballer implements Comparable<footballer> {
	private int baloonDorNumber;
	private String footballerName;
	private String nameClub;
	public footballer(int baloonDorNumber, String footballerName, String nameClub) {
		this.baloonDorNumber=baloonDorNumber;
		this.footballerName=footballerName;
		this.nameClub=nameClub;
	}
	public int getBaloonDorNumber() {
		return baloonDorNumber;
	}
	public String getFootBallerName() {
		return footballerName;
	}
	public String getNameClub() {
		return nameClub;
	}
	public void setBaloonDorNumber(int baloonDorNumber) {
		this.baloonDorNumber=baloonDorNumber;
		
	}
	public void setFootballerName(String footballerName) {
		this.footballerName=footballerName;
		
	}
	public void setnameClub(String nameClub) {
		this.nameClub=nameClub;
	}
	public String toString() {
		return baloonDorNumber + "" + footballerName + "" + nameClub;
		
	}
	@Override
	public int compareTo(footballer that) {
		// TODO Auto-generated method stub
		return Integer.compare(that.baloonDorNumber, this.baloonDorNumber);
		//So sanh thuoc tinh baloonDorNumber cua cac doi tuong 
	}
	
}
