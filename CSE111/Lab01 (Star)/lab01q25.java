import java.util.Scanner;

public class lab01q25{
  public static void main (String[] aregs){
    Scanner sin = new Scanner(System.in);
    System.out.println ("Please enter a number");
    int num = sin.nextInt();
    int replaceColumn;
    
    for (int row = 1; row <= num; row++){
      for (int column = 1; column <= 2*num - 1; column++){
        if (column > num){
          replaceColumn = num - (column - num);
        }
        else{
          replaceColumn = column;
        }
        if (column <= num - row){
          System.out.print(" ");
        }
        else if (column <= num+row-1){
          System.out.print(replaceColumn-(num-row));
        }
      }
      System.out.println();
    }
  }
}
        
        
        