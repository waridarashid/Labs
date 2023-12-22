import java.util.Scanner;

public class lab3extraP03{
  public static void main(String[] args){
    int[] num = new int[10];
    Scanner sin = new Scanner(System.in);
    
    for (int i=0; i<num.length; i++){
      System.out.println("Please enter a number");
      num[i] = sin.nextInt();
    }
    
    for (int i=0; i<num.length-1; i++){
      for (int j = i+1; j<num.length; j++){
        if (num[j]>num[i]){
          int temp = num[i];
          num[i] = num[j];
          num[j] = temp;
        }
      }
    }
    
    for (int i=0; i<num.length; i++){
      System.out.println(num[i]);
    }
  }
}
  