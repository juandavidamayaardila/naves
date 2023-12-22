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
public class Lanzadera extends Vehiculo{
    
    /**
     * Representa la capacidad de la carga util en kg
     */
    private int capacidad;
    
    /**
     * Representa el tipo de carga util
     */
    private String cargaUtil;
    

    /**
     * Constructor que permite inicializar los atributos
     * de la clase Lanzadera, invoca super(...) para
     * inicializar los atributos de la clase superior
     * 
     * @param nombre
     * @param capacidad
     * @param cargaUtil
     * @param potencia
     * @param velocidad
     * @param combustible
     * @param peso 
     */
    public Lanzadera(String nombre,int capacidad, String cargaUtil, int potencia, int velocidad, String combustible, float peso) {
        super(nombre,potencia, velocidad, combustible, peso);
        this.capacidad = capacidad;
        this.cargaUtil = cargaUtil;
    }


    /**
     * Metodo que permite acceder al valor de la 
     * propiedad capacidad
     * 
     * @return capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Metodo que permite acceder al valor de la
     * propiedad cargaUtil
     * 
     * @return cargaUtil
     */
    public String getCargaUtil() {
        return cargaUtil;
    }

    /**
     * Metodo que implementa el acelerar, 
     * cada vehiculo acelera de forma distinta
     * dependiendo del combustible y el motor.
     * 
     */
    @Override
    public void acelerar() {
        setVelocidad(getVelocidad()+20);
    }
    
     /**
     * Metodo que retorna una cadena con todos los atributos de la case
     * Vehiculo
     * 
     * @return cadena con la informacion de los atributos
     */
    @Override
    public String toString() {
        return "Lanzadera{" +"Nombre=" + getNombre() + " capacidad=" + capacidad + ", cargaUtil=" + cargaUtil + '}';
    }
    
}
