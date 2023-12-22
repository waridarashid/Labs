public class SavingsAccount extends Account{
  private double interestRate = 0.05;
   private double interest = 0;
  
  public void depAmount(double balance){
    super.balance = balance;
  }
  public void showBalance(){
    System.out.println ("Your balance is" + balance);
  }
  
  public void computeInterest(){
    interest = balance * interestRate;
  }
}
  

                           
  
  
    
  