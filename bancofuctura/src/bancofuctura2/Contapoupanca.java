package bancofuctura2;

public class Contapoupanca extends Conta {
	ContaCorrente cc= new ContaCorrente();
	double valor;
	public Contapoupanca() {

	}
		
	public Contapoupanca(String nometitular, int numeroconta, double saldodisponivel) {
		this.setnometitular(nometitular);
		this.setnumeroconta(numeroconta);
		this.setsaldodisponivel(saldodisponivel);
	}

	@Override
	public void dadosconta() {
		System.out.println(this.getnometitular());
		System.out.println(this.getnumeroconta());
		

	}

	@Override
	public void deposito(double valor) {

	}

	@Override
	public void saldocorrente() {

	}

	@Override
	public void saldopoupanca() {
    System.out.println("seu saldo em poupança é: " + valor);
	}

	public void resgate(double valor, ContaCorrente destino) {
     System.out.println("operação realizadano valor de " + valor+ " já está na sua cc");
	}

}
