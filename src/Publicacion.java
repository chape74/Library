public abstract class Publicacion {

    private final String editorial;

    private final int numPaginas;

    private final Color color;

    private boolean tieneEjemplar;

    public boolean getTieneEjemplar() {
        return tieneEjemplar;
    }

    public void setTieneEjemplar(boolean tieneEjemplar) {
        this.tieneEjemplar = tieneEjemplar;
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

    public boolean isTieneEjemplar() {
        return tieneEjemplar;
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


