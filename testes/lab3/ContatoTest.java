package lab3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContatoTest {

	private Contato contato;

	@Before
	public void exemploContato() {
		this.contato = new Contato("Euclides", "Ramos", "123456789");
	}
	
	@Test
	public void testToString() {
		assertEquals("Euclides Ramos - 123456789" + System.lineSeparator(), contato.toString());
	}

	@Test
	public void testNomeCompleto() {
		assertEquals("Euclides Ramos", contato.nomeCompleto());
	}
}
