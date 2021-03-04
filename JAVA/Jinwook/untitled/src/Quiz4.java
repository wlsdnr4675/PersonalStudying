import java.util.Scanner;

class DeliveryBento{
    private Scanner scan;
    private int bentoNum;
    private int totalPrice;

    private final int BASICNUM = 10;
    private final int BASICPRICE = 5000;
    private final int ADDPRICE = 4800;
    public DeliveryBento(){
        this.scan = new Scanner(System.in);
    }
    public void calcBentoPrice(){
        totalPrice = 0;
        System.out.print("도시락 주문 개수:");
        bentoNum = scan.nextInt();
        for(int i = 1; i <=bentoNum; i ++){
            if(bentoNum <= BASICNUM){
                totalPrice += BASICPRICE;
            }else {
            }
        }
        System.out.println(totalPrice);
    }
}

public class Quiz4 {
    public static void main(String[] args) {

    }
}
