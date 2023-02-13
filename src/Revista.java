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
        return "Revista: " + nombre +
                " - Periodicidad: " + getPeriodicidad();
    }

    public enum Periodicidad {
        SEMANAL("Semanal"),
        MENSUAL("Mensual"),
        TRIMESTRAL("Mensual");

        private String perio;

        Periodicidad(String perio) {
            this.perio = perio;
        }
        @Override
        public String toString() {
            return perio;
        }
    }


}
