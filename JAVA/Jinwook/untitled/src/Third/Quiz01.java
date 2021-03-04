package Third;

import java.util.InputMismatchException;
import java.util.Scanner;

class RandomNumGame{
    private Scanner scan;
    private int randNum;
    private int userNum;
    private int comNum;
    private int cnt;
    boolean isMatch =false;
    boolean isInt;
  public RandomNumGame(){
      scan = new Scanner(System.in);
      comNum = (int)(Math.random()*100)+1;
      System.out.println(comNum);


  }
  public void RandomCorrectGame(){

      do{
          while (true) {
              try {
                  System.out.print("값을 입력하세요: ");
                  userNum = scan.nextInt();
                  break;
              } catch (InputMismatchException e) {
                  System.out.println("잘못된 값입니다. 숫자를 입력하세요");
                  scan = new Scanner(System.in);
              }
          }
          cnt++;
          if(userNum > comNum){
              System.out.println("더 작은수를 입력하세요");
              isMatch = true;
              continue;
          }else if(userNum < comNum){
              System.out.println("더 큰 수를 입력하세요");
              isMatch = true;
              continue;
          }
          else {
              System.out.println("정답입니다.");
              System.out.println("시도 횟수: " + cnt);

          }
          isMatch = false;



      }while (isMatch);

  }
//  public boolean isNumber (String str){
//      char tempCh;
//      int dotCount = 0;
//      boolean result = true;
//      for(int i = 0; i < str.length(); i++){
//          tempCh = str.charAt(i);
//          if((int)tempCh <48 || (int)tempCh >57){
//              if((int)tempCh !='.' || dotCount > 0){
//                  result = false;
//                  break;
//              }else {
//                  dotCount++;
//              }
//          }
//      }
//      return result;
//  }
}
public class Quiz01 {
    public static void main(String[] args) {
        RandomNumGame rg = new RandomNumGame();
        rg.RandomCorrectGame();
    }
}
