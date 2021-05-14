package bankSystem;

import java.util.Scanner;

public class Login {

	boolean state;
	Scanner input = new Scanner(System.in);
	ClientArray ar = new ClientArray();

	public Login(ClientInfo client) {
	
		
		accountAuthentication(client);
		if(this.state){
			passAuthentication(client);

		}


	}

	void passAuthentication(ClientInfo client) {

		for (int i = 0; i < 5; i++) {
			String password;

			System.out.println("Digite a senha: ");
			password = input.nextLine();

			if (password.equalsIgnoreCase(client.getPassword())) {
				System.out.println("Acesso autorizado");
				this.state = true;
				break;

			} else {
				System.out.println("Acesso negado");
				this.state = false;
			}

			if (i == 4) {
				System.out.println("Limite de tentatias alcançado! ");
				System.exit(0);
			}
		}

	}

	void accountAuthentication(ClientInfo client) {
		int account;

		do {

			System.out.println("Digite a conta: ");
			account = input.nextInt();
			input.nextLine();
			if (ar.searchClient(client, account) != -1) {
				this.state = true;

			} else {

				System.out.println("Conta não cadastrada!");

			}
		} while (!this.state);

	}

}
