public class ArmaLarga extends Arma implements Comparable<ArmaLarga> {

    private String justifUso;
    private int nivelArma;
    private boolean tieneSello;

    //Constructor
    public ArmaLarga(int cantMuniciones, double alcance, String marca, int calibre, String estado, boolean enCondicion, String justifUso, int nivelArma, boolean tieneSello) {
        super(cantMuniciones, alcance, marca, calibre, estado);
        this.justifUso = justifUso;
        this.nivelArma = nivelArma;
        this.tieneSello = tieneSello;
    }

    //getters
    public String getJustifUso() {
        return justifUso;
    }

    public int getNivelArma() {
        return nivelArma;
    }

    public boolean isTieneSello() {
        return tieneSello;
    }

    //Setters
    public void setJustifUso(String justifUso) {
        this.justifUso = justifUso;
    }

    public void setNivelArma(int nivelArma) {
        this.nivelArma = nivelArma;
    }

    public void setTieneSello(boolean tieneSello) {
        this.tieneSello = tieneSello;
    }

    @Override
    public String toString() {
        return "\tFicha de Arma: " +
                "\n\t\tCantidad de Municiones = " + getCantMuniciones() +
                "\n\t\tAlcance = " + getAlcance() + "mts"+
                "\n\t\tMarca = " + getMarca() +
                "\n\t\tCalibre = " + getCalibre()+
                "\n\t\tEstado = " + getEstado() +
                "\n\t\tJustificación de uso = " + justifUso+
                "\n\t\tNivel de arma = " + nivelArma +
                "\n\t\tPosee sello del RENAR = " + tieneSello;
    }

    @Override
    public int compareTo(ArmaLarga otraArma) {
        return Integer.compare(this.nivelArma, otraArma.nivelArma);
    }


}
