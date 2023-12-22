import java.util.Scanner;

public class lab01task06{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println ("enter size");
    int[] num = new int[sin.nextInt()];
    
    for(int i=0; i<num.length; i++){
      System.out.println("Please enter a number");
      num[i] = sin.nextInt();
    }
    
    if (num.length % 2 == 0){
      int i;
      for(i=0; i < num.length/2; i++){
        if (num[i] != num[num.length - (i+1)]){
          break;
        }
      }
      if (i != num.length/2){
        System.out.println ("not palindrome");
      }
      else{
        System.out.println ("palindrome");
      }
    }
    
    else{
      int i;
      for(i=0; i < (num.length-1)/2; i++){
        if (num[i] != num[num.length - (i+1)]){
          break;
        }
      }
      if (i != (num.length-1)/2){
        System.out.println ("not palindrome");
      }
      else{
        System.out.println ("palindrome");
      }
    }
  }
}
      
        
          
    
        
        
        