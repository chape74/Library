import java.time.LocalDate;

public class Periodico extends Publicacion {

    private final String nombre;

    private final LocalDate diaPublicacion;

    public Periodico(String editorial, int numPaginas, Color color, String nombre) {
        super(editorial, numPaginas, color);
        this.nombre = nombre;
        this.diaPublicacion = LocalDate.now();
    }

    public String toString() {
        return "Periódico: " + nombre +
                " - dia de publicación: " + diaPublicacion;
    }
}
