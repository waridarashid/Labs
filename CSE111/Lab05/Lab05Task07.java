import java.util.Scanner;

public class Lab05Task07{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println("Please enter the value of M");
    int M = sin.nextInt();
    System.out.println("Please enter the value of N");
    int N = sin.nextInt();
    int num[][] = new int[M][N];
    int row, column;
    
    for (row=0; row<M; row++){
      for (column=0; column<N; column++){
        System.out.println ("Please enter a number");
        num[row][column] = sin.nextInt();
      }
    }
    int transposed[][] = new int[N][M];
    
    
    for (row=0; row<M; row++){
      for (column=0; column<N; column++){
        transposed[column][row] = num[row][column];
      }
    }
    
    for (row = 0; row<N; row++){
      for (column=0; column<M; column++){
        System.out.print (transposed[row][column]+"    ");
      }
      System.out.println();
    }
  }
}
          
      
    
                         
                        