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
public class Calculos {

    public Calculos() {
    }

    public ArrayList<Partido> rellenarDatos() {

        ArrayList<Partido> arrayPartidos = new ArrayList();
        int nPartidos;
        String nombre;
        int votos;
        Scanner LecturaNpartidos = new Scanner(System.in);
        Scanner LecturaNombre = new Scanner(System.in);
        Scanner LecturaVotos = new Scanner(System.in);

        System.out.println("Nº partidos");
        nPartidos = LecturaNpartidos.nextInt();

        for (int i = 0; i < nPartidos; i++) {

            System.out.println("Nombre");
            nombre = LecturaNombre.nextLine();

            System.out.println("Cantidad votos");
            votos = LecturaVotos.nextInt();

            Partido p = new Partido(nombre, votos);

            arrayPartidos.add(p);
        }

        return arrayPartidos;
    }

    public ArrayList<Partido> calcularEscacios(ArrayList<Partido> arrayPartidos, int nEscanios) {
     
        String nombreMasVotos = "";
        
        
        for (int i=0 ; i<nEscanios ; i++) {
            int maximo = 0;
        
            for (int j=0 ; j<arrayPartidos.size() ; j++) {
                
                Partido p = arrayPartidos.get(j);
                
                p.setVotosDiv(p.getVotos() / (p.getEscanios()+1));
            }
            
            for (int j=0 ; j<arrayPartidos.size() ; j++) {
                
                Partido p = arrayPartidos.get(j);
                
                if (p.getVotosDiv() > maximo) {
                    nombreMasVotos = p.getNombre();
                    maximo = p.getVotosDiv();
                }
            }
            
            for (int j=0 ; j<arrayPartidos.size() ; j++) {
                
                Partido p = arrayPartidos.get(j);
                
                if (nombreMasVotos.equals(p.getNombre())) {
                    p.incrementarEscanios();
                }
            }
        }
          
       return arrayPartidos;
    }
}
