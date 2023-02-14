import java.time.LocalDate;
import java.util.Random;

public class Cliente {

    private String nombre;

    private String DNI;

    private final GenericList<Ejemplar> prestados;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.DNI = generateDNI();
        this.prestados = new GenericList<>();
    }

    public static String generateDNI() {
        String DNI_LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";
        Random rand = new Random();
        int dniNumber = 100000000 + rand.nextInt(900000000);
        int letterIndex = dniNumber % 23;
        return "" + dniNumber + DNI_LETTERS.charAt(letterIndex);
    }


        public void prestamo(Ejemplar ejemplar) {
        if (prestados.size()>=3) return;
        ejemplar.setDiaDevolucion(null);
        ejemplar.setDiaPrestamo(LocalDate.now());
        prestados.add(ejemplar);
    }

        public void devolucion(Ejemplar ejemplar) {
        int num = prestados.search(ejemplar);
        if (num==-1) return;
        ejemplar.setDiaDevolucion(LocalDate.now());
        prestados.remove(num);
    }

    public GenericList<Ejemplar> getPrestados() {
        return prestados;
    }

    @Override
    public String toString() {
        return nombre + " DNI: " + DNI;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
