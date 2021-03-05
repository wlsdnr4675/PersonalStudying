package Fourth;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            //바이트 단위로 input하고 output 하는것
            in = new FileInputStream(".idea/input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
        }
        finally {
            if(in != null)
                in.close();
            if(out != null)
                out.close();
        }
    }
}
