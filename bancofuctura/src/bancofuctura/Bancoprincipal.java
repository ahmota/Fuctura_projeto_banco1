package bancofuctura;

import java.util.Scanner;

public class Bancoprincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		ContaCorrente cc = new ContaCorrente ();
		ContaPoupanca cp = new ContaPoupanca();
		
		
		System.out.println("=========================");
		System.out.println("------BANDO FUCTURA------");
		System.out.println("=========================");
		
		System.out.println(" Digite seu nome ");
		String nome = entrada.next();
		cc.setNometitular(nome);
		System.out.println("digite uma conta de 6 digitos, para abertura");
		int nconta= entrada.nextInt();
		cc.setNumerodaconta(nconta);
		System.out.println("bem vindo " + nome + " A sua conta foi criada é \n" + nconta);
		System.out.println("digite o valor que deseja depositar para abertura de conta");
		double valordeposito=entrada.nextDouble();
		cc.setSaldodisponivel(valordeposito);
	    cc.deposito();
	    System.out.println("Digite uma opção: " + "\n 1- para consultar dados da conta " + "\n 2- acessar conta corrente " + "\n 3-para acessar conta poupança " + "\n 4- finalizar operação");
	int opcao= entrada.nextInt();
	int opcao2=entrada.nextInt();
	switch (opcao) {
	case 1:
		
		
		
		break;
	
	
	}

	}
			}

	


	


