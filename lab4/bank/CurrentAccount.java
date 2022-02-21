class CurrentAccount extends Account
{
int limit = 500;
void withdraw(double amount)
{
if(getBalance() >=limit+amount)
{
double bal2= getBalance()-amount;
setBalance(bal2);
System.out.println(true);
}
else
{ 
System.out.println(false);  
}
}
}
