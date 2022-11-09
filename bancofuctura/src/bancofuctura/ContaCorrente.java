package bancofuctura;

public class ContaCorrente extends Conta{
	
double saldo;	
double saque;
double deposito;


public ContaCorrente() {
	
}



@Override
public void deposito() {
valordeposito=0;	
System.out.println(getSaldodisponivel());	
	
}
@Override
public void Saldocontacorrente() {
saldo= getSaldodisponivel() + valordeposito;
System.out.println(saldo);

}


public void saque() {
	if (saque>=getSaldodisponivel()) {
		System.out.println("saque liberado");
		}else {
			System.out.println("limite abaixo do saque");
		}
	
	 
 
		
	
	
}


public void aplicacaopoupanca() {
	
}

@Override
public void dadosdaconta() {
getNometitular();
getNumerodaconta();
getSaldodisponivel();
System.out.println("\n Nome do titular:   " + getNometitular() + " \n numero da conta:    "+ getNumerodaconta() + "\n  seu saldo é:   "+ getSaldodisponivel());

	
}






@Override
public void saldopoupanca() {
	
	
}
}
