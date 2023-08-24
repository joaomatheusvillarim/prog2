package lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

class DescansoTest {
	
	private Descanso descanso = new Descanso();
	
	@Test
	public void testEstadoInicial() {
		Assertions.assertEquals(descanso.getStatusGeral(), "ERRO: quantidade inválida de semanas!");
	}
	
	@Nested
	class testNumeroValidoDeSemanas {
		
		@BeforeEach
		public void setUp() {
			descanso.defineNumeroSemanas(1);
		}
		
		@Nested
		class testCansado {
			
			@BeforeEach
			public void setUp() {
				descanso.defineHorasDescanso(25);
			}
			
			@Test
			public void testGetStatusGeralSemEmoji() {
				Assertions.assertEquals(descanso.getStatusGeral(), "cansado");
			}
			
			@Test
			public void testGetStatusGeralComEmoji() {
				descanso.definirEmoji(":)");
				Assertions.assertEquals(descanso.getStatusGeral(), "cansado - :)");
			}
			
			@Test
			public void testGetStatusGeralEmojiPerdido() {
				descanso.definirEmoji(":)");
				descanso.defineNumeroSemanas(2);
				Assertions.assertEquals(descanso.getStatusGeral(), "cansado");
			}
			
		}
		
		@Nested
		class testDescansado {
			
			@BeforeEach
			public void setUp() {
				descanso.defineHorasDescanso(26);
			}
			
			@Test
			public void testGetStatusGeralSemEmoji() {
				Assertions.assertEquals(descanso.getStatusGeral(), "descansado");
			}
			
			@Test
			public void testGetStatusGeralComEmoji() {
				descanso.definirEmoji(":D");
				Assertions.assertEquals(descanso.getStatusGeral(), "descansado - :D");
			}
			
			@Test
			public void testGetStatusGeralEmojiPerdido() {
				descanso.definirEmoji(":D");
				descanso.defineHorasDescanso(30);
				Assertions.assertEquals(descanso.getStatusGeral(), "descansado");
			}
			
		}
		
	}

}
