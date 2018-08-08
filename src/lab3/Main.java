package lab3;
import java.util.Scanner;

/**
 * Classe principal. Responsável pelo tratamento das entradas e exibição das saídas.
 * 
 * @author Euclides Ramos - 117210377
 *
 */
public class Main {

	/**
	 * Método responsável pelo tratamento das entradas do usuário e exibição dos resultados.
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		Menu();
		char opcao = entrada.next().charAt(0);
		
		while (opcao != 'S') {
			if (opcao == 'C') {
				System.out.print(System.lineSeparator() + "Posição: ");
				int posicao = entrada.nextInt();
				entrada.nextLine();
				
				System.out.print("Nome: ");
				String nome = entrada.nextLine();
				
				System.out.print("Sobrenome: ");
				String sobrenome = entrada.nextLine();
				
				System.out.print("Telefone: ");
				String telefone = entrada.nextLine();
				
				try {
					Contato contato = new Contato(nome, sobrenome, telefone);
					if (agenda.cadastrarContato(posicao, contato)) {
						System.out.println("CADASTRO REALIZADO!" + System.lineSeparator());
					} else {
						System.out.println("CADASTRO NÃO REALIZADO!" + System.lineSeparator());
					}
				} catch (RuntimeException i) {
					System.out.println("CADASTRO INVÁLIDO: " + i.getMessage() + System.lineSeparator());
				}
			
			} else if (opcao == 'L') {
				System.out.println(agenda.listarContato());
			
			} else if (opcao == 'E') {
				System.out.print("Contato> ");
				int posicao = entrada.nextInt();
				System.out.println(agenda.exibirContato(posicao));
			
			} else {
				System.out.println("OPÇÃO INVÁLIDA!" + System.lineSeparator());
			}		
			Menu();
			opcao = entrada.next().charAt(0);
		}
		System.exit(0);
		entrada.close();
	}
	
	/**
	 * Método responsável pela exibição do menu.
	 */
	private static void Menu() {
		System.out.println("(C)adastrar Contato");
		System.out.println("(L)istar Contatos");
		System.out.println("(E)xibir Contato");
		System.out.println("(S)air" + System.lineSeparator());
		System.out.print("Opção> ");
	}
}
