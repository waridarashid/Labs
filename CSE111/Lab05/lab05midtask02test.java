import java.util.Scanner;

public class lab05midtask02test{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println("pelase enter a word using capital letters only");
    String s = sin.nextLine();
    int[] count = new int[26];
    
    for (int i=0; i<s.length(); i++){
      count[s.charAt(i) - 'A']++;
    }
    char max1 = s.charAt(0);
    char max2 = s.charAt(1);
    
    for (int i=1; i<s.length(); i++){
      if (count[s.charAt(i)-'A'] > count[max1-'A']){
        char temp = max1;
        max1 = s.charAt(i);
        max2 = temp;
      }
      else if (count[s.charAt(i)-'A'] > count[max2-'A'] && count[s.charAt(i)- 'A'] != count[max1-'A']){                                                                                                            
        max2 = s.charAt(i);
      }
      System.out.println ("max1= "+ (char)max1+" max2= " + (char)max2);
    }
    System.out.println(max2);
    
//    for (int i=(int)'A'; i<(int)'Z'+1; i++){
//      System.out.println((char)i +" was entered "+ count[i - (int)'A']+ " times");
//    }
  }
}
                         
    