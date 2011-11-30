
public class ContaCorrente {

	Cliente cliente = new Cliente();
	String numeroDaAgencia;
	String numeroDaConta;
	double saldo;
	double limite = 100.0;
	boolean premiada = true;
	
	public boolean sacar(double valor) {
		if(saldo + limite >= valor) {
			saldo = saldo - valor;
			return true;
		} else {
			return false;
		}
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
