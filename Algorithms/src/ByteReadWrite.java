import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Warida Rashid on 09 Nov 2015.
 */
public class ByteReadWrite {
    public String filePath = "CompressedFile.txt";

    public String compress(String str) {
        try {
            File file = new File(filePath);
            file.createNewFile();

            FileOutputStream fos = new FileOutputStream(filePath);
            fos.write(fromBinary(str));
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filePath;
    }

    public String getByteString() {
        Path path = Paths.get(filePath);
        byte[] readBytes = new byte[0];
        try {
            readBytes = Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String byteStr = toBinary(readBytes);
        return byteStr;
    }

    String toBinary(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * Byte.SIZE);
        for (int i = 0; i < Byte.SIZE * bytes.length; i++) {
            sb.append((bytes[i / Byte.SIZE] << i % Byte.SIZE & 0x80) == 0 ? '0' : '1'); // 10000000
        }
        return sb.toString();
    }

    byte[] fromBinary(String s) {
        int sLen = s.length();
        byte[] toReturn = new byte[(sLen + Byte.SIZE - 1) / Byte.SIZE];
        char c;
        for (int i = 0; i < sLen; i++) {
            if ((c = s.charAt(i)) == '1') {
                toReturn[i / Byte.SIZE] = (byte) (toReturn[i / Byte.SIZE] | (0x80 >>> (i % Byte.SIZE)));
            } else if (c != '0') {
                throw new IllegalArgumentException();
            }
        }
        return toReturn;
    }
}


