package lab2;

public class RegistroResumos {

	/**
 	* Representação de uma coleção de resumos e suas propriedades.
	 * 
 	* @author João Matheus Pinto Villarim Coutinho de Almeida
 	*/
	
	//atributos
	
	/**
	 * Representa a coleção de resumos.
	*/

	private Resumo[] resumos;
	
	/**
	 * Conta quantos resumos já foram registrados.
	*/

	private int contagem;
	
	//construtores
	
	/**
	 * Constrói uma coleção de resumos com um limite específico para a quantidade de resumos.
	 * 
	 * @param limite Quantidade máxima de resumos
	 */

	public RegistroResumos(int limite) {
		this.resumos = new Resumo[limite];
		this.contagem = 0;
	}
	
	//métodos
	
	/**
	 * Adiciona à esta coleção de resumos um novo resumo, separando seu tema e seu conteúdo.
	 * 
	 * @param tema Título do resumo
	 * @param texto Conteúdo do resumo
	 * */

	public void adiciona(String tema, String texto) {
		Resumo novoResumo = new Resumo(tema, texto);
		this.resumos[this.contagem % this.resumos.length] = novoResumo;
		++this.contagem;
	}
	
	/**
	 * Retorna todos os resumos da coleção, no formato "tema: conteúdo".
	 * 
	 * @return Todos os resumos
	 * */
    
	public String[] pegaResumos() {
		String[] resumosCopiados = new String[conta()];
		for (int i = 0; i < conta(); i++) {
			resumosCopiados[i] = this.resumos[i].toString();
		}
		return resumosCopiados;
	}
	
	/**
	 * Representa o estado geral da coleção, no formato:
	 * "- N resumo(s) cadastrado(s)
	 *  - tema1 | tema2 | ... | temaN"
	 *  
	 *  @return Representação geral da coleção
	 * */

	public String imprimeResumos() {
		String titulos = this.resumos[0].getTitulo();
		for (int i = 1; i < conta(); i++) {
			titulos = titulos + " | " + this.resumos[i].getTitulo();
		}
		return "- " + conta() + " resumo(s) cadastrado(s)\n- " + titulos;
	}
	
	/**
	 * Retorna a quantidade de resumos na coleção.
	 * 
	 * @return Quantidade de resumos
	 * */

	public int conta() {
		return Integer.min(this.contagem, this.resumos.length);
	}
	
	/**
	 * Verifica se na coleção existe resumo com o tema desejado.
	 * 
	 * @param tema Tema a ser verificado
	 * @return Se o tema existe na coleção
	 * */

	public boolean temResumo(String tema) {
		boolean encontrado = false;
		for (Resumo resumo : this.resumos) {
			if (resumo != null && tema.equals(resumo.getTitulo())) {
				encontrado = true;
				break;
			}
		}
		return encontrado;
	}
	
}