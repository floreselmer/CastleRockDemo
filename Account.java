public class Account
{


int clientID;
double startBalance;
double endBalance;
double interestRate= .03;
double earnedInterest;
String accountType="Investment";




public Account()
{
System.out.println("Account ID: 000");
System.out.println("Account Type: " +accountType);
System.out.println("Starting Account Balance:0.00");
System.out.println("Interest Gained:0.00");
System.out.println("Ending Account Balance: 0.00");
}



public Account(int clientID,double startBalance, double interestRate)
{
this.clientID= clientID;
this.startBalance= startBalance;
this.interestRate= interestRate;
}

public  void computeInterest()
{

this.earnedInterest= this.interestRate*this.startBalance;
this.endBalance= this.startBalance+this.earnedInterest;
}

public  void printAccountDetails()
{
System.out.println("Account ID: "+ this.clientID);
System.out.println("Account Type: " +this.accountType);
System.out.println("Starting Account Balance: "+this.startBalance);
System.out.println("Interest Gained: $"+this.earnedInterest );
System.out.println("Ending Account Balance: $"+ this.endBalance);


}




















}