import java.util.Scanner;

public class lab01task12{
  public static boolean before(int day1, int month1, int day2, int month2){
    boolean bool = true;
    if (month1 > month2){
      bool = false;
    }
    else if (month1 == month2){
      if (day1 > day2){
        bool = false;
      }
    }
    return bool;
  }
  
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println("enter 1st day");
    int day1 = sin.nextInt();
    System.out.println("enter 1st month");
    int month1 = sin.nextInt();
    System.out.println("enter 2nd day");
    int day2 = sin.nextInt();
    System.out.println("enter 2nd month");
    int month2 = sin.nextInt();
    System.out.println(before(day1, month1, day2, month2));
  }
}

 
      
      
  