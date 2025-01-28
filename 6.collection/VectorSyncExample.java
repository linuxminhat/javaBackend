package Collection;

import java.util.List;
import java.util.Vector;

public class VectorSyncExample {
    public static void main(String[] args) {
        List<String> vector = new Vector<>();
        
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                vector.add("Element " + i);
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

        System.out.println("Vector size: " + vector.size());
    }
}

