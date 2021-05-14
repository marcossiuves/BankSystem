package bankSystem;

public class BankOperations {


	private float balance;
	private float limit;
	

	
	public BankOperations(ClientInfo client) {
		
		this.balance = client.getBalance();
		this.limit = client.getLimit();
		
		
		
	}
	

	public void withdrawMoney( float value) {
		
		if(value <= this.balance) {
			this.balance -= value; 
		} else if(value <= (this.balance + this.limit)) {
			float surplus = this.balance - value;
			if(surplus < 0) {
				
				this.balance = 0;
				surplus += this.limit;
				
			} else {
				surplus -= this.limit;
			}
			this.limit = surplus;
		} else {
			System.out.println("Saldo insuficiente! ");
		}
		
		
	}
	
	public void depositMoney( float value) {
		
		this.balance += value;
	}
	
	
	public float totalAmount() {
		return this.limit + this.balance;
	}
}
