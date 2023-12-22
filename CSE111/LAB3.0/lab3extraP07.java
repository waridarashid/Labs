import java.util.Scanner;

public class lab3extraP07{
  public static void main (String[] args){
    int[] num = new int[11];
    Scanner sin = new Scanner(System.in);
    
    //Takes 11 inputs from the user
    for (int i=0; i<11; i++){
      System.out.println("Please enter a number");
      num [i] = sin.nextInt();
      int j;         
      int count=1;
      
      for(j=0; j<i; j++){
        if (num[i] == num[j]){
          count++;
        }
        if (count==5){
          System.out.println ("Please enter a different number");
          num [i] = sin.nextInt();
          j = -1;
          count = 1;
        }
      }
    }
  }
  
}
    
          
      