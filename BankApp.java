

import java.util.Scanner;



//This application will display a welcome message then five choices which the user can select to check balance, withdraw, deposit. etc


public class BankApp {

	

	public static void main(String[] args) {
		
		
		
		BankAccount object1= new BankAccount("QWERTY","12345");
		object1.ShowMenu();
				
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

class BankAccount {
	
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	BankAccount(String customerN, String customerID)
	{
		customerName = customerN;
		customerId= customerID;
	}
	
	void deposit(int amount)
	{
		if(amount !=0)
		{
			balance= balance+ amount;
			previousTransaction= amount;
			
		}
	}
	void withdraw(int amount) {
		if(amount !=0)
		{
			balance = balance-amount;
			previousTransaction= -amount;
		
		}
	}
	void getPreviousTransaction() {
		if(previousTransaction > 0)
		{
			System.out.println("Deposited: " + previousTransaction);
	
		} else if(previousTransaction <0) {
			System.out.println("Withdrawn: " +Math.abs(previousTransaction));
		}else {
			System.out.println("No Transaction has occured");
		}
	}
	
	void ShowMenu() {
		
		char option='\0';
		Scanner input= new Scanner(System.in);
		
		System.out.println("Welcome "+customerName+ "to your local Bank");
		System.out.println("Your Banking ID: "+customerId+ "\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		
		do
		{
			System.out.println("#################################################");
			System.out.println("Enter an option");
			System.out.println("#################################################");
			option = input.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("Balance = " +balance);
				break;
			case 'B':
				System.out.println("#################################################");
				System.out.println("Enter the amount you would like to deposit?");
				System.out.println("#################################################");
				int amountD= input.nextInt();
				deposit(amountD);
				System.out.println("\n");
				getPreviousTransaction();
				break;
			case 'C':
				System.out.println("#################################################");
				System.out.println("How much would you like to withdraw?");
				System.out.println("#################################################");
				int amountW = input.nextInt();
				withdraw(amountW);
				System.out.println("\n");
				getPreviousTransaction();
				break;
			case 'D':
				System.out.println("#################################################");
				getPreviousTransaction();
				System.out.println("#################################################");
				break;
				
			case 'E':
			System.out.println("#################################################");
			break;
			default: 
				System.out.println("#################################################");
				System.out.println("Invalid Option. Please Enter one of the options");
				System.out.println("#################################################");
				break;
			}
			
		}while(option != 'E');
		System.out.println("Thank You For using our Services");
			
		
		
		
	}
	
	
	
}
