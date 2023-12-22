import java.util.Scanner;

public class lab05midtask02again{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println("pelase enter a word using capital letters only");
    String s = sin.nextLine();
    int[] count = new int[26];
    
    for (int i=0; i<s.length(); i++){
      count[s.charAt(i) - 'A']++;
    }
    
    int max1 = 0;
    int max2 = 0;
    char c1 = 0;
    char c2 = 0;

    
    for (int i=0; i<count.length; i++){
      if (count[i] > max1){
        max2 = max1;
        c2 = c1;
        max1 = count[i];
        c1 = (char)(i+'A');
      }
      else if (count[i] > max2 && count[i] != max1){
        max2 = count[i];
        c2 = (char)(i+'A');
      }
    }
    System.out.println(c2);
  }
}
      
    