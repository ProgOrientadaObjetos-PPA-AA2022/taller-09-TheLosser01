/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Persona {

    private String tipoAuto;
    private String marcaAuto;
    private double valorAuto;
    private double valorMensualPrestamo;

    public PrestamoAutomovil(String tA, String mA, double vA, double vMP) {
        super(nom, ape, user);
        tipoAuto = tA;
        marcaAuto = mA;
        valorAuto = vA;
        valorMensualPrestamo = vMP;
    }

    public void establecerTipoAuto(String tA) {
        tipoAuto = tA;
    }

    public void establecerMarcaAuto(String mA) {
        marcaAuto = mA;
    }

    public void establecerValorAuto(double vA) {
        valorAuto = vA;
    }

    public void establecerValorMPrestamo(double vMP) {
        valorMensualPrestamo = vMP;
    }

    public String obtenerTipoAuto() {
        return tipoAuto;
    }

    public String obtenerMarcaAuto() {
        return marcaAuto;
    }

    public double obtenerValorAuto() {
        return valorAuto;
    }

    public double obtenerValorPrestamo() {
        return valorMensualPrestamo;
    }

    @Override
    public String toString() {
        String cadena = String.format("PRESTAMO AUTOMOVIL\n"
                + "Tipo de Automvil: %s"
                + "Marca Automovil: %s"
                + "GARANTE\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Username: %s\n"
                + "Valor del Automovil: %.2f\n"
                + "Valor mensual de Pago de prestamo: %.2f\n",
                obtenerTipoAuto(),
                obtenerMarcaAuto(),
                nombre,
                apellido,
                username,
                obtenerValorAuto(),
                obtenerValorPrestamo());
        return cadena;
    }

}
