package Fourth;
class Counter{
    private int value = 0;
    // value ++ 은
    // 변수 value 의 현재 값을 가져옴;
    // 현재값을 ++해준다
    // 증가된 값을 다시 변수 value에 저장한다.
    public synchronized void increment() { value ++;}
    public synchronized void decrement() { value --;}
    public synchronized void printCounter(){
        System.out.println(value);
    }
}
// 실행결과는 컴퓨터와 상황에 따라서 상당히 달라진다.
// 스레드 간섭이 없다면 모두 0이 출력되어야 한다.
class MyThread0 extends Thread{
    Counter sharedCounter;
    public MyThread0(Counter c){
        this. sharedCounter = c;
    }
    public void run(){
        int i =0;
        while (i < 20000){
            sharedCounter.increment();
            sharedCounter.decrement();
            if(i % 40  == 0){
                sharedCounter.printCounter();
            }
            try {
                sleep((int)(Math.random()*2));
            }catch (InterruptedException e){

            } i++;
        }
    }
}

public class CounterTest {
    public static void main(String[] args) {
        Counter c = new Counter();
        new MyThread0(c).start();
        new MyThread0(c).start();
        new MyThread0(c).start();
        new MyThread0(c).start();
    }
}
