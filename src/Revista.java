import java.time.LocalDate;

public class Revista extends Publicacion{

    private final String nombre;

    private final String tematica;

    private final Periodicidad periodicidad;

    private final LocalDate diaPublicacion;




    public Revista(String editorial, int numPaginas, Color color, String nombre, String tematica, Periodicidad periodicidad) {
        super(editorial, numPaginas, color);
        this.nombre = nombre;
        this.tematica = tematica;
        this.periodicidad = periodicidad;
        this.diaPublicacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public String getTematica() {
        return tematica;
    }

    public Periodicidad getPeriodicidad() {
        return periodicidad;
    }

    public LocalDate getDiaPublicacion() {
        return diaPublicacion;
    }

    public Revista(String editorial, int numPaginas, Color color, String nombre, String tematica, Periodicidad periodicidad, LocalDate diaPublicacion) {
        super(editorial, numPaginas, color);
        this.nombre = nombre;
        this.tematica = tematica;
        this.periodicidad = periodicidad;
        this.diaPublicacion = diaPublicacion;
    }

    @Override
    public String toString() {
        return "Nombre de la revista: " + nombre +
                ", dia de publicación: " + diaPublicacion;
    }

    public enum Periodicidad {
        SEMANAL,
        MENSUAL,
        TRIMESTRAL
    }


}
