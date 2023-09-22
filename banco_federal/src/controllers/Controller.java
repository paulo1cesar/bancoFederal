package controllers;

public class Controller {
	
	private String name;
	private int accNumber;
	private double firstDeposit;
	private double balance;
	
	public Controller() {
		
	}
	
	public Controller(String name, int accNumber, double firstDeposit, double balance){
		this.name = name;
		this.accNumber = accNumber;
		this.firstDeposit = firstDeposit;
		this.balance = balance;
	}

	public Controller(int accNumber, String name) {
		this.accNumber = accNumber;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccId() {
		return accNumber;
	}

	public void setAccId(int accNumber) {
		this.accNumber = accNumber;
	}

	public double getFirstDeposit() {
		return firstDeposit;
	}

	public void setFirstDeposit(double firstDeposit) {
		this.firstDeposit = firstDeposit;
	}

	public double getBalance() {
		return balance;
	}
	
	public void addBalance(double balance) {
		this.balance += balance;
	}
	public void removeBalance(double balance) {
		this.balance -= balance - (- 5);
	}
	
	public String toString() {
		return ("Account "+ getAccId()+
	 			", Holder: "+ getName()+
	 			", Balance: $"+ String.format("%.2f",getBalance()));
	}
	
}
