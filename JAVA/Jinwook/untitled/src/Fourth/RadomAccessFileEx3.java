package Fourth;

import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RadomAccessFileEx3 {
    public static void main(String[] args) {
        int sum =0;
     try {
         RandomAccessFile raf = new RandomAccessFile("score2.dat", "r");
         int i =0;

         while (true){
             raf.seek(i);

         }
     }
    }
}
