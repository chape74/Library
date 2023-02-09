import java.util.Random;

public class Libro extends Publicacion {
    private final String autor;
    private final String titulo;
    private final String isbn;

    public Libro(String editorial, int numPaginas, Color color, String autor, String titulo) {
        super(editorial, numPaginas, color);
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = generateISBN();
    }

    public static String generateISBN() {
        Random random = new Random();
        StringBuilder isbn = new StringBuilder();
        for (int i = 0; i < 13; i++) {
            isbn.append(random.nextInt(10));
            if (i == 2 || i == 3 || i == 5 || i == 11) {
                isbn.append("-");
            }
        }
        return isbn.toString();
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo +
                "ISBN: " + isbn;
    }
}
