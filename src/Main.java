public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        while (true){
            Menus.menuPrincipal();
            int num = Scanners.askMenu(8);

            switch (num){
                case 1:
                    biblioteca.darDeAltaPubicacion();
                    break;
                case 2:
                    biblioteca.darDeBajaPublicacion();
                    break;
                case 3:

                    break;
                case 4:
                    biblioteca.darDeAltaCliente();
                    break;
                case 5:
                    biblioteca.darDeBajaCliente();
                    break;
                case 6:
                    biblioteca.modificarCliente();
                    break;
                case 7:
                    biblioteca.prestarEjemplar();
                    break;
                case 8:

                    break;

                default:
            }



        }
    }
}
