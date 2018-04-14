package gerentebanco;
public class GerenteBanco {
	public static void main(String[] args) {
	Conta conta1 = new Conta();
	conta1.cliente = "João";
	conta1.saldo = 1000;
	conta1.exibirSaldo();
	
	conta1.sacarValor(200);
	conta1.exibirSaldo();
	
	conta1.depositarValor(1500);
	conta1.exibirSaldo();
	System.out.println("----------------------------------------------");
	
	Conta conta2 = new Conta();
	conta2.cliente = "Maria";
	conta2.saldo = 15000;
	conta2.exibirSaldo();
	System.out.println("----------------------------------------------");
	
	conta1.transferirValor(conta2, 1000);
	conta1.exibirSaldo();
	
	conta2.transferirValor(conta1, 10000);
	conta2.exibirSaldo();
	}

}
