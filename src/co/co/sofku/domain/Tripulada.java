/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.co.sofku.domain;

/**
 *
 * @author CW-DV-JDAA
 */
public class Tripulada extends Vehiculo{
    private int numeroTripulacion;

    /**
     * Metodo que permite inicializar los atributos de la clase 
     * Tripulada y Vehiculo, invoca el super de la clase superior (Vehiculo)
     * 
     * @param nombre
     * @param numeroTripulacion
     * @param potencia
     * @param velocidad
     * @param combustible
     * @param peso 
     */
    public Tripulada(String nombre,int numeroTripulacion, int potencia, int velocidad, String combustible, float peso) {
        super(nombre,potencia, velocidad, combustible, peso);
        this.numeroTripulacion = numeroTripulacion;
    }

   

    /**
     * Metodo que permite acceder al valor de la variable
     * tripulacion. 
     * 
     * @return numeroTripulacion
     */
    public int getNumeroTripulacion() {
        return numeroTripulacion;
    }

    /**
     * Metodo que permite almacenar un valor en el atributo
     * numeroTripulacion.
     * 
     * @param numeroTripulacion 
     */
    public void setNumeroTripulacion(int numeroTripulacion) {
        this.numeroTripulacion = numeroTripulacion;
    }

    /**
     * Metodo enunciado en la clase vehiculo
     * se implementa porque cada vehiculo acelera 
     * de forma distinta
     */
    @Override
    public void acelerar() {
        setVelocidad(getVelocidad()+6);
    }
    
     /**
     * Metodo que retorna una cadena con todos los atributos de la case
     * Vehiculo
     * 
     * @return cadena con la informacion de los atributos
     */
     @Override
    public String toString() {
        return "Tripulada{" + "Nombre=" + getNombre()  + "numeroTripulacion=" + numeroTripulacion + '}';
    }
}
