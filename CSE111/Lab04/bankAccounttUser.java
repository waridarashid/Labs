public class bankAccounttUser{
  public static void main (String[] args){
    BankAccount acc = new BankAccount();
    acc.setName("Mike");
    acc.setAccountID("14301022");
    acc.setAddress("Pabna");
    acc.setBalance(400.00);
    System.out.println (acc.getName());
    System.out.println (acc.getAccountID());
    System.out.println (acc.getAddress());
    System.out.println (acc.getBalance());
  }
}
    