import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Warida Rashid on 07 Nov 2015.
 */
public class HuffmanEncoder {
    public CharNode huffmanCompression(String filePath) {

        int arrayLength = 256;
        PriorityQueue<CharNode> pq = new PriorityQueue<CharNode>();
        CharNode[] nodeArray = new CharNode[arrayLength];
        Reader reader = null;
        InputStream inputStream = null;

        //Creates Node for all characters
        for (int i = 0; i < nodeArray.length; i++) {
            CharNode cn = new CharNode((char) i, 0);
            nodeArray[i] = cn;
        }

        //Reads characters from the given file and increases freq
        try {
            inputStream = new FileInputStream(filePath);
            reader = new InputStreamReader(inputStream, "US-ASCII");
            int i = 0;

            while ((i = reader.read()) != -1) {
                ++nodeArray[i].frequency;
                nodeArray[i].isLeaf = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Adds nodes to PriorityQueue pq
        for (int i = 0; i < nodeArray.length; i++) {
            if (nodeArray[i].frequency != 0) {
                pq.add(nodeArray[i]);
            }
        }

        //Building the Huffman Tree
        while (pq.size() > 1) {
            CharNode cn1 = pq.poll();
            CharNode cn2 = pq.poll();
            int frequency = cn1.frequency + cn2.frequency;
            CharNode cn = new CharNode(Integer.MAX_VALUE, frequency);
            cn.left = cn1;
            cn.right = cn2;
            cn1.parent = cn;
            cn2.parent = cn;
            pq.add(cn);
        }
        CharNode root = pq.peek();
        getCode(root, nodeArray);

        //Builds bit string of codes
        StringBuilder bits= new StringBuilder();
        try {
            inputStream = new FileInputStream(filePath);
            reader = new InputStreamReader(inputStream, "US-ASCII");
            int i = 0;

            while ((i = reader.read()) != -1) {
                bits.append(nodeArray[i].code);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Uses ByteReadWrite to write the codes
        HuffmanDecoder hd = new HuffmanDecoder();
        hd.bitLen = bits.length();
        ByteReadWrite brw = new ByteReadWrite();
        brw.compress(bits.toString());
        return root;
    }



    public void getCode(CharNode root, CharNode[] nodeArr) throws NullPointerException {
        if (root.left == null && root.right == null) {
            nodeArr[root.character].code = root.code;
            return;
        } else {
            root.left.code = new StringBuilder(root.code);
            root.left.code.append('0');
            getCode(root.left, nodeArr);
            root.right.code = new StringBuilder(root.code);
            root.right.code.append('1');
            getCode(root.right, nodeArr);
        }
    }
}
