import java.util.Scanner;

public class lab03task02{
  public static void main (String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println ("Please enter a word");
    String s = sin.nextLine();
    
    for (int i=0; i<s.length(); i++){
      System.out.println (s.charAt(i));
    }
  }
}
