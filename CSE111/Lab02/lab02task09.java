import java.util.Scanner;

public class lab02task09{
  public static void main (String[] args){
    Scanner sin = new Scanner(System.in);
    int[] num = new int[10];
       
    for (int i=0; i<num.length; i++){
        System.out.println ("Please enter a number");
        num[i] = sin.nextInt();
    }
    
    for (int i=0; i<num.length; i+=2){
          System.out.println (num[i]);
    }
  }
}
           

        
    
    
                                           

    

      
        

        
      


        
      
  
    