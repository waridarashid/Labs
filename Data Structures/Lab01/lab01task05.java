import java.util.Scanner;

public class lab01task05{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    int[] freq = new int[10];
    
    for(int i=0; i<15; i++){
      System.out.println("Please enter a number");
      freq[sin.nextInt()]++;
    }
    
    for(int i=0; i<freq.length; i++){
      System.out.println (i + " was found " + freq[i] + " times");
    }
  }
}