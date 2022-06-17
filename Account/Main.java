class Account
{
	private int accNo = 0;
	private String customerName="";
	private double balance=-1;
	public void setAccountNumber(int acc)
	{
		accNo =	acc;
	}
	public void setCustomerName(String name)
	{
		customerName = name;
	}
	public void setbalance(double bal)
	{
		balance= bal;
	}
	
	public int getAccountNumber()
	{
		return accNo;
	}
	public String getCustomerName()
	{
		return ownerName;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public void Deposit(double amt)
	{
		balance+=amt;
	}
	
	public void Withdraw(double amt)
	{
		balance-=amt;
	}
}

class Main
{	
	public static void main(String[] args)
	{
		Account d1 = new Account();
		d1.setAccountNumber(1234);
		d1.setownerName("Pankaj");
		d1.setbalance(1000);
		
		System.out.println("Account Number = "+d1.getAccountNumber());
		System.out.println("ownerName = " +d1.getCustomerName());
		System.out.println("balance = " +d1.getBalance());
		
		
		Account d2 = new Account();
		d2.setAccountNumber(4321);
		d2.setownerName("Meena");
		d2.setbalance(2000);
		
		System.out.println("Account Number = "+d2.getAccountNumber());
		System.out.println("ownerName = " +d2.getCustomerName());
		System.out.println("balance = " +d2.getBalance());
		
		
		System.out.println("-----------------------------------");
		d2.Deposit(1000);
		System.out.println("balance = " +d2.getBalance());
		
		d2.Withdraw(500);
		System.out.println("balance = " +d2.getBalance());		
	}	
}