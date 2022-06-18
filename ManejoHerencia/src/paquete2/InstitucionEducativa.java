/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author VIVOBOOK
 */
public class InstitucionEducativa {

    protected String nombreInst;
    protected String siglas;

    public void establecerNombreInstitucion(String nomIns) {
        nombreInst = nomIns;
    }

    public void establecerSiglas(String sig) {
        siglas = sig;
    }

    public String obtenerNombreInstitucion() {
        return nombreInst;
    }

    public String obtenerSiglas() {
        return siglas;
    }

}
