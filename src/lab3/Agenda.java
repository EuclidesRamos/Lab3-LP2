package lab3;

/**
 * Classe respons�vel pela Agenda, armazenando os contatos, cadastrando novos contatos, listando contatos e
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
	 * M�todo respons�vel por cadastrar um novo contato na agenda.
	 * 
	 * @param posicao Caso a posi��o seja inv�lida, ser� criado ua exce��o.
	 * @param contato
	 * @return Retorna o valor booleano "true".
	 */
	public boolean cadastrarContato(int posicao, Contato contato) {
		if (posicao <= 0 || posicao >=101) {
			throw new IndexOutOfBoundsException("POSI��O INV�LIDA!");
		}
		contatos[posicao - 1] = contato;
		return true;
	}

	/**
	 * M�todo respons�vel por listar todos os contatos da Agenda.
	 * 
	 * @return Retorna a Strign com todos os contatos que pertencem � Agenda. 
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
	 * M�todo respons�vel por exibir um determinado contato da Agenda. O contato ser� escolhido pelo usu�rio,
	 * digitando a posi��o.
	 * 
	 * @param posicao
	 * @return Retorna a String com nome, sobrenome e telefone do contato.
	 */
	public String exibirContato(int posicao) {
		if (contatos[posicao - 1] == null) {
			return "POSI��O INV�LIDA!" + System.lineSeparator();
		}
		return contatos[posicao - 1].toString();
	}
}
