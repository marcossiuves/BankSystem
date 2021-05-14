package bankSystem;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		int operation = 0;
		float value;
		Login login;
		boolean state = false;

		ClientInfo client = new ClientInfo(1, 123, "pedro", "4321", 1000, 100);

		Scanner input = new Scanner(System.in);
		

		login = new Login(client);
		state = login.state;

		if (state) {
			BankOperations op = new BankOperations(client);

			try {

				while (operation != 4) {
					System.out.println("Digite a operação: ");
					operation = input.nextInt();
					
					switch (operation) {
					
					case 1:
						System.out.println("Digite a quantidade a ser depositada: ");
						value = input.nextFloat();
						op.depositMoney(value);
						break;
						
					case 2:
						
						System.out.println("Digite a quantidade a ser sacada: ");
						value =input.nextFloat();
						op.withdrawMoney(value);
						break;
						
					case 3:
						
						System.out.println("Seu saldo é: " + op.totalAmount());
						break;
						
					case 4:
						System.exit(0);
						break;
					default:
						break;
					}
				}

			} catch (Exception e) {
				System.out.println(e);
			}

			System.out.println("123");

			input.close();
		}

	}

}
