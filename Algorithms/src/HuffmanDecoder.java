
import javax.net.ssl.SSLContext;
import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by Warida Rashid on 11 Nov 2015.
 */
public class HuffmanDecoder {
    public static int bitLen;
    public void decode(CharNode root) {
        Charset cs = Charset.forName("ASCII");
        File file = new File("DecodedFile.txt");
        BufferedWriter bout = null;
        try {
            file.createNewFile();
            bout = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),cs));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ByteReadWrite brw = new ByteReadWrite();
        String byteString = brw.getByteString();
        char[] bits = byteString.toCharArray();

        CharNode r = root;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= bitLen; i++) {
            if (r == null) {
                System.out.println("null found");
                break;
            } else if (r.isLeaf) {
                sb.append((char) r.character);
                i--;
                r = root;
            } else if (bits[i] == '1') {
                r = r.right;
            } else {
                r = r.left;
            }
        }
        try {
            bout.write(sb.toString());
            bout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
