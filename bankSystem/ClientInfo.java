package bankSystem;

public class ClientInfo {
	
	
	private int account;
	private String name;
	private String password;
	private float balance; 
	private float limit;

	
	public  ClientInfo(int cod, int account, String name, String password, float balance, float limit){
		
		this.account = account;
		this.name = name;
		this.password = password;
		this.balance = balance;
		this.limit = limit;
	}
	
	

	
	public String getName() {
		return name;
	}
	
	public int getAccount() {
		return account;
	}
	
	public String getPassword() {
		return password;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public float getLimit() {
		return limit;
	}
	

	public void setBalance(float balance) {
		
		this.balance = balance;
		
	}
	
	public void setPassoword( String password) {
		this.password = password;
	}
	
	public void setAccount(int cod, int account) {
		this.account = account;
	}
}
