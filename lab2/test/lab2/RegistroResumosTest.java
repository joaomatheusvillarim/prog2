package lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

class RegistroResumosTest {
	
	private RegistroResumos registro;

    @BeforeEach
    public void setUp() {
        registro = new RegistroResumos(5);
        registro.adiciona("Classes", "Classes definem um tipo e a base de código para criação"
                + " de objetos.");
        registro.adiciona("Tipos", "Identifica a semântica (operações e significados) de um conjunto"
                + " de dados.");
    }

    @Test
    public void testConta() {
        Assertions.assertEquals(2, registro.conta());
    }

    @Test
    public void testTemResumoTrue() {
        Assertions.assertTrue(registro.temResumo("Classes"));
    }

    @Test
    public void testTemResumoFalse() {
        Assertions.assertFalse(registro.temResumo("Testes"));
    }
	
	@Test
	public void testImprimeResumos() {
		Assertions.assertEquals(registro.imprimeResumos(), "- 2 resumo(s) cadastrado(s)\n"
				+ "- Classes | Tipos");
	}
	
	@Test
	public void testPegaResumos() {
		String[] array = {"Classes: Classes definem um tipo e a base de código para criação de objetos.",
				"Tipos: Identifica a semântica (operações e significados) de um conjunto de dados."};
		Assertions.assertArrayEquals(array, registro.pegaResumos());
	}
	
	@Nested
	class testLimiteDeResumos {
		
		@BeforeEach
		public void adicionaMaisResumos() {
			registro.adiciona("Encapsulamento", "Uma classe encapsula dados e comportamento em cima de dados.");
			registro.adiciona("Testes", "Testes de unidade, testes de integração, testes de sistema e testes."
					+ "de aceitação");
			registro.adiciona("Testes de unidade", "No contexto de POO, a unidade é a classe, então testamos"
					+ "as funcionalidades de cada classe como base do sistema.");
		}
		
		@Test
		public void testImprimeResumosNoLimite() {
			Assertions.assertEquals(registro.imprimeResumos(), "- 5 resumo(s) cadastrado(s)\n"
					+ "- Classes | Tipos | Encapsulamento | Testes | Testes de unidade");
		}
		
		@Test
		public void testImprimeResumosPassaDoLimite() {
			registro.adiciona("Testes de integração", "Usa-se para testar o funcionamento de uma classe "
					+ "interagindo com outra.");
			registro.adiciona("Testes de sistema", "Usa-se para testar o sistema como um todo, ou seja, "
					+ "diversas classes interagindo entre si.");
			registro.adiciona("Testes de aceitação", "O usuário testa se o programa está de acordo com "
					+ "as especificações desejadas por ele.");
			Assertions.assertEquals(registro.imprimeResumos(), "- 5 resumo(s) cadastrado(s)\n"
					+ "- Testes de integração | Testes de sistema | Testes de aceitação | Testes | Testes "
					+ "de unidade");
		}
		
	}

}
