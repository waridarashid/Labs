import java.util.Scanner;

public class lab05task11{
  public static void main (String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println ("please enter the number of rows");
    int row1 = sin.nextInt();
    System.out.println ("please enter the number of columns");
    int column1 = sin.nextInt();
    int[][]num1 = new int[row1][column1];
    System.out.println ("please enter the value of column");
    int column2 = sin.nextInt();
    int[][]num2 = new int[column1][column2];
    
    for (int row=0; row<row1; row++){
      for (int column=0; column<column1; column++){
        System.out.println("Please enter the number for the 1st matrix");
        num1[row][column] = sin.nextInt();
      }
    }
    
    for (int row=0; row<column1; row++){
      for (int column=0; column<column2; column++){
        System.out.println("Please enter the number for the 2nd matrix");
        num2[row][column] = sin.nextInt();
      }
    }
    int product[][] = new int[row1][column2];
    
    for (int row=0; row<row1; row++){
      for (int column=0; column<column2; column++){
        int sum = 0;
        for (int i=0; i<column1; i++){
          sum += num1[row][i]*num2[i][column];
        }
        product[row][column] = sum;
      }
    }
    
    for (int row=0; row<row1; row++){
      for (int column=0; column<column2; column++){
        System.out.print(product[row][column]+"         ");
      }
      System.out.println();
    }
  }
}
   
      


          
          
          
         
        
        
      
    

    
    
    
    
    
    
    
    
    
    
    
    
    