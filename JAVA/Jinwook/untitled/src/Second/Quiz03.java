package Second;
//int타입의 변수 num이 있을때, 각 자리의 합을 더한 결과를 출력하는 프로그램을 작성하시오
//예를들면 변 num의 값이 12345이면 1+2+3+4+5의 결과인 15가 출력 되어야 한다.
class IntSum{
    private int num;
    private int sum;
    private int tmp;
    public IntSum(int num){
        this.num = num;
    }

    public void calcSum() {
        sum = 0;
        tmp = num;
        while (tmp != 0){
            sum += (tmp % 10);
            tmp -= (tmp % 10);
            tmp /= 10;
        }
        System.out.println(sum);
    }
}


public class Quiz03 {
    public static void main(String[] args) {
        IntSum is = new IntSum(12345);
        is.calcSum();

    }
}
