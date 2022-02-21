import java.util.*;

class Bank
{
public static void main(String[] args)
{
Random random= new Random();
SavingsAccount SA = new SavingsAccount();
Person p1 = new Person();
SA.setAccNum(random.nextInt(1234));
p1.setName("smitha");
p1.setAge(25);
SA.setBalance(2000);
SA.deposit(2000);
System.out.println("balance: "+SA.getBalance());

CurrentAccount CA = new CurrentAccount();
Person p2 = new Person();
CA.setAccNum(random.nextInt(2345));
p2.setName("Kathy");
p2.setAge(30);
CA.setBalance(3000);
CA.withdraw(2000);
System.out.println("balance: "+CA.getBalance());
}
}
