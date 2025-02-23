import java.util.*;
class BankAccount
{
	int accNo;
	int accHolder;
	int balance;
	
	public void setAccNo(int a)
	{
		accNo=a;
	}
	public int getAccNo()
	{
		return accNo;
	}
	public void setAccHolder(int h)
	{
		accHolder=h;
	}
	public int getAccHolder()
	{
		return accHolder;
	}
	public void setBalance(int b)
	{
		balance=b;
	}
	public int getBalance()
	{
		return balance;
	}
    
	
	public void deposite(int amount)
	{
		int bal=getBalance()+amount;
		setBalance(bal);
	}
	
	public void withdrae(int amount)
	{
		if(amount<0)
		{
			System.out.println("insufficient money");
		}
		int withdraw=getBalance
	
