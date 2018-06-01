/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_jonrryenamorado;

import java.util.ArrayList;

/**
 *
 * @author wende
 */
public class Criaturas {
    private String raza;
    private double energia;
    private double años;
    private String region;
    private double cantidad;
    private String[] objetos;
    private double peso;

    public Criaturas(String raza, double energia, double años, String region, double cantidad, String[] objetos, double peso) {
        this.raza = raza;
        this.energia = energia;
        this.años = años;
        this.region = region;
        this.cantidad = cantidad;
        this.objetos = objetos;
        this.peso = peso;
    }
    
    public Criaturas(String raza, double energia, double años, String region, double cantidad, String[] objetos) {
        this.raza = raza;
        this.energia = energia;
        this.años = años;
        this.region = region;
        this.cantidad = cantidad;
        this.objetos = objetos;
    }

    public Criaturas() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getAños() {
        return años;
    }

    public void setAños(double años) {
        this.años = años;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String[] getObjetos() {
        return objetos;
    }

    public void setObjetos(String[] objetos) {
        this.objetos = objetos;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return raza;
    }
    
}
