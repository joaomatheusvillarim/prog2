package lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

class RegistroTempoOnlineTest {
	
	@Nested
	class testQuantidadeHorasPadrao {
		
		private RegistroTempoOnline registro = new RegistroTempoOnline("LP2");
		
		@Nested
		class testEstadoInicial {
			
			@Test
			public void testAtingiuMeta() {
				Assertions.assertFalse(registro.atingiuMetaTempoOnline());
			}
			
			@Test
			public void testToString() {
				Assertions.assertEquals(registro.toString(), "LP2 0/120");
			}
			
		}
		
		@Nested
		class testAtingiuMetaFalse {
			
			@BeforeEach
			public void setUp() {
				registro.adicionaTempoOnline(119);
			}
			
			@Test
			public void testAtingiuMeta() {
				Assertions.assertFalse(registro.atingiuMetaTempoOnline());
			}
			
			@Test
			public void testToString() {
				Assertions.assertEquals(registro.toString(), "LP2 119/120");
			}
			
		}
		
		@Nested
		class testAtingiuMetaTrue {
			
			@BeforeEach
			public void setUp() {
				registro.adicionaTempoOnline(120);
			}
			
			@Test
			public void testAtingiuMeta() {
				Assertions.assertTrue(registro.atingiuMetaTempoOnline());
			}
			
			@Test
			public void testToString() {
				Assertions.assertEquals(registro.toString(), "LP2 120/120");
			}
			
		}
		
	}
	
	@Nested
	class testQuantidadeHorasPersonalizado {
		
		private RegistroTempoOnline registro = new RegistroTempoOnline("Calc1", 240);
		
		@Nested
		class testEstadoInicial {
			
			@Test
			public void testAtingiuMeta() {
				Assertions.assertFalse(registro.atingiuMetaTempoOnline());
			}
			
			@Test
			public void testToString() {
				Assertions.assertEquals(registro.toString(), "Calc1 0/240");
			}
			
		}
		
		@Nested
		class testAtingiuMetaFalse {
			
			@BeforeEach
			public void setUp() {
				registro.adicionaTempoOnline(239);
			}
			
			@Test
			public void testAtingiuMeta() {
				Assertions.assertFalse(registro.atingiuMetaTempoOnline());
			}
			
			@Test
			public void testToString() {
				Assertions.assertEquals(registro.toString(), "Calc1 239/240");
			}
			
		}
		
		@Nested
		class testAtingiuMetaTrue {
			
			@BeforeEach
			public void setUp() {
				registro.adicionaTempoOnline(240);
			}
			
			@Test
			public void testAtingiuMeta() {
				Assertions.assertTrue(registro.atingiuMetaTempoOnline());
			}
			
			@Test
			public void testToString() {
				Assertions.assertEquals(registro.toString(), "Calc1 240/240");
			}
			
		}
		
	}

}
