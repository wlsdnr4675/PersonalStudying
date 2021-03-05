package Fourth;

import java.io.*;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        // FileReader에 BufferedReader를 연결한다
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("input.txt"));
            outputStream = new PrintWriter(new FileWriter("output.txt"));
            // FileWriter의 출력이 PrintWriter의 입력이 된다.
            String l;
            while ((l = inputStream.readLine()) != null){
                outputStream.println(l);
            }
            //환불 단위로 입출력 할 수 있다.
        }finally {
            if(inputStream != null){
                if(inputStream != null){
                    inputStream.close();
                }
                if (outputStream != null){
                    outputStream.close();
                }
            }
        }
    }
}
