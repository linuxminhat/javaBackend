package genericsLearning4;

import java.util.ArrayList;

public class customArrayList<T extends Number> {
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
	public T getElement(int index) {
		return myArrayList.get(index);
	}
	

}
