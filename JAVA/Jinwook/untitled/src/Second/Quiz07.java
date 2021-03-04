package Second;
//두점의 거리를 계산하는 프로그램을 static메소드인 getDistance()를 사용하여 작성하시오
class Quiz07_01{
    static double getDistance(int x, int y, int x1, int y1){
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }
}
public class Quiz07 {
    public static void main(String[] args) {
        Quiz07_01 q= new Quiz07_01();
        System.out.println(q.getDistance(1,1,2,2));
    }
}
