public class Arma{
    //atributos
    private int cantMuniciones;
    private double alcance;
    private String marca;
    private int calibre;
    private String estado;

    //constructor
    public Arma(int cantMuniciones, double alcance, String marca, int calibre, String estado) {
        this.cantMuniciones = cantMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    //Getters
    public int getCantMuniciones() {
        return cantMuniciones;
    }

    public double getAlcance() {
        return alcance;
    }

    public String getMarca() {
        return marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public String getEstado() {
        return estado;
    }

    //Setters
    public void setCantMuniciones(int cantMuniciones) {
        this.cantMuniciones = cantMuniciones;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean enCondicion(){
        if (estado.equals("EN USO") && calibre >=9){
            System.out.println("\t\t'El arma está en condiciones para poder ser usada en un enfrentamiento'");
            return true;
        }else{
            System.out.println("\t\t'El arma no está en condiciones'");
            return false;
        }
    }

}
