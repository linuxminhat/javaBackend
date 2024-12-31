package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSyncExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                arrayList.add("Element " + i);
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ArrayList size: " + arrayList.size());
    }
}
