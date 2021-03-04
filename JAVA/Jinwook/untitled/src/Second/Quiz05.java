package Second;

import java.util.Scanner;

//변수 money의 금액을 동전으로 바꾸었을 때 각각 몇개의 동전이 필요한지 계산해서 출력하라 단,가능한 적은 수의 동전으로 거슬러 주어야 한다
//(1)에 알맞은 코들르 넣어서 프로그램을 완성하시오
class ChangeMoney{
    private Scanner scan;
    private int money;
    private final int FIVEHUNDRED = 500;
    private final int ONEHUNDRED = 100;
    private final int FIFTH = 50;
    private final int TEN = 10;

    public void calcMoney(){
        int [] coinUnit = {FIVEHUNDRED, ONEHUNDRED, FIFTH, TEN};
        money = 2680;

    }
}
public class Quiz05 {
}
