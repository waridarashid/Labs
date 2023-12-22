import java.util.Scanner;

public class lab01task11{
  public static boolean allDigitsOdd(int num){
    boolean bool = true;
    while (num > 0){
      int digit = num%10;
      if (digit % 2 == 0){
        bool = false;
        break;
      }
      num = num/10;
    }
    return bool;
  }
  
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println("enter a number");
    int num = sin.nextInt();
    System.out.println(allDigitsOdd(num));
  }
}

 
      
      
  