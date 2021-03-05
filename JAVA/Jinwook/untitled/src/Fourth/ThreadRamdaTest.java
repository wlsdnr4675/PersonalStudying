package Fourth;

public class ThreadRamdaTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            for(int i = 10; i >=0; i--){
                System.out.println(i);
            }
        };
        new Thread(task).start();
    }
}
