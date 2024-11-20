package studentClassArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class student {
	static ArrayList<Integer> mark = new ArrayList<Integer>(Arrays.asList(100,99,98,29,44,99));
	//function to print the number of mark -> use available
	public int countNumberofMark() {
		return mark.size();
		
	}
	//function to print the number of mark -> rewrite
	public int  countingNumberofMark() {
		int temp_count = 0;
		for(Integer temp_value : mark) {
			temp_count++;
		}
		return temp_count;
	}
	//function to print sum of mark 
	public int countingSumofMark() {
		int temp_sum = 0;
		for(Integer temp_value : mark) {
			temp_sum=temp_sum+temp_value;
		}
		return temp_sum;
	}
	//function to print maximum of mark
	public int printingMaximum() {
		int temp_maximum = mark.get(0);
		for(int i=1;i<mark.size();i++) {
			if(mark.get(i)>temp_maximum) {
				temp_maximum = mark.get(i);
			}
		}
		return temp_maximum;	
	}
	public int printingMinimum() {
		int temp_minimum = mark.get(0);
		for(int i=mark.size()-1;i>=0;i--) {
			if(mark.get(i)<temp_minimum) {
				temp_minimum=mark.get(i);
			}
		}
		return temp_minimum;
	}
	public String addnewMark(int newmark) {
		mark.add(newmark);
		return mark.toString();
		
	}
	public String removenewMark(int newmark) {
		mark.remove(newmark);
		return mark.toString();
	}
  

}
