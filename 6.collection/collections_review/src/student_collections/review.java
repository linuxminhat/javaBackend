package student_collections;

import java.util.ArrayList;
import java.util.List;

public class review {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(List.of(32, 43, 1, 55, 232, 77));
        System.out.println("Before Sorting: " + myList);

        // Sắp xếp bằng cách cung cấp Comparator
        myList.sort(Integer::compareTo);

        System.out.println("After Sorting: " + myList);
    }
}
