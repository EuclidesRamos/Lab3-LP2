package lab3;

/**
 * Classe responsável pela Agenda, armazenando os contatos, cadastrando novos contatos, listando contatos e
 * exibindo contatos.
 * 
 * @author Euclides Ramos - 117210377
 *
 */
public class Agenda {

	/**
	 * Array para armazenar os contatos da agenda.
	 */
	private Contato[] contatos;
	
	/**
	 * Constutor de uma agenda, criando um novo array com tamanho 100.
	 */
	public Agenda() {
		this.contatos = new Contato[100];
	}
	
	/**
	 * Método responsável por cadastrar um novo contato na agenda.
	 * 
	 * @param posicao Caso a posição seja inválida, será criado ua exceção.
	 * @param contato
	 * @return Retorna o valor booleano "true".
	 */
	public boolean cadastrarContato(int posicao, Contato contato) {
		if (posicao <= 0 || posicao >=101) {
			throw new IndexOutOfBoundsException("POSIÇÃO INVÁLIDA!");
		}
		contatos[posicao - 1] = contato;
		return true;
	}

	/**
	 * Método responsável por listar todos os contatos da Agenda.
	 * 
	 * @return Retorna a Strign com todos os contatos que pertencem à Agenda. 
	 */
	public String listarContato() {
		String retorno = "";
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				retorno += i + 1 + " - " + contatos[i].nomeCompleto() + System.lineSeparator();
			}
		}
		return retorno;
	}

	/**
	 * Método responsável por exibir um determinado contato da Agenda. O contato será escolhido pelo usuário,
	 * digitando a posição.
	 * 
	 * @param posicao
	 * @return Retorna a String com nome, sobrenome e telefone do contato.
	 */
	public String exibirContato(int posicao) {
		if (contatos[posicao - 1] == null) {
			return "POSIÇÃO INVÁLIDA!" + System.lineSeparator();
		}
		return contatos[posicao - 1].toString();
	}
}
