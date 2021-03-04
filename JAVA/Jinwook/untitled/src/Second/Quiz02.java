package Second;
//숫자로 이루어진 문자열 str이 있을때 각 자리의 합을 더한 결과를 출력하는 프로그램을 작성하시오
//예를들면 변수 num의 값이 12345이면 1+2+3+4+5의 결과인 15가 출력 되어야 한다.수
class StrSum{
    private String num;
    private int sum;
    public StrSum(String num){
        this.num = num;
    }

    public void calcSum(){
        sum =0;
        for(int i =0; i <num.length(); i++){
            sum += num.charAt(i) -'0';
        }
        System.out.println(sum);
    }
}



public class Quiz02 {
    public static void main(String[] args) {
        StrSum ss = new StrSum("12345");
        ss.calcSum();
    }

}
