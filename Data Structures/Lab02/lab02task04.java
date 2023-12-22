import java.util.Scanner;

public class lab02task04{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println ("Enter the size");
    int col = sin.nextInt();
    int[][] num = new int[2][col];
    System.out.println(num.length);
         
    for (int i=0; i < num.length; i++){
      for (int j = 0; j < num[i].length; j++){
        System.out.println("enter a number");
        num[i][j] = sin.nextInt();
      }
    }
    int[][] c = new int[1][col];
    
    for (int i=0; i < col; i++){
      c[0][i] = (5 * num[0][i]) - num[1][i];
    }
    
    for (int i=0; i < col; i++){
      System.out.println(c[0][i]);
    }
  }
}