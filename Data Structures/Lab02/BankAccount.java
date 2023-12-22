public class BankAccount{
  private String name;
  private String accountID;
  private String address;
  private double balance;
  
  public void setName(String n){
    name = n;
  }
  public void setAccountID(String i){
    accountID = i;
  }
  public void setAddress(String a){
    address = a;
  }
  public void setBalance(double b){
    balance = b;
  }
  public String getName(){
    return name;
  }
  public String getAccountID(){
    return accountID;
  }
  public String getAddress(){
    return address;
  }
  public double getBalance(){
    return balance;
  }
  public void addInterest(){
    balance = balance + (balance*.07);
  }
}
  

  
    