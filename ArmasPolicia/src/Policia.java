public class Policia {
    //atributos
    private String nombre;
    private String apellido;
    private int legajo;
    private Arma arma;

    //constructor
    public Policia(String nombre, String apellido, int legajo, Arma arma) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.arma = arma;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public Arma getArma() {
        return arma;
    }


    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "\n**Ficha de Policia:** " +
                "\nNombre = " + nombre +
                "\nApellido = " + apellido +
                "\nLegajo n° = " + legajo +
                "\nArma = " + arma;
    }
}
