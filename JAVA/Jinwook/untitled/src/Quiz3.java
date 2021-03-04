import java.util.Scanner;

class HorseTime{
    private Scanner scan;
    private int time;
    private final int BASICFEE = 3000;
    private final int ADDFEE = 500;
    private final int BASICTIME =30;
    private int fee;
    public HorseTime(){
        System.out.print("시간을 입력 해주세요: ");
        scan = new Scanner(System.in);
    }
    public void calcTime(){
        time = scan.nextInt();
        System.out.println("총 이용 시간: " + time);
        if(time < BASICTIME){

        }

    }
}
public class Quiz3 {
    public static void main(String[] args) {
        HorseTime ht = new HorseTime();
        ht.calcTime();


    }
}
