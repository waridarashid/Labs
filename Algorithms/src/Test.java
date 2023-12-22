import java.io.*;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by Stealth on 27/06/2014.
 */
public class Test {
    public static void main(String[] args) {
        try {
            String str = "000001001011011011111111";
            String filePath = "C:\\Dev\\Workspace\\Test\\txt.txt";
            System.out.println(str);

            FileOutputStream fos = new FileOutputStream(filePath);

            fos.write(fromBinary(str));
            fos.close();

            Path path = Paths.get(filePath);
            byte[] readBytes = Files.readAllBytes(path);
            String byteStr = toBinary(readBytes);
            System.out.println(byteStr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String toBinary(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * Byte.SIZE);
        for (int i = 0; i < Byte.SIZE * bytes.length; i++)
            sb.append((bytes[i / Byte.SIZE] << i % Byte.SIZE & 0x80) == 0 ? '0' : '1'); // 10000000
        return sb.toString();
    }

    static byte[] fromBinary(String s) {
        int sLen = s.length();
        byte[] toReturn = new byte[(sLen + Byte.SIZE - 1) / Byte.SIZE];
        char c;
        for (int i = 0; i < sLen; i++)
            if ((c = s.charAt(i)) == '1')
                toReturn[i / Byte.SIZE] = (byte) (toReturn[i / Byte.SIZE] | (0x80 >>> (i % Byte.SIZE)));
            else if (c != '0')
                throw new IllegalArgumentException();
        return toReturn;
    }
}
