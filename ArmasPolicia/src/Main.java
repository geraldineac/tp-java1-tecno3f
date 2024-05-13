public class Main {
    public static void main(String[] args) {
        System.out.println("\n¡Bienvenido(a) al sistema de gestión de Armas de la Policia de Tres de Febrero!");
        System.out.println("\n\n \t\t-------------- \n\n");
        //el objeto arma debe ser creado antes de utilizarlo como un argumento
        Arma arma1 = new ArmaCorta (7, 200, "marca1", 8, "EN USO", true);
        Arma arma2 = new ArmaLarga (5, 200, "Beretta", 48, "MANTENIMIENTO",true,"Tiene el sello de RENAR, puede ser utilizada", 5, true);
        Arma arma3 = new ArmaCorta (9,300,"Smith",9,"EN USO",true);
        Arma arma4 = new ArmaLarga (7, 200, "Colt", 7, "NUEVA", true, "Tiene el sello de RENAR, puede ser utilizada",5, true );

        Policia policia1 = new Policia("Pepe","Argento",123456, arma1);
        System.out.println(policia1);
        arma1.enCondicion();

        Policia policia2 = new Policia("Liliana","Ramos",165342, arma2);
        System.out.println(policia2);
        arma2.enCondicion();
        arma2.toString();

        Policia policia3 = new Policia("Mauro", "Dominguez", 153426, arma3);
        System.out.println(policia3);
        arma3.enCondicion();

        Policia policia4 = new Policia("Ricardo", "Perez", 515624, arma4);
        System.out.println(policia4);
        arma4.enCondicion();
        arma4.toString();

        System.out.println("\n\n \t\t-------------- \n\n");

        int comparacion = ((ArmaLarga) arma4).compareTo((ArmaLarga) arma2);
        if(comparacion < 0){
            System.out.println(arma4.getMarca() + " calibre " + arma4.getCalibre() + " tiene menor nivel que " + arma2.getMarca() + " calibre " + arma2.getCalibre());

        }else if (comparacion > 0){
            System.out.println(arma4.getMarca() + " calibre " + arma4.getCalibre() + " tiene mayor nivel que " + arma2.getMarca() + " calibre " + arma2.getCalibre());
        } else{
            System.out.println(arma4.getMarca() + " calibre " + arma4.getCalibre() + " tiene el mismo nivel que " + arma2.getMarca() + " calibre " + arma2.getCalibre());
        }

    }
}