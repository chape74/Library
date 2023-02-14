public class Biblioteca {
    private final GenericList<Publicacion> publicaciones;

    private final GenericList<Cliente> clientes;

    public Biblioteca() {
        publicaciones = new GenericList<>();
        clientes = new GenericList<>();
    }

    public void darDeAltaPublicacion(){
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
                publicaciones.add(new Libro(Scanners.askString("Editorial: "),Scanners.askInt("Paginas: "),Scanners.askColor("Color si/no? "),
                        Scanners.askString("Autor: "),Scanners.askString("Titulo: ")));
                break;
            case 2:
                publicaciones.add(new Revista(Scanners.askString("Editorial: "),Scanners.askInt("Paginas: "),Scanners.askColor("Color si/no? "),
                        Scanners.askString("Nombre: "),Scanners.askString("Temática: "),Scanners.askPeriodicidad("Semanal/Mensual/Trimestral? ")));
                break;
            case 3:
                publicaciones.add(new Periodico(Scanners.askString("Editorial: "),Scanners.askInt("Paginas: "),Scanners.askColor("Color si/no? "),
                        Scanners.askString("Nombre: ")));
                break;
        }
    }

    public void darDeBajaPublicacion(){
        System.out.println("Cual Publicación?");
        for (int i = 0; i < publicaciones.size(); i++) {
            System.out.println((i+1) +"- "+ publicaciones.get(i).toString());
        }
        System.out.println((publicaciones.size()+1)+"- Cancelar");
        publicaciones.remove(Scanners.askMenu(publicaciones.size()+1)-1);
    }

    public void darDeAltaCliente(){
        clientes.add(new Cliente(Scanners.askString("Nombre del cliente: ")));
    }

    public void darDeBajaCliente(){
        System.out.println("Cual Cliente?");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i+1) +"- "+ clientes.get(i).toString());
        }
        System.out.println((clientes.size()+1)+"- Cancelar");
        clientes.remove(Scanners.askMenu(clientes.size()+1)-1);
    }

    public void modificarCliente(){
        System.out.println("Cual Cliente?");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i+1) +"- "+ clientes.get(i).toString());

        }
        System.out.println((clientes.size()+1)+"- Cancelar");
        int numCli = Scanners.askMenu(clientes.size()+1)-1;
        if (numCli!=clientes.size()) {
            clientes.get(numCli).setNombre(Scanners.askString("Nuevo Nombre: "));
            clientes.get(numCli).setDNI(Scanners.askString("Nuevo DNI: "));
        }
    }

    public void prestarEjemplar() {
        System.out.println("Cual Cliente?");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.print((i+1) +"- "+ clientes.get(i).toString());
            if (clientes.get(i).getPrestados().size() == 3) System.out.print("- LLENO!");
            System.out.println();
        }
        System.out.println((clientes.size()+1)+"- Cancelar");
        int numCli = Scanners.askMenu(clientes.size()+1)-1;
        if (numCli!=clientes.size() && clientes.get(numCli).getPrestados().size() != 3) {
            System.out.println("De cual Publicación quieres crear un ejemplar y dárselo al Cliente?");
            for (int i = 0; i < publicaciones.size(); i++) {
                System.out.printf((i + 1) + "- " + publicaciones.get(i).toString());
                if (!(publicaciones.get(i) instanceof Libro) && publicaciones.get(i).getEjemplares().size()==1) System.out.print(" - YA CREADO, NO SE CREARÁ OTRO");
                System.out.println();
            }
            System.out.println((publicaciones.size() + 1) + "- Cancelar");
            int numPres = Scanners.askMenu(publicaciones.size() + 1) - 1;
            if (numPres != publicaciones.size() && publicaciones.get(numPres).crearEjemplar())
                clientes.get(numCli).prestamo(publicaciones.get(numPres).getEjemplares().get(publicaciones.get(numPres).getEjemplares().size()-1));
        }
    }

    public void devolverEjemplar() {
        System.out.println("Cual Cliente?");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.print((i+1) +"- "+ clientes.get(i).toString());
            if (clientes.get(i).getPrestados().size() == 0) System.out.print(" - VACÍO!");
            System.out.println();
        }
        System.out.println((clientes.size()+1)+"- Cancelar");
        int numCli = Scanners.askMenu(clientes.size()+1)-1;
        if (numCli != clientes.size() && clientes.get(numCli).getPrestados().size() != 0) {
            System.out.println("Cual Ejemplar?");
            for (int i = 0; i < clientes.get(numCli).getPrestados().size(); i++) {
                System.out.println((i + 1) + "- " + clientes.get(numCli).getPrestados().get(i));
            }
            System.out.println((clientes.get(numCli).getPrestados().size() + 1) + "- Cancelar");
            int numEjem = Scanners.askMenu(clientes.get(numCli).getPrestados().size() + 1) - 1;
            if (numEjem != publicaciones.size()) {
                clientes.get(numCli).devolucion(publicaciones.get(numEjem).getEjemplares().get(publicaciones.get(numEjem).getEjemplares().size()-1));
            }
        }
    }
}
