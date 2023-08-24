package lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

class ResumoTest {
	
	@Nested
	class exemplo1 {
		
		private Resumo resumo = new Resumo("Criação de classes", "Uma classe é formada por atributos,"
				+ " métodos e construtores.");
		
		@Test
		public void testGetTitulo1() {
			Assertions.assertEquals(resumo.getTitulo(), "Criação de classes");
		}
		
		@Test
		public void testGetConteudo1() {
			Assertions.assertEquals(resumo.getConteudo(), "Uma classe é formada por atributos, métodos"
					+ " e construtores.");
		}
		
		@Test
		public void testToString1() {
			Assertions.assertEquals(resumo.toString(), "Criação de classes: Uma classe é formada por"
					+ " atributos, métodos e construtores.");
		}
		
	}
	
	@Nested
	class exemplo2 {
		
		private Resumo resumo = new Resumo("Criação de testes", "Classes de testes servem para corrigir"
				+ " erros do programa de maneira mais eficiente.");
		
		@Test
		public void testGetTitulo1() {
			Assertions.assertEquals(resumo.getTitulo(), "Criação de testes");
		}
		
		@Test
		public void testGetConteudo1() {
			Assertions.assertEquals(resumo.getConteudo(), "Classes de testes servem para corrigir erros"
					+ " do programa de maneira mais eficiente.");
		}
		
		@Test
		public void testToString1() {
			Assertions.assertEquals(resumo.toString(), "Criação de testes: Classes de testes servem para"
					+ " corrigir erros do programa de maneira mais eficiente.");
		}
		
	}
	
	@Nested
	class exemplo3 {
		
		private Resumo resumo = new Resumo("Encapsulamento", "Uma classe encapsula dados e comportamento em"
				+ " cima de dados.");
		
		@Test
		public void testGetTitulo1() {
			Assertions.assertEquals(resumo.getTitulo(), "Encapsulamento");
		}
		
		@Test
		public void testGetConteudo1() {
			Assertions.assertEquals(resumo.getConteudo(), "Uma classe encapsula dados e comportamento"
					+ " em cima de dados.");
		}
		
		@Test
		public void testToString1() {
			Assertions.assertEquals(resumo.toString(), "Encapsulamento: Uma classe encapsula dados e"
					+ " comportamento em cima de dados.");
		}
		
	}
	
}
