/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.co.sofku.domain;

/**
 * Clase que representa la nave espacial no tripulada o robotica.
 * 
 * @author CW-DV-JDAA
 */
public class Robotica extends Vehiculo{
    private int numeroMotores;
    private String mision;

    /**
     * Metodo que permite inicializar los atributos de la clase 
     * Robotica y Vehiculo, invoca el super de la clase superior (Vehiculo)
     * 
     * @param nombre
     * @param numeroMotores
     * @param mision
     * @param potencia
     * @param velocidad
     * @param combustible
     * @param peso 
     */
    public Robotica(String nombre,int numeroMotores, String mision, int potencia, int velocidad, String combustible, float peso) {
        super(nombre,potencia, velocidad, combustible, peso);
        this.numeroMotores = numeroMotores;
        this.mision = mision;
    }

    
     /**
      * Metodo set que permite almacenar valor en la 
      * propiedad numeroMotores
      * 
      * @param numeroMotores 
      */
    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    /**
     * Metodo que permite almacenar el timpo de mision 
     * en la propiedad mision
     * 
     * @param mision 
     */
    public void setMision(String mision) {
        this.mision = mision;
    }

    /**
     * Metodo que permite acceder al valor de la 
     * propiedad numeroMotores
     * 
     * @return numeroMotores
     */
    public int getNumeroMotores() {
        return numeroMotores;
    }

    /**
     * Metodo que permite acceder al valor de la 
     * propiedad mision
     * 
     * @return mision
     */
    public String getMision() {
        return mision;
    }

    /**
     * Metodo enunciado en la clase vehiculo
     * se implementa porque cada vehiculo acelera 
     * de forma distinta
     */
    @Override
    public void acelerar() {
        setVelocidad(getVelocidad()+3);
    }

    /**
     * Metodo sobreescrito de la case Vehiculo, 
     * se sobrescribe porque frenar en la clase robotica
     * es diferente especifico para esta clase.
     */
    @Override
    public void frenar(){
         setVelocidad(getVelocidad()-1);
    }
    
     /**
     * Metodo que retorna una cadena con todos los atributos de la case
     * Vehiculo
     * 
     * @return cadena con la informacion de los atributos
     */
    @Override
    public String toString() {
        return "Robotica{" + "Nombre=" + getNombre() + " numeroMotores=" + numeroMotores + ", mision=" + mision + '}';
    }
   
}
