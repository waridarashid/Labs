import java.util.Scanner;

public class lab02task06Alternate{
  public static void main (String[] args){
    Scanner sin = new Scanner(System.in);
    int[] num = new int[15];
       
    for (int i=0; i<15; i++){
        System.out.println ("Please enter a number within the range 0-9");
        num[i] = sin.nextInt();
        if (num[i] > 9){
          System.out.println ("The number has to be within 0-9");
          i--;
        }
    }
    
    for (int j=0; j<10; j++){
      int count = 0;
      
      for (int i=0; i<num.length; i++){
        if (j==num[i]){
          count++;
        }
      }
      System.out.println (j + " was entered " + count + " times");
    }
  }
}
            

        
    
    
                                           

    

      
        

        
      


        
      
  
    