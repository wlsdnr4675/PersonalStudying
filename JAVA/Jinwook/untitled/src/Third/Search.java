package Third;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Search {
    public static void main(String[] args) {
        int key = 51;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 100; i+=2){
            list.add(i);
        }
        int index = Collections.binarySearch(list,key);
        if(index < 0){
            list.add(-index-1);
        }
        System.out.println("탑색의 반환값 = " + index);
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + "  ");
        }
    }
}
