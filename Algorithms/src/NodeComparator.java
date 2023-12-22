    import java.util.Comparator;

    /**
     * Created by Warida Rashid on 06 Nov 2015.
     */
    public class NodeComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
            if (o1.distance > o2.distance) {
                return 1;
            } else if (o1.distance == o2.distance){
                if (o1.val > o2.val){
                    return 1;
                }
                else{
                    return -1;
                }
            }else{
                return -1;
            }
        }
    }
