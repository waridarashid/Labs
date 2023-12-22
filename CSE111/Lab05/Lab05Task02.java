import java.util.Scanner;

public class Lab05Task02{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println("Please enter the value of M");
    int M = sin.nextInt();
    System.out.println("Please enter the value of N");
    int N = sin.nextInt();
    int num[][] = new int[M][N];
    int row, column;
    
    for (row = 0; row<M; row++){
      for (column=0; column<N; column++){
        System.out.print (num[row][column]+"    ");
      }
      System.out.println();
    }
  }
}
          
      
    
                         
                        