/*
* TRABAJO FINAL
* ALUMNA: GERALDINE ACEVEDO
* CURSO: INTRODUCCIÓN A JAVA - 1er Cuatrimestre 2024
* TECNO 3F
* PROFES: LUIS JAVIER MAZO GOMEZ - JENNIFER GOLDFELD - GABRIEL SEBASTIAN ROMAN
* */

import java.util.ArrayList;

import java.util.Scanner;

public class PrincipalConMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        //los objetos deben ser instanciados antes de utilizarlos como argumento
        Arma arma1 = new ArmaCorta (7, 150, "marca1", 9, "EN USO", true);
        Arma arma2 = new ArmaLarga (5, 200, "Beretta", 48, "MANTENIMIENTO",true,"Tiene el sello de RENAR, puede ser utilizada", 5, true);
        Arma arma3 = new ArmaCorta (9,300,"Smith",22,"EN USO",true);
        Arma arma4 = new ArmaLarga (7, 200, "Colt", 7, "NUEVA", true, "Tiene el sello de RENAR, puede ser utilizada",5, true );
        Arma arma5 = new ArmaCorta (8,300,"marca2", 48,"EN USO",false);
        Arma arma6 = new ArmaLarga (5, 200, "marca1", 7, "MANTENIMIENTO",true,"Tiene el sello de RENAR, puede ser utilizada", 5, true);

        Policia policia1 = new Policia("Pepe","Argento",123456, arma1);
        Policia policia2 = new Policia("Florencia","Ramos",165342, arma2);
        Policia policia3 = new Policia("Martín", "Dominguez", 153426, arma3);
        Policia policia4 = new Policia("Ricardo", "Fort", 515624, arma4);
        Policia policia5 = new Policia("Elsa", "Pato",151722, arma5);
        Policia policia6 = new Policia("Mario", "Bros", 122334, arma6);

        ArrayList<Arma> listaArmas = new ArrayList<>();
        listaArmas.add(arma1);
        listaArmas.add(arma2);
        listaArmas.add(arma3);
        listaArmas.add(arma4);
        listaArmas.add(arma5);
        listaArmas.add(arma6);

        ArrayList<Policia> listaPolicias = new ArrayList<>();
        listaPolicias.add(policia1);
        listaPolicias.add(policia2);
        listaPolicias.add(policia3);
        listaPolicias.add(policia4);
        listaPolicias.add(policia5);
        listaPolicias.add(policia6);


        System.out.println("\n¡Bienvenido(a) al sistema de gestión de Armas de la Policia de Tres de Febrero!");

        do{
            System.out.println("\nPor favor, elija una opción del siguiente menú:");
            System.out.println("1. Listar todos los policias y sus armas");
            System.out.println("2. Listar todas las armas");
            System.out.println("3. Listar las armas en condiciones de uso");
            System.out.println("4. Niveles de armas largas y su comparación");
            System.out.println("5. Armas cortas automáticas y no automáticas");
            System.out.println("6. Efectividad en metros de armas cortas");
            System.out.println("7. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Usted seleccionó la opción 1. Listar todos los policias y sus armas");
                    for (Policia item: listaPolicias) {
                        System.out.println(item.toString());
                    }
                    break;
                case 2:
                    System.out.println("Usted seleccionó la opción 2. Listar todas las armas");
                    for (Arma item: listaArmas) {
                        System.out.println(item.toString());
                    }
                    break;
                case 3:
                    System.out.println("**Usted seleccionó la opción 3. Listar las armas en condiciones de uso\n");
                    System.out.println("\nPara que un arma pueda estar en condiciones debe estar en estado “EN USO” y ser un calibre mayor o igual a 9mm.");
                    for (Arma item: listaArmas) {
                        if(item.enCondicion()){
                            System.out.println("El arma " + item.getMarca() + " calibre " + item.getCalibre() + "mm, estado '" + item.getEstado() + "' está en condiciones para poder ser usada en un enfrentamiento");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Usted seleccionó la opción 4. Niveles de armas largas y su comparación");
                    //bug: el primer item se compara a sí mismo :(
                    for (Arma item: listaArmas){
                        if (item instanceof ArmaLarga){
                            int comparacion = ((ArmaLarga) item).compareTo((ArmaLarga) item);

                            ArmaLarga armaLarga = (ArmaLarga) item;
                            if(comparacion < 0){
                                System.out.println("El nivel "  + armaLarga.getNivelArma() + " de " + item.getMarca() + " calibre " + item.getCalibre() + " es menor que " + arma2.getMarca() + " calibre " + arma2.getCalibre() + " de nivel " + armaLarga.getNivelArma());
                            }else if (comparacion > 0){
                                System.out.println("El nivel "  + armaLarga.getNivelArma() + " de " + item.getMarca() + " calibre " + item.getCalibre() + " es mayor que " + arma2.getMarca() + " calibre " + arma2.getCalibre() + " de nivel " + armaLarga.getNivelArma());
                            } else{
                                System.out.println("El nivel "  + armaLarga.getNivelArma() + " de " + item.getMarca() + " calibre " + item.getCalibre() + " es igual que " + arma2.getMarca() + " calibre " + arma2.getCalibre() + " de nivel " + armaLarga.getNivelArma());
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Usted seleccionó la opción 5. Armas cortas automáticas y no automáticas");
                    for (Arma item: listaArmas) {
                        if (item instanceof ArmaCorta) {
                            ArmaCorta armaCorta = (ArmaCorta) item;
                            if (((ArmaCorta) item).isEsAutomatica()) {
                                System.out.println("El arma corta " + armaCorta.getMarca() + " calibre " + armaCorta.getCalibre() + " SÍ es automática");
                            } else {
                                System.out.println("El arma corta " + armaCorta.getMarca() + " calibre " + armaCorta.getCalibre() + " NO es automática");
                            }

                        }
                    }
                    break;
                case 6:
                    System.out.println("Usted seleccionó la opción 6. Efectividad en metros de armas cortas");
                    for (Arma item: listaArmas) {
                        if (item instanceof ArmaCorta) {
                            ArmaCorta armaCorta = (ArmaCorta) item;
                            System.out.println(((ArmaCorta) item).efectividadMts());
                        }
                    }

                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        } while (opcion != 7);

                System.out.println("\n\n \t\t-------------- \n\n");
    }
}
