package bancofuctura;

public abstract class Conta {
	private String nometitular;
	private int numerodaconta;
	private double saldodisponivel;


	public abstract void dadosdaconta();


	public abstract void deposito();
     double valordeposito;

	public abstract void Saldocontacorrente();

	public abstract void saldopoupanca();


	public String getNometitular() {
		return nometitular;
	}


	public void setNometitular(String nome) {
		this.nometitular = nome;
		
	}


	public int getNumerodaconta() {
		return numerodaconta;
	}


	public void setNumerodaconta(int nconta) {
		this.numerodaconta = nconta;
	}


	public double getSaldodisponivel() {
		return saldodisponivel;
	}


	public void setSaldodisponivel(double saldodisponivel) {
		this.saldodisponivel = saldodisponivel;
	}



		
	}


	


