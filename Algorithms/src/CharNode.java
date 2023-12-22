/**
 * Created by Warida Rashid on 07 Nov 2015.
 */
public class CharNode implements Comparable<CharNode> {
    int character;
    int frequency;
    CharNode left;
    CharNode right;
    CharNode parent;
    boolean isLeaf = false;
    StringBuilder code = new StringBuilder();

    public CharNode(int c, int freq){
        character = c;
        frequency = freq;

    }

    public int compareTo(CharNode o) {
        if (o == null) {
            return 1;
        }
        if (this.frequency > o.frequency) {
            return 1;
        } else if (this.frequency < o.frequency) {
            return -1;
        } else {
            return -1;
        }
    }
}
