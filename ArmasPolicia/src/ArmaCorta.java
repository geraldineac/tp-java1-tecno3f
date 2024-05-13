public class ArmaCorta extends Arma{
    private boolean esAutomatica;

    //Constructor
    public ArmaCorta(int cantMuniciones, double alcance, String marca, int calibre, String estado,boolean esAutomatica) {
        super(cantMuniciones, alcance, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    //Getters
    public boolean isEsAutomatica() {
        return esAutomatica;
    }


    //Setters
    public void setEsAutomatica(boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }

    //Metodos
    public boolean efectividadMts(){
        return true;//TODO modificar
    }
}
