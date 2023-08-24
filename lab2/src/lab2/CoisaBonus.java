package lab2;

/**
 * Testes das funcionalidades bônus, são elas: "mais notas na disciplina" e "comentário sobre a rotina de descanso".
 * 
 * @author João Matheus Pinto Villarim Coutinho de Almeida
 * */

public class CoisaBonus {
	public static void main(String[] args) {
		maisNotasNaDisciplina();
		System.out.println("-----");
		comentarioSobreARotinaDeDescanso();
	}
	
	public static void maisNotasNaDisciplina() {
		Disciplina calc1 = new Disciplina("CALCULO 1", 5);
		calc1.cadastraHoras(10);
		calc1.cadastraNota(1, 10.0);
		calc1.cadastraNota(2, 9.5);
		calc1.cadastraNota(3, 8.0);
		System.out.println(calc1.aprovado());
		calc1.cadastraNota(4, 5.0);
		calc1.cadastraNota(5, 10.0);
		System.out.println(calc1.aprovado());
		System.out.println(calc1.toString());
		//,
		int [] pesos = {1, 1, 1, 2, 3, 6, 6};
		Disciplina lp2 = new Disciplina("LABORATORIO DE PROGRAMACAO 2", 7, pesos);
		lp2.cadastraHoras(20);
		lp2.cadastraNota(1, 10.0);
		lp2.cadastraNota(2, 10.0);
		lp2.cadastraNota(3, 9.5);
		lp2.cadastraNota(4, 9.5);
		lp2.cadastraNota(5, 9.0);
		lp2.cadastraNota(6, 8.5);
		lp2.cadastraNota(7, 8.5);
		System.out.println(lp2.aprovado());
		System.out.println(lp2.toString());
	}
	
	public static void comentarioSobreARotinaDeDescanso() {
		Descanso descanso = new Descanso();
		descanso.defineHorasDescanso(30);
		descanso.defineNumeroSemanas(1);
		descanso.definirEmoji("<(^_^<)");
		System.out.println(descanso.getStatusGeral());
		descanso.defineHorasDescanso(50);
		descanso.defineNumeroSemanas(2);
		descanso.definirEmoji(":o");
		System.out.println(descanso.getStatusGeral());
		descanso.defineHorasDescanso(78);
		descanso.defineNumeroSemanas(3);
		descanso.definirEmoji("¯\\_(ツ)_/¯");
		System.out.println(descanso.getStatusGeral());
	}

}
