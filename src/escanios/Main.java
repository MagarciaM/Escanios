/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escanios;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author migue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         Scanner Lectura = new Scanner(System.in);
        ArrayList<Partido> arrayPartidos = new ArrayList();
        int cantEscanios;
        
        // llamamos al metodo rellenarDatos de la clase calculos
        Calculos cal = new Calculos();
        arrayPartidos = cal.rellenarDatos();

        for (int i = 0; i < arrayPartidos.size(); i++) {
            System.out.println(arrayPartidos.get(i).toString());
        }
        
        // Preguntar cuantos escanios se reparten
        System.out.println("Cantidad Escaños");
        cantEscanios = Lectura.nextInt();
        
        System.out.println("\n Calcular escanios \n");
        
        arrayPartidos = cal.calcularEscacios(arrayPartidos, cantEscanios);
        
        for (int i = 0; i < arrayPartidos.size(); i++) {
            System.out.println(arrayPartidos.get(i).toString());
        }

    }

}
