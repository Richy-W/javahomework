
public class SavingsAccount {
	int id;
	double balance;
	double annualIntRate;
	java.util.Date dateEstablished;
	
	
	//creating constructors
	SavingsAccount(){
		dateEstablished = new java.util.Date();
	}
	
	SavingsAccount(int id, double balance){
		this();
		this.id = id;
		this.balance = balance;
	}
	
	//methods needed
	public int getId() {
		return this.id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getAnnualIntRate() {
		return this.annualIntRate;
	}
	
	public String getEstablished() {
		return this.dateEstablished.toString();
	}
	
	public void setId(int id) {
		this.id = id;
	}	
	
	public void setBal(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualIntRate(double annualIntRate) {
		this.annualIntRate = annualIntRate;
	}
	
	public double getWeeklyIntRate() {
		return (annualIntRate / 100) / 52;
	}
	
	public double weeklyInt () {
		return balance * getWeeklyIntRate();
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}

}


