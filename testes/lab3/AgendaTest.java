package lab3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AgendaTest {
	
	private Agenda agenda;
	private Contato contato1;
	private Contato contato2;

	@Before
	public void exemploContato() {
		this.agenda = new Agenda();
		this.contato1 = new Contato("Euclides", "Ramos", "123456789");
		this.contato2 = new Contato("Eduardo", "Pereira", "987654321");
		this.agenda.cadastrarContato(1, contato1);
		this.agenda.cadastrarContato(2, contato2);
	}
	
	@Test
	public void testCadastrarContatoPosicao1() {
		assertEquals(true, agenda.cadastrarContato(1, contato1));
	} 

	@Test
	public void testCadastrarContatoPosicao100() {
		assertEquals(true, agenda.cadastrarContato(100, contato1));
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testCadastrarContatoPosicao0() {
		agenda.cadastrarContato(0, contato1);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testCadastrarContatoPosicao101() {
		agenda.cadastrarContato(101, contato1); 
	}
	
	@Test
	public void testExibirContato() {
		assertEquals("Euclides Ramos - 123456789" + System.lineSeparator(), agenda.exibirContato(1));
	}
	
	@Test
	public void testExibirContatoPosicaoInvalida() {
		assertEquals("POSIÇÃO INVÁLIDA!" + System.lineSeparator(), agenda.exibirContato(3));
	}
	
	@Test
	public void testListarContato() {
		assertEquals("1 - Euclides Ramos" + System.lineSeparator() + "2 - Eduardo Pereira" + System.lineSeparator(), agenda.listarContato());
	}
}
