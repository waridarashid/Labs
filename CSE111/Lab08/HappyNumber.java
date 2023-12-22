import java.util.Scanner;

public class HappyNumber{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println("Please enter the number of inputs");
    int inputCount = sin.nextInt();
    
    for (int i=0; i<inputCount; i++){
      System.out.println("Please enter an integer");
      int input = sin.nextInt();
      int num = input;
      int sum = 0;
      
      while(sum!=1 && sum!= 4){
        if(sum != 0){
          num = sum;
        }
        for (sum = 0; num > 0; num=num/10){
          int digit = num%10;
          sum += digit*digit;
        }        
      }
      if(sum==1){
        System.out.println("Happy");
      }
      else if(sum == 4){
        System.out.println("Unhappy");
      }
    }
  }
}
     
    

      
       
      
      
    
    
        
       
      