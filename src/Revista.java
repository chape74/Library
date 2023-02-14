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

    @Override
    public String toString() {
        return "Revista: " + nombre +
                " - Temática: " + tematica +
                " - Periodicidad: " + periodicidad +
                " - Dia de Publicación: " + diaPublicacion;
    }

    public enum Periodicidad {
        SEMANAL("Semanal"),
        MENSUAL("Mensual"),
        TRIMESTRAL("Mensual");

        private final String periodicidad;

        Periodicidad(String periodicidad) {
            this.periodicidad = periodicidad;
        }
        @Override
        public String toString() {
            return periodicidad;
        }
    }


}
