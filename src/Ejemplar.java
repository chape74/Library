import java.time.LocalDate;
import java.util.Random;

public class Ejemplar {

    private final Publicacion publicacion;
    private final int codigoEjemplar;
    private LocalDate diaPrestamo;
    private LocalDate diaDevolucion;

    public Ejemplar(Publicacion publicacion) {
        this.publicacion = publicacion;
        codigoEjemplar = new Random().nextInt(1000000000);
    }



    public void setDiaPrestamo(LocalDate diaPrestamo) {
        this.diaPrestamo = diaPrestamo;
    }

    public void setDiaDevolucion(LocalDate diaDevolucion) {
        this.diaDevolucion = diaDevolucion;
    }


    @Override
    public String toString() {
        return "Ejemplar de " + publicacion +
                " - Código del ejemplar: " + codigoEjemplar +
                " - Dia préstamo: " + diaPrestamo +
                " - Dia devolución: " + diaDevolucion
                ;
    }
}
