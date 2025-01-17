package employee_evaluate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class employee_runner {
	public static void main(String[] args) {
		//employee(int iD, String name, int salary, boolean sex, int kPI)
		List<employee> myListEmployee = List.of(new employee(1,"NhatMinh",20,true,1000),
				new employee(2,"DucChung", 25,true,1500),
				new employee(3,"LeMinh", 10,true,500));
		ArrayList<employee> myArrayListEmployee = new ArrayList<employee>(myListEmployee);
		System.out.println(myArrayListEmployee);
		Collections.sort(myArrayListEmployee);
		System.out.println(myArrayListEmployee);
	}

}
