class OrderNum{
    private int num;
    private int sum;
    public void evenNum(){
        sum = 0;
        for(int i = 0; i < 100; i++){
            if(i % 2 == 0){
                num = i;
                sum +=num;
                System.out.println("2의 배수: " + num);
            }
        }
    }
    public void printSum(){
        System.out.println("2의 배수의 합: " + sum);
    }

}

public class Quiz {
    public static void main(String[] args) {
        OrderNum on = new OrderNum();
        on.evenNum();
        on.printSum();

    }
}
