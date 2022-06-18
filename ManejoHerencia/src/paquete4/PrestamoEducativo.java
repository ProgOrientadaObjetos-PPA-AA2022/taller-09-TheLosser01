/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends InstitucionEducativa {

    private String nivelEstudio;
    private double valorCarrera;
    private double valorMensualPrestamo;

    public PrestamoEducativo(String nE, double vC, double vMP) {
        nivelEstudio = nE;
        super(nomIns, sig);
        valorCarrera = vC;
        valorMensualPrestamo = vMP;
    }

    public void establecerNivelEstudio(String nE) {
        nivelEstudio = nE;
    }

    public void establecerValorCarrera(double vC) {
        valorCarrera = vC;
    }

    public void establecerValorMensualPrestamo(double vMP) {
        valorMensualPrestamo = vMP;
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensualPrestamo() {
        return valorMensualPrestamo;
    }

    @Override
    public String toString() {
        String cadena = String.format("PRESTAMO EDUCATIVO\n"
                + "Nivel de Estudio: %s\n"
                + "Nombre de la Institucion: %s "
                + "Siglas: %s \n"
                + "Valor de la Carrera: %.2f\n"
                + "Valor Mensual Prestamo: %.2f\n",
                obtenerNivelEstudio(),
                nombreInst,
                siglas,
                obtenerValorCarrera(),
                obtenerValorMensualPrestamo());
        return cadena;

    }

}
