import java.util.Scanner;

public class lab03task06{
  public static void main (String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println ("Please enter a word");
    String s = sin.nextLine();
    System.out.println (s);
    System.out.println (s.concat("==THE END=="));
  }
}
    


