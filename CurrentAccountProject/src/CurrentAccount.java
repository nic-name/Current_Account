//Create a public class called Current Account
public class CurrentAccount {

	//Instance variables to be used
	private String firstName;
	private String lastName;
	private String password;
	private float balance = 0f;
	
	//Constructor
	public CurrentAccount (String firstName, String lastName, String password){
		
		//referencing class level fields
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		
	}

	//Getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public float getBalance() {
		return balance;
	}
	
	// makeLodgement method which has one parameter, a float to store the requested lodgement amount and tops up a customer's balance 
		public void makeLodgement(float lodgementAmount){
		
		//the new balance is the balance and the lodgement amount
		balance += lodgementAmount;
		
		System.out.println("Balance: " + balance );
	}
	
	// makeWithdrawl method which has one parameter, a float to	store the requested withdrawal amount and gives an insufficient fund message if the amount is greater than the balance
	public void makeWithdrawl(float withdrawlAmount){
		
		//testing to see if the withdrawlAmount is less than the balance
		if (withdrawlAmount < balance){
			//if it's less than the balance then the balance is update to balance minus amount
			balance -= withdrawlAmount;
			System.out.println("Withdrawl request:  " + withdrawlAmount + "\nBalance is: " + balance + "\n");
		}
		//otherwise tell the customer that they have insufficient funds
		else 
			System.out.println("Withdrawl request:  " + withdrawlAmount + "\nInsufficient Funds\n" + "Balance is: " + balance + "\n");
	}
	
	//the toString method contains the account details and prints them out for each object instance created
	@Override
	public String toString() {
					
			String accountDetails = 
					
							"****************Current Account****************"
							+ "\n" + "First Name: " + firstName 
							+ "\n" + "Last Name: " + lastName 
							+ "\n" + "Password: " + password + "\n";

							
			System.out.print(accountDetails);
			return accountDetails;
		
	}
	
}
