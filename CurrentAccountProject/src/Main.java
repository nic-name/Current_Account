import java.util.ArrayList;

public class Main {
	
	//main method
	public static void main(String[] args) {
		
		//create an array list to count the number of accounts and add the balances
		ArrayList <CurrentAccount> accounts = new  ArrayList <> ();
		
		//create three accounts and add in name/password fields
		CurrentAccount customerOne = new CurrentAccount("Billy", "Bonds", "3434S");
		CurrentAccount customerTwo = new CurrentAccount ("Clare", "Taylor", "5441S");
		CurrentAccount customerThree = new CurrentAccount ("Anna", "Long", "6431S");
		
		//add the accounts created to the above array list 
		accounts.add(customerOne);
		accounts.add(customerTwo);
		accounts.add(customerThree);
		
		//Call the toString method, makeLodgement, makeWithdrawl and get balance on all three accounts
		customerOne.toString();
		customerOne.makeLodgement(40f);
		customerOne.makeWithdrawl(50f);
		customerOne.getBalance();
		
		customerTwo.toString();
		customerTwo.makeLodgement(100f);
		customerTwo.makeWithdrawl(600f);
		customerTwo.getBalance();
		
		customerThree.toString();
		customerThree.makeLodgement(135f);
		customerThree.makeWithdrawl(60f);
		customerThree.getBalance();
		
		//Using the size of the accounts array list print out the number of current accounts
		System.out.println("No. of current accounts: " + accounts.size());
		
		float totalBalance = 0f;
		
		//Use an enhanced for loop to add all the balances together from each object created by calling the getBalance method and adding each return value
		for (CurrentAccount c: accounts)
			{
				totalBalance += c.getBalance();
			}
		System.out.println("Sum of balances held: " + totalBalance);
		
		//find the average balance by dividing totalBalance by the size of the accounts array list
		System.out.printf("Average balance held per customer: %.2f" , (totalBalance/accounts.size()));
		
	}// end main()
}
