package printDayofWeekwithMost;

public class dayOfWeek {
	public  String[] dayWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
//	public dayOfWeek(String[] dayWeek){
//		this.dayWeek=dayWeek;
//	}
	
	//Find the day with most number of letters in it 
	public String  findDaywithMostLetter(String[] dayWeek) {
		this.dayWeek = dayWeek;
		String daywithMostLetter=dayWeek[0];
		int dayLength = daywithMostLetter.length();
		for(int i=1;i<dayWeek.length;i++) {
			if(dayWeek[i].length()>daywithMostLetter.length()) {
				daywithMostLetter = dayWeek[i];
			}
		}
		return daywithMostLetter;
	}

}
