package Second;
//아래와 같이 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 '*'을 찍어서 아래 그림처럼 출려하는 프로그램을 작성
// 3***
// 2**
// 2**
// 4****
public class Quiz06 {
    public static void main(String[] args) {
        int [] answer = {1,4,4,3,1,4,4,2,1,3,2};
        int [] counter = new int[4];
        for(int i =0; i <answer.length; i++){
            counter[answer[i]-1]++;
        }
        for(int i =0; i < counter.length; i++){
            System.out.println(counter[i]);
            for(int j =0; j<counter[i]; j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
