/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author VIVOBOOK
 */
public class Persona {

    protected String nombre;
    protected String apellido;
    protected String username;

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }
    
    public void establecerUsername(String user){
        username = user;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public String obtenerUsername(){
        return username;
    }
    
}
