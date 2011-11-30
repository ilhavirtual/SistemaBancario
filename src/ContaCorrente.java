
public class ContaCorrente {

	Cliente cliente = new Cliente();
	String numeroDaAgencia;
	String numeroDaConta;
	private double saldo = 1000.0;
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
	
	public double getSaldo() {
		return saldo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
