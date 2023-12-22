import com.sun.org.apache.xalan.internal.xsltc.dom.BitArray;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Warida Rashid on 08 Nov 2015.
 */
public class ByteTest {
    public static void writeToFile(String binaryString, OutputStream os) throws IOException {
        int pos = 0;
        while (pos < binaryString.length()) {
            byte nextByte = 0x00;
            for (int i = 0; i < 8 && pos + i < binaryString.length(); i++) {
                switch (nextByte += binaryString.charAt(pos + i) == '0' ? 0x0 : 0x1) {

                }

            }
            os.write(nextByte);
            pos += 8;
        }
    }

    public static void main(String[] args) throws IOException {
        String s = "100101111000";
        OutputStream o = null;
        try {
            o = new FileOutputStream("D:\\aa.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            writeToFile(s, o);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }
}
