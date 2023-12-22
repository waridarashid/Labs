import java.util.Scanner;

public class lab01task03{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    int[] num = new int[5];
    
    for(int i=0; i<num.length; i++){
      System.out.println("Please enter a number");
      num[i] = sin.nextInt();
    }
    for(int i=0; i<num.length-1; i++){
      for(int j=i+1; j < num.length; j++){
        if (num[i] > num[j]){
          int temp = num[j];
          num[j] = num[i];
          num[i] = temp; 
        }
      }
    }
    
    for(int i=0; i<num.length; i++){
      System.out.println(num[i]);
    }
    
    for(int i=0; i<num.length; i++){
      if(num[i] %2 == 0){
        System.out.println(num[i]);
      }
    }
  }
}
