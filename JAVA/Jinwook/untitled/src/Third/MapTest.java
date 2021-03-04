package Third;

import java.util.HashMap;
import java.util.Map;

class Student{
    int number;
    String name;
    public Student (int number, String name){
        this.number = number;
        this.name = name;
    }
    public String toString(){
        return name;
    }

}
public class MapTest {
    public static void main(String[] args) {
        Map<String, Student> st = new HashMap<String, Student>();
        st.put("20210001", new Student(20210001, "츄"));
        st.put("20210002", new Student(20210002, "우기"));
        st.put("20210003", new Student(20210003, "주다사"));

        System.out.println(st);

        st.remove("20210002");
        st.put("20210003", new Student(20210003,"박신혜"));
        System.out.println(st.get("20210003"));

//        for (Map.Entry<String, Student> s : st.entrySet()){
//            String key = s.getKey();
//            Student value = s.getValue();
//            System.out.println("key=" + key +", value=" + value);
//        }

        st.forEach((key,value) ->{
            System.out.println("key=" + key +", value=" + value);
        });

    }
}
