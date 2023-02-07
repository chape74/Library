public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        while (true){
            Menus.menuPrincipal();
            int num = Scanners.askMenu(8);

            switch (num){
                case 1:
                    biblioteca.darDeAlta();
                    break;
                case 2:
                    biblioteca.darDeBaja();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;

                default:
            }



        }
    }
}
