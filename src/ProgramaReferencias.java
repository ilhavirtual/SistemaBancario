
public class ProgramaReferencias {
	
	public static void main(String[] args) {
		
		ContaCorrente c1;
		c1 = new ContaCorrente();
		c1.cliente.nome = "Joao";
		c1.saldo = 1000.0;

		
		ContaCorrente c2;
		c2 = new ContaCorrente();
		c2.cliente.nome = "Jose";
		c2.saldo = 1000.0;
		
		System.out.println("Saldo do cliente c1: " + c1.saldo);
		System.out.println("Saldo do cliente c2: " + c2.saldo);
		
		boolean sucesso = c1.sacar(1001.0);
		
		if(sucesso){
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Nao foi possivel efetuar o saque!");
		}
		
		
		System.out.println("Saldo do cliente c1: " + c1.saldo);	
		System.out.println("Saldo do cliente c2: " + c2.saldo);
	}
}
