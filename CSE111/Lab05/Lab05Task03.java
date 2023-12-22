import java.util.Scanner;

public class Lab05Task03{
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
    int num2[][] = new int [M][N];
    
    for (row =0; row<M; row++){
      for (column=0; column<N; column++){
        num2[row][column] = num[row][column];
      }
    }
    
    for (row = 0; row<M; row++){
      for (column=0; column<N; column++){
        System.out.print (num2[row][column]+"    ");
      }
      System.out.println();
    }
  }
}
          
      
    
                         
                        