import java.util.Scanner;

public class Account{
  Scanner sin = new Scanner(System.in);
  private String name;
  private String accountNumber;
  private String accountType;
  private double balance;
  
  public Account(){
    System.out.println ("Enter name");
    name = sin.nextLine();
    System.out.println ("Enter account number");
    accountNumber = sin.nextLine();
    System.out.println ("Enter account type");
    accountType = sin.nextLine();
    System.out.println ("Enter balnce");
    balance = sin.nextDouble();
  }
  
  public void depAmount(double balance){
    this.balance = balance;
  }
  public void showBalance(){
    System.out.println ("Your balance is" + balance);
  }
  
    public void withdraw(double amount){
    if (balance < 500){
      System.out.println("You do not have enough balance to withdraw");
    }
    else{
      balance -= amount;
    }
  }
}
    
    
    