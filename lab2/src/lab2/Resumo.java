package lab2;

/**
 * Representação de um resumo, manipulado pela classe RegistroResumos. Um resumo
 * é formado por título e conteúdo.
 * 
 * @author João Matheus Pinto Villarim Coutinho de Almeida
*/

public class Resumo {

    /**
     * Representação de um resumo, manipulado pela classe RegistroResumos. Um resumo
     * é formado por título e conteúdo.
     * 
     * @author João Matheus Pinto Villarim Coutinho de Almeida
    */

    //atributos

    /**
     * Representa o título do resumo.
    */

    private String titulo;

    /**
     * Representa o conteúdo do resumo.
    */

    private String conteudo;

    //construtores

    /**
     * Constrói um resumo, a partir de título e conteúdo.
     * 
     * @param titulo O título do resumo.
     * @param conteudo O conteúdo do resumo.
    */

    public Resumo(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    //métodos

    /**
     * Retorna o título do resumo.
     * 
     * @return O título do resumo
    */

    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Retorna o conteúdo do resumo.
     * 
     * @return O conteúdo do resumo.
    */

    public String getConteudo() {
        return this.conteudo;
    }

    /**
     * Retorna uma representação textual do resumo. Segue o formato:
     * "TITULO: CONTEUDO" com TITULO sendo o título, e CONTEUDO sendo o conteúdo.
     * 
     * @return Representação textual do resumo.
    */
    
    public String toString() {
        return this.titulo + ": " + this.conteudo;
    }
}
