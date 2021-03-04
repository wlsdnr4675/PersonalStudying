class myMath{
    int square(int i){
        return i * i;
    }
    double square(double i){
        return i * i;
    }
}
public class MyMathTest {

    public static void main(String[] args) {
        int a =10;
        String s ="Welcome Today";
        myMath mm = new myMath();
        System.out.println(mm.square(10));
        System.out.println(mm.square(3.14));
        System.out.println(a);
        System.out.println(s);
    }
}
