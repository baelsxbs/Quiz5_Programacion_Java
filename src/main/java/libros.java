import java.util.ArrayList;
/**
 * ClaseLibro es una clase que representa un libro con título, autor y número de páginas.
 */

class ClaseLibro {
    private String titulo;
    private String autor;
    private int numPaginas;

    /**
     * Constructor de la clase ClaseLibro.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param numPaginas El número de páginas del libro.
     * Complejidad temporal: O(1) Tiempo constante.
     */




    public ClaseLibro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        /**
         * Método para obtener el título del libro.
         * @return El título del libro.
         * Complejidad temporal: O(1) Tiempo constante.
         */
    }

    public String getTitulo() {
        return titulo;
    }

    /**
     * Método para establecer el título del libro.
     * @param titulo El nuevo título del libro.
     * Complejidad temporal: O(1) Tiempo constante.
     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        /**
         * Método para obtener el autor del libro.
         * @return El autor del libro.
         * Complejidad temporal: O(1) Tiempo constante.
         */
    }

    public String getAutor() {
        return autor;
        /**
         * Método para obtener el autor del libro.
         * @return El autor del libro.
         * Complejidad temporal: O(1) Tiempo constante.
         */
    }

    public void setAutor(String autor) {
        this.autor = autor;
        /**
         * Método para obtener el número de páginas del libro.
         * @return El número de páginas del libro.
         * Complejidad temporal: O(1) Tiempo constante.
         */

    }
    public int getNumPaginas() {
        return numPaginas;
    }
    /**
     * Método para establecer el número de páginas del libro.
     * @param numPaginas El nuevo número de páginas del libro.
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}

