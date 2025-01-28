//package review3;
//
//import java.util.List;
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
//
//class Task1 implements Callable<String> {
//    String myName;
//
//    public Task1(String myName) {
//        this.myName = myName;
//    }
//
//    @Override
//    public String call() throws Exception {
//        return "Hello " + myName;
//    }
//}
//
//public class Callable1 {
//    public static void main(String[] args) throws InterruptedException {
//        // Tạo thread pool với 2 luồng
//        ExecutorService myService = Executors.newFixedThreadPool(2);
//
//        // Tạo danh sách các Callable
//        List<Callable<String>> listTask = List.of(
//            new Task1("DangNhatMinh"),
//            new Task1("NguyenDucChung")
//        );
//
//        // Sử dụng invokeAll() để gửi danh sách Callable
//        List<Future<String>> myTaskResult = myService.invokeAll(listTask);
//
//        // Duyệt qua từng Future để lấy kết quả
//        for (Future<String> future : myTaskResult) {
//            try {
//                // Gọi future.get() để lấy kết quả từ Callable
//                System.out.println(future.get());
//            } catch (Exception e) {
//                e.printStackTrace(); // Xử lý lỗi nếu xảy ra trong Callable
//            }
//        }
//
//        // Tắt ExecutorService sau khi hoàn thành công việc
//        myService.shutdown();
//    }
//}
