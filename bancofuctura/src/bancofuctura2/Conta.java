package bancofuctura2;

public abstract class Conta {
	public Conta() {
		
	}
	
	public Conta(String nometitular, int numeroconta, double saldodisponivel) {
		this.nometitular = nometitular;
		this.numeroconta = numeroconta;
		this.saldodisponivel = saldodisponivel;
	}
	
 private int numeroconta;
 private String nometitular;
 private double saldodisponivel;
 
 public abstract void dadosconta();
	 
 public abstract void deposito(double valor);
 
 public abstract void saldocorrente();
 
 public abstract void saldopoupanca();
 
 public int getnumeroconta() {
	 return numeroconta;
 }
 public void setnumeroconta(int nconta) {
	 this.numeroconta=nconta;
 }
 
 public String getnometitular() {
	 return nometitular;
 }	 
	 public void  setnometitular(String nome) {
		 this.nometitular= nome;
	 }
 
 public double getsaldodisponivel() {
	 return saldodisponivel;
 }
 public void setsaldodisponivel(double valor) {
	 this.saldodisponivel=valor;
 }
}
