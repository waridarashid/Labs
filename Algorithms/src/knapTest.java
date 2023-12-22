/**
 * Created by Warida Rashid on 17 Nov 2015.
 */
public class knapTest {
    public static void main(String[] args) {
        int[] weights = {1,5,3,4};
        int[] values = {15,10,9,5};
        int capacity = 8;
        int[][] knapsack = new int[weights.length + 1][capacity + 1];

        for (int w = 0; w <= weights.length; w++) {
            for (int c = 0; c <= capacity; c++) {
                if (w == 0 || c == 0) {
                    knapsack[w][c] = 0;
                } else {
                    boolean flag = false;
                    int notTaken = knapsack[w - 1][c];
                    if (weights[w-1] <= c) {
                        int taken = values[w-1] + knapsack[w - 1][c - weights[w-1]];
                        if (taken > notTaken) {
                            flag = true;
                            knapsack[w][c] = taken;
                        }
                    }
                    if (!flag) {
                        knapsack[w][c] = notTaken;
                    }
                }
            }

        }
        //printing
        for (int w = 0; w <= weights.length; w++) {
            for (int c = 0; c <= capacity; c++) {
                System.out.print(knapsack[w][c] + "   ");
            }
            System.out.println();
        }

        //backtracking
        int [] items = new int[weights.length];
        for (int w = weights.length; w > 0; w--){
            for (int c = capacity; c > 0;){
                if (knapsack[w][c] != knapsack[w-1][c]){
                    items[w-1] = 1;
                    c = c - knapsack[w][c];
                }
            }
        }


        for (int i=0; i < items.length; i++){
            if (items[i] == 1){
                System.out.print(weights[i] + "  ");
            }
        }


    }
}
