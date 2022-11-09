package bancofuctura2;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ContaCorrente cc = new ContaCorrente();
		Contapoupanca cp = new Contapoupanca();
		String nome1;
		System.out.println("=========================");
		System.out.println("------BANDO FUCTURA------");
		System.out.println("=========================");

		System.out.println("Digite seu nome para criar a conta");
		String nome = entrada.next();
		cc.setnometitular(nome);
		System.out.println("digite numero da conta de 6 digitos");
		int nconta = entrada.nextInt();
		cc.setnumeroconta(nconta);
		System.out.println("informe o valor para criar a conta");
		double valor = entrada.nextDouble();
		cc.setsaldodisponivel(valor);
		{
			
			boolean retornarAoMenu = true;
			while (retornarAoMenu) {

				System.out.println(
						"Digite uma opção: " + "\n 1- para consultar dados da conta " + "\n 2- acessar conta corrente "
								+ "\n 3-para acessar conta poupança " + "\n 4- finalizar operação");
				int opcao = entrada.nextInt();
				switch (opcao) {
				case 1: 
					System.out.println("Qual das contas você de seja consultar: ");
					System.out.println("1 - ContaCorrente | 2 - ContaPoupança");
					int opcao2 = entrada.nextInt();
					if (opcao2 == 1) {
						cc.dadosconta();
						System.out.println("Consulta realizada com Sucesso!");
					} else if (opcao2 == 2) {
						cp.dadosconta();
						System.out.println("Consulta realizada com Sucesso!");
					} else {
						System.out.println("Opção Inválida!");
					}
					break;
				case 2:
					System.out.println(
							"Conta Corrente: 1- para saque | 2- deposito | 3- aplicação | 4- finalizar operação");
					int contacorrente = entrada.nextInt();
					if (contacorrente == 1) {
						System.out.println("informe o valor do saque:");
						cc.valorsaque = entrada.nextDouble();
						cc.saque();
					} else if (contacorrente == 2) {
						System.out.println("quanto deseja depositar:");
						valor = entrada.nextDouble();
						cc.setsaldodisponivel(valor);
						cc.deposito(valor);
					} else if (contacorrente == 3) {
						System.out.println("informe o valor que irá depositar na conta poupança");
						valor = entrada.nextDouble();

						cc.aplicacao(valor, cp);

					} else {
						System.out.println("operação finalizada");
					}
					break;
				case 3:
					System.out.println("Conta poupança:  1- saldo poupança | digite 2- para resgate");
					int contapoupanca = entrada.nextInt();
					if (contapoupanca == 1) {
						cp.saldopoupanca();

					} else if (contapoupanca == 2) {
						System.out.println("informe o valor de resgate:");
						valor = entrada.nextDouble();
						cp.resgate(valor, cc);

					} else {
						System.out.println("comando invalido");
					}
					break;
					
				case 4:
					
					System.out.println("Encerrando Sistema");
					retornarAoMenu = false;
					
				default:
					System.out.println("operação finalizada");
					break;
				}
			}

		}
	}
}
