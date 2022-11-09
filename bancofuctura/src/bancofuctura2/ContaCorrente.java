package bancofuctura2;

public class ContaCorrente extends Conta {
double valor=this.getsaldodisponivel();
double valorsaque;
	public ContaCorrente() {

	}
	
	public ContaCorrente(String nometitular, int numeroconta, double saldodisponivel) {
		this.setnometitular(nometitular);
		this.setnumeroconta(numeroconta);
		this.setsaldodisponivel(saldodisponivel);
	}

	@Override
	public void dadosconta() {
		System.out.println(this.getnometitular());
		System.out.println(this.getnumeroconta());
		System.out.println(this.getsaldodisponivel());

	}

	@Override
	public void deposito(double valor) {
     System.out.println("você realizou um deposito de: " + valor);
     
	}

	@Override
	public void saldocorrente() {
    this.getsaldodisponivel();
    System.out.println(this.getsaldodisponivel());
	}

	@Override
	public void saldopoupanca() {

	}

	public void saque() { //verificar
	double valor2= getsaldodisponivel()- valorsaque;	
		if(valor2<0) {
			System.out.println("Operação nao realizada falta de saldo" );
		}else {
			System.out.println("operação realizada, seu saldo é atual agora é: " + valor2  );
		}
 

	}

	public void aplicacao(double valor, Contapoupanca destino) {
		System.out.println(" Parabéns seu dinheiro ja está rendendo na poupança no valor de: " + valor +"seu saldo em cc é " + ((getsaldodisponivel()-valor)));
	}
}
