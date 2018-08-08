package lab3;

/**
 * Classe responsável por armazenar as informações do contato e exibir informações sobre o contato.
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
	 * Constrói um novo contato, recebendo nome, sobrenome e telefone. Caso um desses três seja uma String 
	 * vazia (""), será criado uma exceção.
	 * 
	 * @param nome
	 * @param sobrenome
	 * @param telefone
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		if (nome.equals("") || nome.trim().equals("")) {
			throw new IllegalArgumentException("NOME INVÁLIDO!");
		}
		if (sobrenome.equals("") || sobrenome.trim().equals("")) {
			throw new IllegalArgumentException("SOBRENOME INVÁLIDO!");
		}
		if (telefone.equals("") || telefone.trim().equals("")) {
			throw new IllegalArgumentException("TELEFONE INVÁLIDO!");
		}
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	
	
	/**
	 * Método que retorna apenas o nome e sobrenome de um determinado contato.
	 * 
	 * @return
	 */
	public String nomeCompleto() {
		return nome + " " + sobrenome;
	}
	
	/**
	 * Método responsável por retornar as informações do contato (nome, sobrenome e telefone)
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return nome + " " + sobrenome + " - " + telefone + System.lineSeparator();
	}

	/**
	 * Método que compara dois objetos. Se forem iguais, retorna "true", se forem diferentes, retorna "false".
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
