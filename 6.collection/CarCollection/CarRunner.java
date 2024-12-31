package CarCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CarRunner {
	public static void main(String[] args) {
		//Car(String name,int id,boolean discount)
//		List<Car> myCollections =new ArrayList<>(Arrays.asList(new Car("Honda",1,true),
//				new Car("Toyota",2,false)
//				));
		List<Car> myCollections2 = List.of(new Car("Honda",1,true),
				new Car("Toyota",2,false)
				);
		 Collections.sort(myCollections2);
		 System.out.println(myCollections2);
		 
		
		
		
	}

}
