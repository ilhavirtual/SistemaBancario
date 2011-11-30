
public class ProgramaReferencias {
	
	public static void main(String[] args) {
		
		ContaCorrente c1;
		c1 = new ContaCorrente();
		c1.cliente.setNome("Joao");
		
		ContaCorrente c2;
		c2 = new ContaCorrente();
		c2.cliente.setNome("Jose");
		
		System.out.println("Saldo do cliente c1: " + c1.cliente.getNome() + " " + c1.getSaldo());
		System.out.println("Saldo do cliente c2: " + c2.cliente.getNome() + " " + c2.getSaldo());
		
		boolean sucesso = c1.sacar(1101.0);
		
		if(sucesso) {
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Nao foi possivel efetuar o saque!");
		}
		
		System.out.println("Saldo do cliente c1: " + c1.getSaldo());	
		System.out.println("Saldo do cliente c2: " + c2.getSaldo());
	}
}
