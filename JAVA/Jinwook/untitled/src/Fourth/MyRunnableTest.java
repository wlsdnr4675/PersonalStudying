package Fourth;
class MyRunnable implements Runnable{
    public void run(){
        for(int i = 20; i >=0; i--){
            System.out.print(i + " ");
        }
    }
}
public class MyRunnableTest {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
