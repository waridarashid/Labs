import java.util.Scanner;

public class lab02task07{
  public static void main (String[] args){
    Scanner sin = new Scanner(System.in);
    int[] num = new int[10];
       
    for (int i=0; i<num.length; i++){
        System.out.println ("Please enter a number");
        num[i] = sin.nextInt();
        int j;
        
        for (j=0; j<i; j++){
          if (num[i] == num[j]){
            System.out.println ("Please enter a different number");
            num [i] = sin.nextInt();
            j=-1;
          }
        }
    }
  }
}
        
        
 
            

        
    
    
                                           

    

      
        

        
      


        
      
  
    