/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navesespaciales;

import co.co.sofku.domain.Lanzadera;
import co.co.sofku.domain.Robotica;
import co.co.sofku.domain.Tripulada;
import co.co.sofku.domain.Vehiculo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author CW-DV-JDAA
 */
public class NavesEspaciales {

    /**
     * Cadenas para ingresar y crear las naves
     * 
     * Lanzadera = apolo,3500,personas,5000,12000,petróleo refinado y oxígeno líquido,14523
     * 
     * Robotica = saturno,4,limpieza,5000,12000,petróleo refinado y oxígeno líquido,14523
     * 
     * Tripulada = jupiter,2,5000,12000,hidrogeno,1000
     * 
     * 
     * Vehiculo lanzadera = new Lanzadera("apolo",3500,"personas",5000,12000,
     * "petróleo refinado y oxígeno líquido",14523);
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        do{
             System.out.println("Ingrese el tipo de vehiculo que desea ingresar "
                    + "\n lanzadera robotica, tripulada o 'q' to quit.");
            c = (String) br.readLine();
            if (!c.equals("q"))
            {
                switch (c){
                    case "lanzadera":
                        crearLanzadera();
                             break;

                    case "robotica":
                        crearRobotica();
                             break;

                    case "tripulada":
                         crearTripulada();
                              break;

                    default:
                        System.out.println("Por favor ingrese una opcion correcta");

                }
            }
        } while(!"q".equals(c));
           
        
    }
    
    /**
     * Metodo que lee los datos de la consola y crea la nave Lanzadera
     * invoca el metodo toString para mostrar los datos de la nave
     * 
     * @return
     * @throws IOException 
     */
    public static boolean crearLanzadera() throws IOException
    {
        String nombre,cargaUtil,combustible;
        int capacidad,potencia,velocidad;
        float peso;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el nombre de la nave,capacidad,"
                            + "cargautil,potencia,velocidad,combustible y peso "
                            + "separaado por comas ");
        
        String cadena = br.readLine();
        String[] listaOpciones = cadena.split(",");
        
        if (listaOpciones.length == 7){
            nombre=listaOpciones[0];
            capacidad=Integer.parseInt(listaOpciones[1]);
            cargaUtil=listaOpciones[2];
            potencia=Integer.parseInt(listaOpciones[3]);
            velocidad=Integer.parseInt(listaOpciones[4]);
            combustible=listaOpciones[5];
            peso=Float.parseFloat(listaOpciones[6]);


            Vehiculo lanzadera = new Lanzadera(nombre, capacidad, cargaUtil,
                    potencia, velocidad, combustible, peso);
            
            System.out.println("---------------Se ha creado una nave tipo------------ ");
            System.out.println(lanzadera.toString());
            System.out.println();
            return true;
        }
        return false;
    }
    
     /**
     * Metodo que lee los datos de la consola y crea la nave Lanzadera
     * invoca el metodo toString para mostrar los datos de la nave
     * 
     * @return
     * @throws IOException 
     */
    public static boolean crearRobotica() throws IOException{
        String nombre,mision, combustible;
        int potencia,motores,velocidad;
        float peso;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el nombre de la nave,numero motores,"
                            + "mision,potencia,velocidad,combustible y peso "
                            + "separaado por comas ");
        
        String cadena = br.readLine();
        String[] listaOpciones = cadena.split(",");
        
        if (listaOpciones.length == 7){
            nombre=listaOpciones[0];
            motores=Integer.parseInt(listaOpciones[1]);
            mision=listaOpciones[2];
            potencia=Integer.parseInt(listaOpciones[3]);
            velocidad=Integer.parseInt(listaOpciones[4]);
            combustible=listaOpciones[5];
            peso=Float.parseFloat(listaOpciones[6]);


            Vehiculo robotica = new Robotica(nombre, motores, mision, potencia, 
                    velocidad, combustible, peso);
            
           System.out.println("---------------Se ha creado una nave tipo------------ ");
           System.out.println(robotica.toString());
           System.out.println();
           return true;
        }
        return false;
    }
    
     /**
     * Metodo que lee los datos de la consola y crea la nave Lanzadera
     * invoca el metodo toString para mostrar los datos de la nave
     * 
     * @return
     * @throws IOException 
     */
    public static boolean crearTripulada() throws IOException{
        String nombre,combustible;
        int potencia,numeroTripulacion,velocidad;
        float peso;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el nombre de la nave,numero Tripulacion,"
                            + "potencia,velocidad,combustible y peso "
                            + "separaado por comas ");
        
        String cadena = br.readLine();
        String[] listaOpciones = cadena.split(",");
        
        if (listaOpciones.length == 6){
            nombre=listaOpciones[0];
            numeroTripulacion=Integer.parseInt(listaOpciones[1]);
            potencia=Integer.parseInt(listaOpciones[2]);
            velocidad=Integer.parseInt(listaOpciones[3]);
            combustible=listaOpciones[4];
            peso=Float.parseFloat(listaOpciones[5]);


            Vehiculo tripulada = new Tripulada(nombre, numeroTripulacion, potencia, 
                    velocidad, combustible, peso);

           System.out.println("---------------Se ha creado una nave tipo------------ ");
           System.out.println(tripulada.toString());
           System.out.println();
           return true;
        }
        return false;
    }
}
