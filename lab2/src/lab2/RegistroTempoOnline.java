package lab2;

public class RegistroTempoOnline {
	
	/**
	 * Representação do tempo online registrado pelo aluno para uma disciplina.
	 * 
	 * @author João Matheus Pinto Villarim Coutinho de Almeida
	 * */
	
	//atributos
	
	/**
	 * Representa o nome da disciplina.
	*/

	private String nome;
	
	/**
	 * Representa a expectativa de quantidade de horas a serem registradas.
	*/

	private int horasEsperadas;
	
	/**
	 * Representa a quantidade de horas registradas.
	*/

	private int horasRegistradas;
	
	//construtores
	
	/**
	 * Constrói a representação do registro de tempo online para uma disciplina específica em que o aluno está matriculado, considerando
	 * uma expectativa de quantas horas serão registradas.
	 * 
	 * @param nome nome da disciplina
	 * @param horas expectativa de horas
	 * */
	
	public RegistroTempoOnline(String nome, int horas) {
		this.nome = nome;
		this.horasEsperadas = horas;
	}
	
	/**
	 * Constrói a representação do registro de tempo online para uma disciplina específica em que o aluno está matriculado, com a expectativa
	 * padronizada de que serão registradas 120 horas.
	 * 
	 * @param nome nome da disciplina
	 * */
	
	public RegistroTempoOnline(String nome) {
		this(nome, 120);
	}
	
	//métodos
	
	/**
	 * Altera cumulativamente o número de horas online registradas nesta disciplina.
	 * 
	 * @param valor número de horas a serem adicionadas
	 * */
	
	public void adicionaTempoOnline(int valor) {
		this.horasRegistradas += valor;
	}
	
	/**
	 * Indica se o aluno cumpriu a expectativa de horas online registradas nesta disciplina.
	 * 
	 * @return se o aluno cumpriu a expectativa ou não
	 * */
	
	public boolean atingiuMetaTempoOnline() {
		return this.horasRegistradas >= this.horasEsperadas;
		
	}
	
	/**
	 * Representação textual do registro de horas online da matéria. Segue o formato "Nome horasRegistradas/horasEsperadas"
	 * 
	 * @return representação em String do registro de horas online
	 * */
	
	public String toString() {
		return this.nome + " " + this.horasRegistradas + "/" + this.horasEsperadas;
		
	}


}
