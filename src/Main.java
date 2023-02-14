public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        loop:
        while (true){
            Menus.menuPrincipal();
            int num = Scanners.askMenu(8);

            switch (num){
                case 1:
                    biblioteca.darDeAltaPublicacion();
                    break;
                case 2:
                    biblioteca.darDeBajaPublicacion();
                    break;
                case 3:
                    biblioteca.darDeAltaCliente();
                    break;
                case 4:
                    biblioteca.darDeBajaCliente();
                    break;
                case 5:
                    biblioteca.modificarCliente();
                    break;
                case 6:
                    biblioteca.prestarEjemplar();
                    break;
                case 7:
                    biblioteca.devolverEjemplar();
                    break;
                default:
                    System.out.println("Adiós!");
                    break loop;
            }
        }
    }
}
