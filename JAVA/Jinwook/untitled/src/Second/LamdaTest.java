package Second;
interface MyInterface{
    public void calculate(int x, int y);
}
public class LamdaTest {
    public static void main(String[] args) {
        MyInterface hello = (a,b) -> {
            int result = a* b;
            System.out.println(result);
        };
        hello.calculate(10,20);
    }
}
