import java.util.Scanner;

public class lab3extratask10{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    int[] freq = new int[10];
    int num1=0, num2=0;
    
    for (int count=0; count<2;){
      System.out.println ("Please enter a number between 0-9");
      int number = sin.nextInt();
      freq[number]++;
      if (freq[number]==2){
        count++;
        if (count == 1){
          num1 = number;
        }
        else if (count==2){
          num2 = number;
        }
      }
      else if (freq[number]==5){
        count--;
        if (count==0){
          num1 =0;
        }
        else if (count==1){
          num2=0;
        }
      }
    }
    System.out.println (num1+","+num2);
  }
}

    

      
      

 
    
    