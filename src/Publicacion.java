public abstract class Publicacion {

    private final String editorial;

    private final int numPaginas;

    private final Color color;

    private final GenericList<Ejemplar> ejemplares;

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

    @Override
    public String toString() {
        return "Publicacion{" +
                "editorial='" + editorial + '\'' +
                ", numPaginas=" + numPaginas +
                ", color=" + color +
                ", ejemplares=" + ejemplares +
                '}';
    }

    public Publicacion(String editorial, int numPaginas, Color color) {
        this.editorial = editorial;
        this.numPaginas = numPaginas;
        this.color = color;
        this.ejemplares = new GenericList<>();
    }

    public enum Color {
        BLANCONEGRO,
        COLOR
    }

}


