import java.util.Scanner;

public class lab01task04{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    int[] num = new int[10];
    
    for(int i=0; i<num.length; i++){
      System.out.println("Please enter a number");
      num[i] = sin.nextInt();
      
      for(int j=0; j<i; j++){
        if (num[i] == num[j]){
          System.out.println ("Enter a different number");
          num [i] = sin.nextInt();
          j = -1;
        }
      }
    }
    
    for(int i=0; i<num.length; i++){
      System.out.println(num[i]);    
    }
  }
}
   