package Second;
//1+(1+2)+(1+2+3)+(1+2+3+4)+.....+(1+2+3+4+....+10)
//1 3 6 10
class ArrSumNum{
    private final int FIRST = 1;
    private final int LAST = 10;
    private final int START = 0;
    private int res;
    private int calc;
   public void calcNum(){
       res = 0;
       calc =0;
       for(int i = START; i < LAST; i++){
           calc += (i + 1);
//           System.out.println(calc);
           res += calc;
       }
       System.out.println(res);
   }

}
public class Quiz01 {
    public static void main(String[] args) {
    ArrSumNum asn =new ArrSumNum();
    asn.calcNum();
    }
}
