import java.util.Scanner;

public class Lab05Task05{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println("Please enter the value of N");
    int N = sin.nextInt();
    int num[][] = new int[N][N];
    int row, column;
    
    for (row=0; row<N; row++){
      for (column=0; column<N; column++){
        System.out.println ("Please enter a number");
        num[row][column] = sin.nextInt();
      }
    }
    for (row = 0; row<N; row++){
      for (column=0; column<N; column++){
        System.out.print (num[row][column]+"    ");
      }
      System.out.println();
    }
  }
}
          
      
    
                         
                        