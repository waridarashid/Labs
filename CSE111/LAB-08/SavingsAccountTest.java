public class SavingsAccountTest{
    public static void main(String[] args){
      SavingsAccount saver1 = new SavingsAccount(20000.00);
      SavingsAccount.modifyInterestRate(4.2);
      System.out.println (saver1.calculateMonthlyInterest());
      saver1.printSavingsBalance();
    }
}