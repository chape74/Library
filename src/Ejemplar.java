import java.time.LocalDate;
import java.util.Random;

public class Ejemplar {

    private Publicacion publicacion;
    private final int codigoEjemplar;
    private boolean enUso;
    private LocalDate diaPrestamo;
    private LocalDate diaDevolucion;

    private Ejemplar(Publicacion publicacion) {
        this.publicacion = publicacion;
        codigoEjemplar = new Random().nextInt(1000000000);
    }

    private Ejemplar(Publicacion publicacion, int codigoEjemplar) {
        this.publicacion = publicacion;
        this.codigoEjemplar = codigoEjemplar;
    }

    public static Ejemplar crearEjemplar(Publicacion publicacion) {
        Ejemplar aux = new Ejemplar(publicacion);
        if (aux.publicacion instanceof Libro || aux.publicacion.getTieneEjemplar()){
            aux.publicacion.setTieneEjemplar(true);
            return aux;
        }
        return null;
    }

    public static Ejemplar crearEjemplar(Publicacion publicacion, int codigoEjemplar){
        Ejemplar aux = new Ejemplar(publicacion);
        if (aux.publicacion instanceof Libro || aux.publicacion.getTieneEjemplar()) {
            aux.publicacion.setTieneEjemplar(true);
            return aux;
        }
        return null;
    }

    public void eliminarPublicacion() {
        this.publicacion=null;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public int getCodigoEjemplar() {
        return codigoEjemplar;
    }

    public LocalDate getDiaPrestamo() {
        return diaPrestamo;
    }

    public LocalDate getDiaDevolucion() {
        return diaDevolucion;
    }

    public boolean isEnUso() {
        return enUso;
    }

    public void setDiaPrestamo(LocalDate diaPrestamo) {
        this.diaPrestamo = diaPrestamo;
    }

    public void setDiaDevolucion(LocalDate diaDevolucion) {
        this.diaDevolucion = diaDevolucion;
    }

    public void setEnUso(boolean enUso) {
        this.enUso = enUso;
    }

    @Override
    public String toString() {
        return "Ejemplar de " + publicacion +
                ", codigo del ejemplar= " + codigoEjemplar;
    }
}
