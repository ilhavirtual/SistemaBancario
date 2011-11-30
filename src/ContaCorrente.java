
public class ContaCorrente {

	String nomeDoCliente;
	String numeroDaAgencia;
	String numeroDaConta;
	double saldo;
	
	public void sacar(double valor) {
		System.out.println("Sacando: " + valor + " do cliente: " 
						+ nomeDoCliente);
		saldo = saldo - valor;
	}
}
