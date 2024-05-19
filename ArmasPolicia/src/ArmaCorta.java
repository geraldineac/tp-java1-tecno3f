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
        System.out.println("El arma "+ getMarca() + " calibre " + getCalibre() +"mm ¿Es efectiva a más de 200 mts?");
        if(getAlcance() >= 200){
        return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "\tFicha de Arma corta: " +
                "\n\t\tCantidad de Municiones = " + getCantMuniciones() +
                "\n\t\tAlcance = " + getAlcance() + "mts"+
                "\n\t\tMarca = " + getMarca() +
                "\n\t\tCalibre = " + getCalibre()+
                "\n\t\tEstado = " + getEstado() +
                "\n\t\tAutomática = " + isEsAutomatica();

    }
}
