package Fourth;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerDataTest {
    public static void main(String[] args) throws IOException {
        Scanner s = null;
        double sum = 0;
        PrintWriter out =null;

        out = new PrintWriter(new FileWriter("output.txt"));
        out.println("9.5");
        out.println("567,000");
        out.flush();
    }
}
