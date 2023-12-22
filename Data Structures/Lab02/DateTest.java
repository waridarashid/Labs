public class DateTest{
  public static void main(String[] args){
    Date d = new Date();
    d.setMonth(9);
    d.setDay(14);
    d.setYear(1992);
    System.out.println(d.getDay());
    System.out.println(d.getMonth());
    System.out.println(d.getYear());
    d.displayDate();
  }
}