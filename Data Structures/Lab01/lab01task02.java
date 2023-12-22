import java.util.Scanner;

public class lab01task02{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    int[] num =  new int[10];
    
    for (int i=0; i < num.length; i++){
      System.out.println("Pelase enter a number");
        num[i] = sin.nextInt();
    }
    int maxPos=0, minPos=0, max = num[0], min = num[0];
    
    for (int i=0; i < num.length-1; i++){
      for (int j =i+1; j< num.length; j++){
        if (i==0){  
          if (num[j] > max){
            maxPos = j;
            max = num[j];
          }
          else if (num[j] < min){
            minPos = j;
            min = num[j];
          }
        }
        if (num[i] < num[j]){
          int temp = num[j];
          num[j] = num [i];
          num[i] = temp;
        }
      }
    }
    System.out.println("max Position = " + maxPos);
    System.out.println("min Position = " + minPos);
    
    for (int i = 0; i < num.length; i++){
      System.out.println(num[i]);
    }
  }
}
          
    
        
    
