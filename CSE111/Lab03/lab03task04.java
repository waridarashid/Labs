import java.util.Scanner;

public class lab03task04{
  public static void main (String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println ("Please enter a word using only capital letters");
    String s = sin.nextLine();
    
    for (int i = 65; i <= 90; i++){
      int count = 0;
      for(int j= 0; j< s.length(); j++){
        if (s.codePointAt(j)==i){
          count++;
        }
      }
      System.out.println ((char)i+" which is " + i + " was found " + count + " times");
    }
  }
}
        
      
    
  
