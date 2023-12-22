import java.util.Scanner;

public class lab03task01{
  public static void main (String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println ("Please enter a word");
    String s = sin.nextLine();
    System.out.println (s.length());
  }
}