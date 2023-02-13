public abstract class Publicacion {

    private final String editorial;

    private final int numPaginas;

    private final Color color;

    private GenericList<Ejemplar> ejemplares;

    public GenericList<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void crearEjemplar() {
        if (this instanceof Libro || ejemplares.size()<1){
            Ejemplar ejemplar = new Ejemplar(this);
            ejemplares.add(ejemplar);
        }
    }


    public String getEditorial() {
        return editorial;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public Color getColor() {
        return color;
    }


    public Publicacion(String editorial, int numPaginas, Color color) {
        this.editorial = editorial;
        this.numPaginas = numPaginas;
        this.color = color;
    }

    public enum Color {
        BLANCONEGRO,
        COLOR
    }

}


