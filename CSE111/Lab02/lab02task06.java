import java.util.Scanner;

public class lab02task06{
  public static void main (String[] args){
    Scanner sin = new Scanner(System.in);
    int[] num = new int[10];
    
    for (int j=0; j<15; j++){
        System.out.println ("Please enter a number within the range 0-9");
        int number = sin.nextInt();
        if (number > 9){
          System.out.println ("The number has to be within 0-9");
          j--;
        }
        
        for (int i=0; i<num.length; i++){
          if (i==number){
            num [i] += 1;
          }
        }
    }
    
    for (int i=0; i< num.length; i++){
      System.out.println (i + " was entered " + num[i] + " times");
    }
  }
}
 
    

      
        

        
      


        
      
  
    