/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.co.sofku.domain;

/**
 * Clase que representa un vehiculo, el cual puede ser cualquier tipo
 * de nave.
 * 
 * @author CW-DV-JDAA
 */

public abstract class Vehiculo {
    private Long id;
    public int potencia;

   
    public int velocidad;
    public String combustible;
    public float peso;
    public String nombre;

 

    /**
     * Metodo constructor que permite inicializar los atributos
     * 
     * @param nombre nombre de la nave
     * @param potencia
     * @param velocidad
     * @param combustible
     * @param peso 
     * 
     */
    public Vehiculo( String nombre,int potencia, int velocidad, String combustible, float peso) {
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.combustible = combustible;
        this.peso = peso;
        this.nombre = nombre;

    }

    /**
     * Metodo que permite almacenar valor en el 
     * atributo potencia
     * 
     * @param potencia 
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * Metodo que permite almacenar valor en el 
     * atributo velocidad
     * 
     * @param velocidad 
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Metodo que permite almacenar valor en el 
     * atributo combustible
     * 
     * @param combustible 
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    
    /**
     * Metodo que permite almacenar valor en el 
     * atributo peso
     * 
     * @param peso 
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    /**
     * Metodo que permite acceder al valor del atributo
     * potencia
     * 
     * @return el valor de la potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * Metodo que permite acceder al valor del atributo
     * potencia
     * 
     * @return el valor de la potencia
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Metodo que permite acceder al valor del atributo
     * combustible
     * 
     * @return el valor de la combustible
     */
    public String getCombustible() {
        return combustible;
    }

    
    /**
     * Metodo que permite acceder al valor del atributo
     * peso
     * 
     * @return el valor de la peso
     */
    public float getPeso() {
        return peso;
    }
   
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo que implemente el frenado 
     * del vehiculo-nave, el cual podria ser sobre escrito 
     * por cada vehiculo especifico
     * 
     */
    public void frenar(){
        setVelocidad(0);
    }
    
    /**
     * Metodo que implemente el acelerar 
     * del vehiculo-nave, el cual debe ser implementado
     * por cada vehiculo especifico
     * 
     */
    public abstract void acelerar();
    
    /**
     * Metodo que retorna una cadena con todos los atributos de la case
     * Vehiculo
     * 
     * @return cadena con la informacion de los atributos
     */
     @Override
    public String toString() {
        return "Vehiculo{" + "potencia=" + potencia + ", velocidad=" + velocidad + ", combustible=" + combustible + ", peso=" + peso + ", nombre=" + nombre + '}';
    }
}
