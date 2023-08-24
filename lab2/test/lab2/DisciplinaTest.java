package lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

class DisciplinaTest {
	
	@Nested
	class testPadrao {
		
		private Disciplina disciplina = new Disciplina("Lógica para Computação");
		
		@Nested
		class testEstadoInicial {
			
			@Test
			public void testAprovado() {
				Assertions.assertFalse(disciplina.aprovado());
			}
			
			@Test
			public void testToString() {
				Assertions.assertEquals(disciplina.toString(), "Lógica para Computação 0 0.0"
						+ " [0.0, 0.0, 0.0, 0.0]");
			}
			
		}
		
		@Nested
		class testNotasCadastradas {
			
			@BeforeEach
			public void setUp() {
				disciplina.cadastraHoras(5);
				disciplina.cadastraNota(1, 10);
				disciplina.cadastraNota(3, 9);
				disciplina.cadastraNota(4, 8);
				disciplina.cadastraNota(2, 0.6);
			}
			
			@Test
			public void testAprovadoFalse() {
				Assertions.assertFalse(disciplina.aprovado());
			}
			
			@Test
			public void testToStringReprovado() {
				Assertions.assertEquals(disciplina.toString(), "Lógica para Computação 5 6.9"
						+ " [10.0, 0.6, 9.0, 8.0]");
			}
			
			@Test
			public void testAprovadoTrue() {
				disciplina.cadastraNota(2, 1.0);
				Assertions.assertTrue(disciplina.aprovado());
			}
			
			@Test
			public void testToStringAprovado() {
				disciplina.cadastraNota(2, 1.0);
				Assertions.assertEquals(disciplina.toString(), "Lógica para Computação 5 7.0"
						+ " [10.0, 1.0, 9.0, 8.0]");
			}
			
		}
		
	}
	
	@Nested
	class testPersonalizadoSemPesos {
		
		private Disciplina disciplina = new Disciplina("Teoria dos Grafos", 5);
		
		@Nested
		class testEstadoInicial {
			
			@Test
			public void testAprovado() {
				Assertions.assertFalse(disciplina.aprovado());
			}
			
			@Test
			public void testToString() {
				Assertions.assertEquals(disciplina.toString(), "Teoria dos Grafos 0 0.0"
						+ " [0.0, 0.0, 0.0, 0.0, 0.0]");
			}
			
		}
		
		@Nested
		class testNotasCadastradas {
			
			@BeforeEach
			public void setUp() {
				disciplina.cadastraHoras(10);
				disciplina.cadastraNota(1, 10);
				disciplina.cadastraNota(3, 9);
				disciplina.cadastraNota(5, 7);
				disciplina.cadastraNota(4, 8);
				disciplina.cadastraNota(2, 0.6);
			}
			
			@Test
			public void testAprovadoFalse() {
				Assertions.assertFalse(disciplina.aprovado());
			}
			
			@Test
			public void testToStringReprovado() {
				Assertions.assertEquals(disciplina.toString(), "Teoria dos Grafos 10 6.9"
						+ " [10.0, 0.6, 9.0, 8.0, 7.0]");
			}
			
			@Test
			public void testAprovadoTrue() {
				disciplina.cadastraNota(2, 1);
				Assertions.assertTrue(disciplina.aprovado());
			}
			
			@Test
			public void testToStringAprovado() {
				disciplina.cadastraNota(2, 1);
				Assertions.assertEquals(disciplina.toString(), "Teoria dos Grafos 10 7.0"
						+ " [10.0, 1.0, 9.0, 8.0, 7.0]");
			}
			
		}
		
	}
	
	@Nested
	class testPersonalizadoComPesos {
		
		int [] pesos = {1, 2, 3};
		private Disciplina disciplina = new Disciplina("Estrutura de Dados", 3, pesos);
		
		@Nested
		class testEstadoInicial {
			
			@Test
			public void testAprovado() {
				Assertions.assertFalse(disciplina.aprovado());
			}
			
			@Test
			public void testToString() {
				Assertions.assertEquals(disciplina.toString(), "Estrutura de Dados 0 0.0"
						+ " [0.0, 0.0, 0.0]");
			}
			
		}
		
		@Nested
		class testNotasCadastradas {
			
			@BeforeEach
			public void setUp() {
				disciplina.cadastraHoras(20);
				disciplina.cadastraNota(3, 10);
				disciplina.cadastraNota(1, 1.4);
				disciplina.cadastraNota(2, 5);
			}
			
			@Test
			public void testAprovadoFalse() {
				Assertions.assertFalse(disciplina.aprovado());
			}
			
			@Test
			public void testToStringReprovado() {
				Assertions.assertEquals(disciplina.toString(), "Estrutura de Dados 20 6.9"
						+ " [1.4, 5.0, 10.0]");
			}
			
			@Test
			public void testAprovadoTrue() {
				disciplina.cadastraNota(1, 2);
				Assertions.assertTrue(disciplina.aprovado());
			}
			
			@Test
			public void testToStringAprovado() {
				disciplina.cadastraNota(1, 2);
				Assertions.assertEquals(disciplina.toString(), "Estrutura de Dados 20 7.0"
						+ " [2.0, 5.0, 10.0]");
			}
			
		}
		
	}
	

}