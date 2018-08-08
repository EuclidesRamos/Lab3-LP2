package lab3;

/**
 * Classe respons�vel por armazenar as informa��es do contato e exibir informa��es sobre o contato.
 * 
 * @author Euclides Ramos - 117210377
 *
 */
public class Contato {
	
	/**
	 * String que armazena o nome do contato.
	 */
	private String nome;
	
	/**
	 * String que armazena o sobrenome do contato
	 */
	private String sobrenome;
	
	/**
	 * Array que armazena os telefones de um determinado contato.
	 */
	private String telefone;
	
	/**
	 * Constr�i um novo contato, recebendo nome, sobrenome e telefone. Caso um desses tr�s seja uma String 
	 * vazia (""), ser� criado uma exce��o.
	 * 
	 * @param nome
	 * @param sobrenome
	 * @param telefone
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		if (nome.equals("") || nome.trim().equals("")) {
			throw new IllegalArgumentException("NOME INV�LIDO!");
		}
		if (sobrenome.equals("") || sobrenome.trim().equals("")) {
			throw new IllegalArgumentException("SOBRENOME INV�LIDO!");
		}
		if (telefone.equals("") || telefone.trim().equals("")) {
			throw new IllegalArgumentException("TELEFONE INV�LIDO!");
		}
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	
	
	/**
	 * M�todo que retorna apenas o nome e sobrenome de um determinado contato.
	 * 
	 * @return
	 */
	public String nomeCompleto() {
		return nome + " " + sobrenome;
	}
	
	/**
	 * M�todo respons�vel por retornar as informa��es do contato (nome, sobrenome e telefone)
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return nome + " " + sobrenome + " - " + telefone + System.lineSeparator();
	}

	/**
	 * M�todo que compara dois objetos. Se forem iguais, retorna "true", se forem diferentes, retorna "false".
	 * 
	 * @return
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}
		Contato outroContato = (Contato) obj;
		if (this.nome.equals(outroContato.nome)) {
			return true;
		}
		return false;
	}
}
