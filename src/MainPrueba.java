public class MainPrueba {
    public static void main(String[] args) {
        Libro libro = new Libro("Anaya",3, Publicacion.Color.BLANCONEGRO,"Pedro","Pulgarcito");
        Ejemplar ejemplar  = Ejemplar.crearEjemplar(libro);

        Ejemplar ejemplar4  = Ejemplar.crearEjemplar(libro);
        System.out.println(ejemplar);
        Revista revista = new Revista("A",2, Publicacion.Color.BLANCONEGRO,"Epikardo","e", Revista.Periodicidad.SEMANAL);
        Revista revista2 = new Revista("A",2, Publicacion.Color.BLANCONEGRO,"Epikardo","e", Revista.Periodicidad.SEMANAL);
        System.out.println(revista);
        Periodico periodico = new Periodico("A",4, Publicacion.Color.BLANCONEGRO,"Pedro");
        System.out.println(periodico);
        Ejemplar ejemplar2  = Ejemplar.crearEjemplar(revista);
        Ejemplar ejemplar3  = Ejemplar.crearEjemplar(revista);
        Ejemplar ejemplar5  = Ejemplar.crearEjemplar(revista2);
        Abonado abonado = new Abonado("Eloy");
        System.out.println(abonado.prestamo(ejemplar));
        System.out.println(abonado.prestamo(ejemplar2));
        System.out.println(abonado.prestamo(ejemplar3));
        //revista=null;
        System.out.println(abonado.prestamo(ejemplar3));
        ejemplar5.eliminarPublicacion();
        System.out.println(abonado.prestamo(ejemplar5));
    }
}