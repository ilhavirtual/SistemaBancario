
public class ContaCorrente {

	Cliente cliente;
	String numeroDaAgencia;
	String numeroDaConta;
	double saldo;
	
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void transferirPara(ContaCorrente outraConta, 
			double valor) {
		sacar(valor);
		outraConta.depositar(valor);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
