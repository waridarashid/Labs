public class StudentUser{
  public static void main (String[] args){
    Student mike = new Student();
    mike.setName("Mike");
    mike.setID("14301022");
    mike.setAddress("Pabna");
    mike.setCGPA(4.00);
    System.out.println (mike.getName());
    System.out.println (mike.getID());
    System.out.println (mike.getAddress());
    System.out.println (mike.getCGPA());
  }
}
    