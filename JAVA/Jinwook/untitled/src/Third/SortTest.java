package Third;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1>{
    int number;
    String name;
    public Student1(int number, String name){
        this.number = number;
        this.name =name;
    }
    public String toString(){
        return name;
    }
    public int compareTo(Student1 s){
        return number - s.number;
    }
}

public class SortTest {
    public static void main(String[] args) {
        Student1 array[] = {
                new Student1(20210001, "오진욱"),
                new Student1(20210001, "박진욱"),
                new Student1(20210001, "김진욱"),
        };

        List<Student1> list1 = Arrays.asList(array);
        Collections.sort(list1);
        System.out.println("정렬: "+list1);

        Collections.sort(list1,Collections.reverseOrder());
        System.out.println("반대로 정렬: "+list1);
    }
}
