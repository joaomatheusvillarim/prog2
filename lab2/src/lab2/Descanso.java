package lab2;

public class Descanso {
	
	/**
	 * Represenção da rotina de descanso do estudante.
	 * 
	 * @author João Matheus Pinto Villarim Coutinho de Almeida
	 * */
	
	//atributos
	
	/**
	 * Representação a quantidade de horas de descanso do estudante.
	*/
	
	private int horas;
	
	/**
	 * Representação a quantidade de semanas de aula.
	*/
	
	private int semanas;
	
	/**
	 * Representa o emoji escolhido pelo estudante.
	*/
	
	private String emoji;
	
	//construtores
	
	/**
	 * Constrói a representação de descanso, sem parâmetros passados, com 0 horas e 0 semanas.
	 * */
	
	public Descanso() {
		this.horas = 0;
		this.semanas = 0;
		this.emoji = "";
	}
	
	//métodos
	
	/**
	 * Altera o número de horas usadas para descansar, não cumulativamente.
	 * 
	 * @param valor número de horas
	 * */
	
	public void defineHorasDescanso(int valor) {
		this.horas = valor;
		this.emoji = "";
	}
	
	/**
	 * Altera o número de semanas de aula, não cumulativamente.
	 * 
	 * @param valor número de semanas
	 * */
	
	public void defineNumeroSemanas(int valor) {
		this.semanas = valor;
		this.emoji = "";
	}
	
	/**
	 * Adiciona o emoji que representa a sensação do aluno em relação à sua rotina.
	 * 
	 * @param emoji emoticon a ser adicionado
	 * */
	
	public void definirEmoji(String emoji) {
		this.emoji = emoji;
	}
	
	/**
	 * Recebe o estado do aluno em relação ao seu descanso, considerando a proporção entre o número de horas
	 *  que este usou para descansar e o número de semanas de aula que se passaram.
	 * 
	 * @return estado de descanso do aluno
	 * */
	
	public String getStatusGeral() {
		String estado = "cansado";
		if (this.semanas == 0) {
			estado = "ERRO: quantidade inválida de semanas!";
		} else {
			if (this.horas/this.semanas >= 26) {
				estado = "descansado";
			}
			if (!emoji.isEmpty()) {
				estado += " - " + emoji;
			}
		}
		return estado;
	}

}
