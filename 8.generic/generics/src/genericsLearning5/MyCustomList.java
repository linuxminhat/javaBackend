package genericsLearning5;

import java.util.ArrayList;

public class MyCustomList<T extends Number> {
	ArrayList<T> myCustomList = new ArrayList<T>();
	public void addElement(T element) {
		myCustomList.add(element);
	}
	public void removeElement(T element) {
		
		myCustomList.remove(element);
	}
	public String toString() {
		return myCustomList.toString();
	}
	public T getElement(int index) {
		return myCustomList.get(index);
	}
	

}
