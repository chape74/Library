import java.time.LocalDate;
import java.util.Random;

public class Abonado {

    private String nombre;

    private String DNI;

    private GenericList<Ejemplar> prestados;

    public Abonado(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.prestados = new GenericList<>();
    }
    public Abonado(String nombre) {
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

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public GenericList<Ejemplar> getPrestados() {
        return prestados;
    }



//    public boolean prestamo(Ejemplar ejemplar) {
//        if (ejemplar==null || ejemplar.isEnUso()) {
//            return false;
//        }
//        int i = 0;
//        while (prestados[i] != null){
//            i++;
//            if (i==prestados.length) return false;
//        }
//        prestados[i]=ejemplar;
//        ejemplar.setEnUso(true);
//        ejemplar.setDiaDevolucion(null);
//        ejemplar.setDiaPrestamo(LocalDate.now());
//        return true;
//    }

        public boolean prestamo(Ejemplar ejemplar) {
        if (prestados.size()>3) return false;
        ejemplar.setEnUso(true);
        ejemplar.setDiaDevolucion(null);
        ejemplar.setDiaPrestamo(LocalDate.now());
        prestados.add(ejemplar);
        return true;
    }

//    public boolean devolucion(Ejemplar ejemplar) {
//        if (!ejemplar.isEnUso()){
//            return false;
//        }
//        int i = 0;
//        while (prestados[i] != ejemplar){
//            i++;
//            if (i==prestados.length) return false;
//        }
//        prestados[i]=null;
//        ejemplar.setEnUso(false);
//        ejemplar.setDiaDevolucion(LocalDate.now());
//        return true;
//    }

        public boolean devolucion(Ejemplar ejemplar) {
        int num = prestados.search(ejemplar);
        if (num==-1) return false;
        ejemplar.setEnUso(false);
        ejemplar.setDiaDevolucion(LocalDate.now());
        prestados.remove(num);
        return true;
    }



}