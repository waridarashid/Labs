public class Date{
  public int month;
  public int day;
  public int year;
  
  public Date(){
    month = 0;
    day = 0;
    year = 0;
  }
  
  public void setMonth(int month){
    this.month = month;
  }
  public void setDay(int day){
    this.day = day;
  }
  public void setYear(int year){
    this.year = year;
  }
  public int getMonth(){
    return month;
  }
  public int getDay(){
    return day;
  }
  public int getYear(){
    return year;
  }
  public void displayDate(){
    System.out.println(day+"/"+month+"/"+year);
  }
}
  
  
  
    
    
    