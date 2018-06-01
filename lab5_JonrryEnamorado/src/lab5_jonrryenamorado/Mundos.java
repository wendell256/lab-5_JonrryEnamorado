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
public class Mundos {
    private String name;
    private ArrayList<Criaturas> criaturas;
    double peso;

    public Mundos() {
    }

    public Mundos(String name, double peso) {
        this.name = name;
        criaturas = new ArrayList();
        this.peso = peso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Criaturas> getCriaturas() {
        return criaturas;
    }

    public void setCriaturas(ArrayList<Criaturas> criaturas) {
        this.criaturas = criaturas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Mundos{" + "name=" + name + ", criaturas=" + criaturas + ", peso=" + peso + '}';
    }

    
}
