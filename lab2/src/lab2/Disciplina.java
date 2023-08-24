package lab2;

import java.util.Arrays;

public class Disciplina {
	
	/**
	 * Representação de uma disciplina, com seu nome, horas de esudo, notas e pesos para as notas.
	 * 
	 * @author João Matheus Pinto Villarim Coutinho de Almeida
	 * */
	
	//atributos
	
	/**
	 * Representa o nome da disciplina.
	*/

	private String nome;
	
	/**
	 * Representa a quantidade de horas de estudo registradas na disciplina.
	*/

	private int horasDeEstudo;
	
	/**
	 * Representa a coleção de notas da disciplina.
	*/

	private double[] notas;
	
	/**
	 * Representa a coleção de pesos para cada nota da disciplina.
	*/

	private int[] pesos;
	
	//construtores
	
	/**
	 * Constrói uma disciplina a partir de seu nome, com 0 horas de estudo, 4 notas 0 a serem alteradas
	 * posteriormente e pesos iguais para cada nota.
	 * 
	 * @param nome nome da disciplina
	 * */
	
	public Disciplina(String nome) {
		this.nome = nome;
		this.horasDeEstudo = 0;
		this.notas = new double[4];
		this.pesos = new int[4];
		Arrays.fill(this.pesos, 1);
	}
	
	/**
	 * Constrói uma disciplina a partir de seu nome, com 0 horas de estudo, X notas 0 a serem alteradas
	 * posteriormente e pesos iguais para cada nota.
	 * 
	 * @param nome nome da disciplina
	 * @param tamanho o número X de notas
	 * */
	
	public Disciplina(String nome, int tamanho) {
		this.nome = nome;
		this.horasDeEstudo = 0;
		this.notas = new double[tamanho];
		this.pesos = new int[tamanho];
		Arrays.fill(this.pesos, 1);
	}
	
	/**
	 * Constrói uma disciplina a partir de seu nome, com 0 horas de estudo, X notas 0 a serem alteradas
	 * posteriormente e pesos específicos para cada nota.
	 * 
	 * @param nome nome da disciplina
	 * @param tamanho o número X de notas
	 * @param pesos o conjunto ordenado de pesos
	 * */
	
	public Disciplina(String nome, int tamanho, int[] pesos) {
		this.nome = nome;
		this.horasDeEstudo = 0;
		this.notas = new double[tamanho];
		this.pesos = pesos;
	}
	
	//métodos
	
	/**
	 * Altera cumulativamente o número de horas utilizadas para estudar esta disciplina.
	 * 
	 * @param valor número de horas a ser adicionado
	 * */
	
	public void cadastraHoras(int valor) {
		this.horasDeEstudo += valor;
		
	}
	
	/**
	 * Altera uma das notas do aluno na disciplina, considerando que há uma ordem específica para o
	 * conjunto de notas.
	 * 
	 * @param numeroNota posição da nota no conjunto
	 * @param valorNota valor da nota
	 * */
	
	public void cadastraNota(int numeroNota, double valorNota) {
		this.notas[numeroNota-1] = valorNota;
		
	}
	
	//fazer método privado calcularMedia()
	
	/**
	 * Indica se o aluno foi aprovado nesta disciplina, de acordo com a média de suas notas.
	 * 
	 * @return status da aprovação do aluno
	 * */
	
	public boolean aprovado() {
		return media() >= 7;
	}
	
	/**
	 * Representação em String da disciplina. Segue o formato "Nome horasDeEstudo média [nota1, nota2,
	 * nota3, nota4]".
	 * 
	 * @return representação em String da disciplina
	 * */
	
	public String toString() {
		return String.format("%s %d %.1f %s", this.nome, this.horasDeEstudo, media(),
				Arrays.toString(this.notas));
	}
	
	/**
	 * Retorna a média ponderada das notas desta disciplina.
	 * 
	 * @return Média ponderada das notas.
	 * */
	
	private double media() {
		double soma = 0;
		int somaPesos = 0;
		for (int i = 0; i < this.notas.length; i++) {
			soma += this.notas[i] * this.pesos[i];
			somaPesos += this.pesos[i];
		}
		return soma/somaPesos;
	}


}
