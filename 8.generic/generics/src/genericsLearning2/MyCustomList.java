package genericsLearning2;

import java.util.ArrayList;

public class MyCustomList<T> {
	
	ArrayList<T> myList = new ArrayList<T>();
	public void addElement(T element) {
		myList.add(element);
	}
	public void removeElement(T element) {
		myList.remove(element);
	}
	public String toString() {
		return myList.toString();
	}
	
	
}
