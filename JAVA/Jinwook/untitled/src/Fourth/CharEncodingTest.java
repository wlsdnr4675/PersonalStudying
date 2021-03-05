package Fourth;

import java.io.*;

public class CharEncodingTest {
    public static void main(String[] args) throws IOException {
        File fileDir = new File("input.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF-8"));
        String str;

        while ((str = in.readLine()) != null){
            System.out.println(str);
        }
    }
}
