/**
 * Clase que representa una biblioteca.
 */
import java.util.ArrayList;

class ClaseBiblioteca {

    // Lista de libros en la biblioteca.
    private ArrayList<ClaseLibro> libros;
    /**
     * Constructor de la clase Biblioteca.
     * Inicializa la lista de libros.
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public ClaseBiblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Método para registrar un libro en la biblioteca.
     * @param libro El libro a registrar.
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void registrarLibro(ClaseLibro libro) {
        libros.add(libro);
    }

    /**
     * Método para buscar un libro por título en la biblioteca.
     * @param titulo El título del libro a buscar.
     * @return El libro si se encuentra, null en caso contrario.
     * Complejidad temporal: O(N) Tiempo lineal.
     */
    public ClaseLibro buscarLibro(String titulo) {
        for (ClaseLibro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }

        return null;
        /**
         * Método para mostrar los títulos de los libros en la biblioteca.
         * Complejidad temporal: O(N) Tiempo lineal.
         */
}

    public void mostrarLibros() {
        for (ClaseLibro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }
}