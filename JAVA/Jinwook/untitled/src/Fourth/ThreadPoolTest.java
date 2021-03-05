package Fourth;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for(int i =10; i >=0; i--){
                System.out.println("첫번째 쓰레드: " + i);
            }
        };
        Runnable r2  = () -> {
            for(int i =10; i >=0; i--){
                System.out.println("두번째 쓰레드: " + i);
            }
        };

        Executor executor = Executors.newCachedThreadPool();
        executor.execute(r1);
        executor.execute(r2);
    }
}
