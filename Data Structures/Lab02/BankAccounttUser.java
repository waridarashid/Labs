public class BankAccounttUser{
  public static void main (String[] args){
    BankAccount acc1 = new BankAccount();
    BankAccount acc2 = new BankAccount();
    BankAccount acc3 = new BankAccount();
    acc1.setName("Mike");
    acc1.setAccountID("14301022");
    acc1.setAddress("Pabna");
    acc1.setBalance(400.00);
    acc2.setName("Sam");
    acc2.setAccountID("14301023");
    acc2.setAddress("Dhaka");
    acc2.setBalance(500);
    acc3.setName("Luke");
    acc3.setAccountID("14301024");
    acc3.setAddress("Rajshahi");
    acc3.setBalance(600);
    System.out.println (acc1.getName());
    System.out.println (acc1.getAccountID());
    System.out.println (acc1.getAddress());
    System.out.println (acc1.getBalance());
    acc1.addInterest();
    System.out.println(acc1.getBalance());
  }
}
    