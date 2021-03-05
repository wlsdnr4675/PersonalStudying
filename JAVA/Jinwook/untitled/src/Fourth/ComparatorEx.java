package Fourth;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        // String의 Comparable구현에 의한 정렬
        Arrays.sort(strArr);
        System.out.println("strArr: " + Arrays.toString(strArr));

        //대소문자 구분 안함
        Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr: " + Arrays.toString(strArr));

        //역순 정렬
        Arrays.sort(strArr, new Descending());
        System.out.println("strArr: " + Arrays.toString(strArr));
    }
}
// Comparator는 커스터마이징해서 정렬할 비교기준 정하기이다
class Descending implements Comparator{
    public int compare(Object o1, Object o2){
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1;
        }
        return -1;
    }
}
