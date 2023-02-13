import java.util.Scanner;

public class Scanners {

    public static int askMenu(int limit) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Ingrese un número del 1 al "+limit+ " : ");
            number = sc.nextInt();
        } while (number < 1 || number > limit);
        return number;
    }
    public static String askString(String string) {
        System.out.println(string);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static int askInt(String string) {
        System.out.println(string);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static Publicacion.Color askColor(String string) {
        System.out.println(string);
        Scanner sc = new Scanner(System.in);
        String string2 = sc.nextLine();
        if (string2.equalsIgnoreCase("SI")) return Publicacion.Color.COLOR;
        return Publicacion.Color.BLANCONEGRO;
    }
    public static Revista.Periodicidad askPeriodicidad(String string) {
        System.out.println(string);
        Scanner sc = new Scanner(System.in);
        String string2 = sc.nextLine();
        if (string2.equalsIgnoreCase("MENSUAL")) return Revista.Periodicidad.MENSUAL;
        if (string2.equalsIgnoreCase("TRIMESTRAL")) return Revista.Periodicidad.TRIMESTRAL;
        return Revista.Periodicidad.SEMANAL;
    }
}
