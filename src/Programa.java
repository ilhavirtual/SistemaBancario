import java.util.ArrayList;
import java.util.Scanner;


public class Programa {

	private static final String CONTINUAR = "S";

	public static void main(String[] args) {
		System.out.println("Inicio do programa");
		Scanner entrada = new Scanner(System.in);
		String nome;
		String continuar = "S";
		ContaCorrente contaCorrente;
		
		ArrayList<ContaCorrente> contasCorrentes;
		contasCorrentes = new ArrayList<ContaCorrente>();
		
		while(CONTINUAR.equals(continuar)) {
			System.out.print("Digite o nome do cliente: ");
			nome = entrada.nextLine();
			
			contaCorrente = new ContaCorrente();
			contaCorrente.nomeDoCliente = nome;
			
			contasCorrentes.add(contaCorrente);
			
			System.out.println("Deseja continuar? [S/N]");
			continuar = entrada.nextLine();
		}

		for(int i = 0; i < contasCorrentes.size(); i++) {
			ContaCorrente conta = contasCorrentes.get(i);
			System.out.println("Nome: " + conta);
		}
		
		
		
		
		
		
		
		
		
	}
}
