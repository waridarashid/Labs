import java.util.Scanner;

public class lab3extraP09{
  public static void main (String[] args){
    Scanner sin = new Scanner(System.in);
    int[] num = new int[10];
    
    for(int i=0; i<num.length; i++){
      System.out.println("Plese enter a number");
      num[i] = sin.nextInt();
    }
    
    System.out.println ("Please enter odd/even/all according to the positions of numbers you want to be sorted");
    String s = sin.nextLine();
    s = sin.nextLine();
    
    
    if("even".equalsIgnoreCase(s)==true){
      for(int i=0; i<num.length-3; i+=2){
        for (int j= i+2; j<num.length; j+=2){
          if (num[j] > num[i]){
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
          }
        }
      }
    }
    
    else if("odd".equalsIgnoreCase(s)==true){
      for(int i=1; i<num.length-3; i+=2){
        for (int j= i+2; j<num.length; j+=2){
          if (num[j] > num[i]){
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
          }
        }
      }
    }
    
    else{
      for(int i=0; i<num.length-1; i++){
        for (int j=i+1; j<num.length; j++){
          if (num[j] > num[i]){
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
          }
        }
      }
    }
    
    for (int i = 0; i<num.length; i++){
      System.out.println (num[i]);
    }
  }
}
    