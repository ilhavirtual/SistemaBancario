
public class ProgramaReferencias {
	
	public static void main(String[] args) {
		
		ContaCorrente c1;
		c1 = new ContaCorrente();
		c1.cliente = new Cliente();
		c1.cliente.nome = "Joao";
		c1.saldo = 1000.0;
		
		ContaCorrente c2;
		c2 = new ContaCorrente();
		c2.cliente = new Cliente();
		c2.cliente.nome = "Jose";
		c2.saldo = 1000.0;
		
		System.out.println("Saldo do cliente c1: " + c1.saldo);
		System.out.println("Saldo do cliente c2: " + c2.saldo);
		
		c1.transferirPara(c2, 200.0);
		
		
		System.out.println("Saldo do cliente c1: " + c1.saldo);	
		System.out.println("Saldo do cliente c2: " + c2.saldo);
	}
}
