/**
 * Clase principal que ejecuta el programa.
 */
public class principal {
    /**
     * Método principal que se ejecuta al iniciar el programa.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Complejidad temporal: O(1) Tiempo constante.
        ClaseBiblioteca bibliotecaKonradLorenz = new ClaseBiblioteca();

        ClaseLibro libro1 = new ClaseLibro("Cien años de soledad", "Gabriel García Márquez", 496);
        ClaseLibro libro2 = new ClaseLibro("El código Da Vinci", "Dan Brown", 656);
        ClaseLibro libro3 = new ClaseLibro("1984", "George Orwell", 326);
        ClaseLibro libro4 = new ClaseLibro("El Hobbit", "J.R.R. Tolkien", 310);
        ClaseLibro libro5 = new ClaseLibro("La Odisea", "Homero", 448);
        // Registro de libros en la biblioteca. Complejidad temporal: O(1) Tiempo constante
        bibliotecaKonradLorenz.registrarLibro(libro1);
        bibliotecaKonradLorenz.registrarLibro(libro2);
        bibliotecaKonradLorenz.registrarLibro(libro3);
        bibliotecaKonradLorenz.registrarLibro(libro4);
        bibliotecaKonradLorenz.registrarLibro(libro5);
    }
    }