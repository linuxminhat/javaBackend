package exercise;

public class stringArray {
	
	public static String[] dayofweek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	
	public String findmostnumberletters(String[] dayofweek) {
		this.dayofweek = dayofweek;
		String daymostnumberletter = dayofweek[0];
		int maxlength = daymostnumberletter.length();
		for(int i=1;i<7;i++) {
			if(dayofweek[i].length()>maxlength) {
				maxlength=dayofweek[i].length();
				daymostnumberletter = dayofweek[i];
			}
		}
		return daymostnumberletter;
		
	}
	//Monday 
	public String printDayBackwards(String dayofweek) {
		String dayBackwards = "";
		for(int i=dayofweek.length()-1;i>=0;i--) {
			char temp = dayofweek.charAt(i);
			dayBackwards+=temp;
		}
		return dayBackwards;
	}
	public static void main(String[] args) {
		 stringArray testcase = new stringArray();
//		 System.out.println(testcase.findmostnumberletters(dayofweek));
		 System.out.println(testcase.printDayBackwards("Monday"));
	}

}
