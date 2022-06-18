/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudadPrestamo;

    public Prestamo(Persona benef, int tiemPres, String ciuPres) {
        beneficiario = benef;
        tiempoPrestamo = tiemPres;
        ciudadPrestamo = ciuPres;
    }

    public void establecerBeneficiario(Persona benef) {
        beneficiario = benef;
    }

    public void establecerTiempoPrestamo(int tiemPres) {
        tiempoPrestamo = tiemPres;
    }

    public void establecerCiudadPrestamo(String ciuPres) {
        ciudadPrestamo = ciuPres;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public String obtenerCiudadPrestamo() {
        return ciudadPrestamo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Beneficiario",
                ;
    }
    return cadena;

}
