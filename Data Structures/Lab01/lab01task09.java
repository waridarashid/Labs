import java.util.Scanner;

public class lab01task09{
  public static void display (int size, int[] name){
      for(int i=0; i < size; i++){
        System.out.println (name[i]);
      }
    }
    
    public static void square (int size, int[] name){
      for(int i=0; i < size; i++){
        name[i] = name[i] * name[i];
      }
    }
    
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    int[] num = new int[10];
    
    for(int i=0; i<10; i++){
      System.out.println("Please enter a number");
      num[i] = sin.nextInt();
    }            
    display(10, num);
    square (10, num);
    display(10, num);
  }
}
    
    
    