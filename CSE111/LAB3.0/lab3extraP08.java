import java.util.Scanner;

public class lab3extraP08{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    int[] num = new int[10];
    
    for (int i=0;i<num.length; i++){
      System.out.println("Please enter a number between 0 to 9");
      int n = sin.nextInt();
      num[n]++;
    }
    for (int i=0; i<9; i++){
      if (num[i]>=2 && num[i]<5){
        System.out.println(i);
      }
    }
  }
}
                                    