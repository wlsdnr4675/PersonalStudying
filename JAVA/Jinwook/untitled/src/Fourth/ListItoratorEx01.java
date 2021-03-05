package Fourth;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItoratorEx01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator it  = list.listIterator();

        //순방향으로 진행하면서 읽어옴
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        //역순으로 진행하면서 읽어옴
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
        System.out.println();
    }
}
