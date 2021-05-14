package bankSystem;

public class ClientArray {



	public int searchClient( ClientInfo client, int account) {
		int cod = -1;

		for(int i = 0; i < 2 ; i++) {
			
			if (client.getAccount() == account) {
				cod = i;
			}
			
		}
		return cod;
		
	}
}