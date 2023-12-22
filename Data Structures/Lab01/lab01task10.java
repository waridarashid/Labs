import java.util.Scanner;

public class lab01task10{
  public static String season(int day, int month){
    String season = "";
    if (month <= 3 || month == 12){
      if (month != 3 && month != 12){
        season = "Winter";
      }
      else if ((month == 3 && day <= 15) || (month ==12 && day >= 16)){
        season = "Winter";
      }
    }
    else if (month >= 3 && month <= 6){
      if (month != 3 && month != 6){
        season = "Spring";
      }
      else if ((month == 3 && day >= 16) || (month ==6 && day <= 15)){
        season = "Spring";
      }
    }
    else if (month >= 6 && month <= 9){
      if (month != 6 && month != 9){
        season = "Summer";
      }
      else if ((month == 6 && day >= 16) || (month ==9 && day <= 15)){
        season = "Summer";
      }
    }
    else{
      season = "Fall";
    }
    return season;
  }
  
  public static void main (String[] args){

    Scanner sin = new Scanner(System.in);
    System.out.println ("Enter month");
    int month = sin.nextInt();
    System.out.println ("Enter day");
    int day = sin.nextInt();
    System.out.println(season(day, month));
  }
}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    