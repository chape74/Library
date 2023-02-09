public abstract class Publicacion {

    private final String editorial;

    private final int numPaginas;

    private final Color color;

    private GenericList<Ejemplar> ejemplares;

    public GenericList<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public boolean crearEjemplar() {
        if (this instanceof Libro || ejemplares.size()<1){
            ejemplares.add(new Ejemplar(this));
            return true;
        }
        return false;
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


