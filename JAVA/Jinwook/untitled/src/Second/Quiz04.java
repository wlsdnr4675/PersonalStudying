package Second;

import java.util.Scanner;

//사용자로부터 값을 받아서 5명의 성적을 배열에 채운 후에 배열을 매개변수로 받는 메소드를 작하여 배열에 저장된 모든값의 평균을 구하는 프로그램
class Average{
    private Scanner scan1 = new Scanner(System.in);
    private int sum;
    private int avg;
    private int [] arr;
    private int num;
    public void addArr(){
        arr = new int[5];
        for(int i = 0; i <arr.length; i++){
            num = scan1.nextInt();
            arr[i] =num;
        }
    }
    public void calcArr(){
        sum= 0;
        for(int i =0; i <arr.length; i++){
            sum +=arr[i];
        }
        avg = sum/arr.length;
        System.out.println(avg);
    }
}

public class Quiz04 {
    public static void main(String[] args) {
        Average av = new Average();
        av.addArr();
        av.calcArr();
    }
}
