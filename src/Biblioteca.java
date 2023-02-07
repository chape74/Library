public class Biblioteca {

    private GenericList<Publicacion> ejemplares;

    private GenericList<Abonado> abonados;

    public Biblioteca() {
        ejemplares = new GenericList<>();
        abonados = new GenericList<>();
    }

    public void darDeAlta(){
        System.out.println("De que tipo?");
        System.out.println("1- Libro");
        System.out.println("2- Revista");
        System.out.println("3- Periódico");
        System.out.println("4- Cancelar");
        int num = Scanners.askMenu(4);
        switch (num) {
            default:
                break;
            case 1:
                ejemplares.add(new Libro(Scanners.askString("Editorial: "),Scanners.askInt("Paginas: "),Scanners.askColor("Color si/no? "),
                        Scanners.askString("Autor: "),Scanners.askString("Titulo: ")));
                break;
            case 2:
                ejemplares.add(new Revista(Scanners.askString("Editorial: "),Scanners.askInt("Paginas: "),Scanners.askColor("Color si/no? "),
                        Scanners.askString("Nombre: "),Scanners.askString("Temática: "),Scanners.askPeriodicidad("Semanal/Mensual/Trimestral? ")));
                break;
            case 3:
                ejemplares.add(new Periodico(Scanners.askString("Editorial: "),Scanners.askInt("Paginas: "),Scanners.askColor("Color si/no? "),
                        Scanners.askString("Nombre: ")));
                break;
        }
    }

    public void darDeBaja(){
        System.out.println("Cual Publicacion?");
        for (int i = 0; i < ejemplares.size(); i++) {
            System.out.println((i+1) +"- "+ ejemplares.get(i).toString());
        }
        System.out.println((ejemplares.size()+1)+"- Cancelar");
        ejemplares.remove(Scanners.askMenu(ejemplares.size()+1)-1);
    }
}
