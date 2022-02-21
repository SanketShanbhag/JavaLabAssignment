class Account
{
private long accNum;
private double balance;
private Person accHolder;

void deposit(double amount)
{
balance=balance+amount;
}
void withdraw(double amount) { 
balance = balance - amount;
}

void setAccNum(int accNum)
{
this.accNum = accNum;
}
void setBalance(double balance)
{
this.balance = balance;
}
void setAccHolder(Person accHolder)
{
this.accHolder = accHolder;
}


long getAccNum()
{
return accNum;
}

double getBalance()
{
return balance;
}

Person getaccHolder()
{
return accHolder;
}

}