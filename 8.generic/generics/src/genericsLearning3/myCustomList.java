package genericsLearning3;

import java.util.ArrayList;

public class myCustomList<T> {
	ArrayList<T> myArrayList = new ArrayList<T>();
	public void addElement(T element) {
		myArrayList.add(element);
	}
	public void removeElement(T element) {
		myArrayList.remove(element);
	}
	public String toString() {
		return myArrayList.toString();
	}
	public T get(int index) {
		return myArrayList.get(index);
	}
	

}
