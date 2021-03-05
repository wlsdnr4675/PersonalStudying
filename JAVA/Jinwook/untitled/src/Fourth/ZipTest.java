package Fourth;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipTest {
    public static void main(String[] args) throws IOException {
        String outputFile = "test.zip";
        int level = 9;
        FileOutputStream fout = new FileOutputStream(outputFile);
        ZipOutputStream zout = new ZipOutputStream(fout);
        zout.setLevel(level);

        ZipEntry entry = new ZipEntry("input.txt");
        FileInputStream fin = new FileInputStream("input.txt");
        zout.putNextEntry(entry);
        for(int c = fin.read(); c != -1; c =fin.read()){
            zout.write(c);
        }
        fin.close();
        zout.close();
    }
}
