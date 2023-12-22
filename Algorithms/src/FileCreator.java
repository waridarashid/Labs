
import java.io.*;
import java.nio.charset.Charset;
import java.util.Random;

/**
 * Created by Warida Rashid on 05 Nov 2015.
 */

//Creates the 7MB file. Then calls the huffmanCompression method in the HuffmanEncoder class

public class FileCreator {
    public static void main(String[] args) throws IOException {
        String fileName = "AsciiFileToCompress.txt";
        Charset cs = Charset.forName("ASCII");
        File file = new File(fileName);
        file.createNewFile();
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),cs));
        char[] chars = new char[256];
        int chLen = chars.length;
        int limit = 3*1024*1024;
        Random r = new Random();

        for (int i = 32; i < 127; i++) {
            chars[i] = (char) i;
        }
        int j = -1;
        int index;
        for (int i = 0; i < 4*1024*1024; i++){
            output.write('a');
        }

        for (int i = 0; i < limit; ++i) {
            if (i % 10 == 0) {
                j++;
                index = j % 127;
            } else {
                index = r.nextInt(chLen);
            }
            output.write(chars[index]);
        }
        output.close();
        HuffmanEncoder huffmanCoding = new HuffmanEncoder();
        CharNode root = huffmanCoding.huffmanCompression(fileName);
        HuffmanDecoder hd = new HuffmanDecoder();
        hd.decode(root);
    }
}
