/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escanios;

/**
 *
 * @author migue
 */
public class Partido {
    
    private String nombre;
    private int votos;
    private int votosDiv;
    private int escanios;
    
    public Partido (String nombre, int votos) {
        this.nombre = nombre;
        this.votos = votos;
        votosDiv = 0;
        escanios = 0;           
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public void setVotosDiv(int votosDiv) {
        this.votosDiv = votosDiv;
    }

    public void setEscanios(int escanios) {
        this.escanios = escanios;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVotos() {
        return votos;
    }

    public int getVotosDiv() {
        return votosDiv;
    }

    public int getEscanios() {
        return escanios;
    }
    
    // Método para incrementar los escanios
    public void incrementarEscanios () {
        this.escanios++;
    }
    
    @Override
    public String toString() {
        return "Partido{" + "nombre=" + nombre + ", votos=" + votos + ", escanios=" + escanios + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }  
}
