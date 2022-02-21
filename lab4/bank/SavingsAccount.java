class SavingsAccount extends Account
{
final int minbalance = 500;
void withdraw(double amount)
{
if(getBalance() >= minbalance+amount){
double bal = getBalance()-amount;
setBalance(bal);
System.out.println("Balance:"+bal);
}
else
{
System.out.println("Minimum balance not there");
}
}
}