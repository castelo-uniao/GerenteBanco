package gerentebanco;
public class Conta {
	// Atributos da classe conta:
	String cliente; // Atributo cliente da conta
	double saldo; // Atributo saldo da conta
	
	// Métodos da classe:
	void exibirSaldo() {
		System.out.println(cliente + ", seu saldo vale R$ " + saldo);
	}
	
	void sacarValor(double valorSacado) {
		saldo = saldo - valorSacado;
	}
	
	void depositarValor(double valorDepositado) {
		saldo = saldo + valorDepositado;
	}
	
	void transferirValor(Conta contaDestino, double valorTransferido) {
		/*
		 * Referencia o próprio objeto (objeto corrente em uso)
		 * *Sacar da conta1 = depositar na conta?
		 * this. --> nesta conta eu quero realizar o saque
		 */
		this.sacarValor(valorTransferido);
	}
}
