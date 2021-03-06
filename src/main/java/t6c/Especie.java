/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6c;

import java.util.Objects;

/**
 *
 * @author Salva
 */
public class Especie extends Animal {

    private String tipo;
    private int numPatas;

    public Especie(String tipo, int numPatas, VertebradoInvertebrado vertebradoInvertebrado) {
        super(vertebradoInvertebrado);
        this.tipo = tipo;
        this.numPatas = numPatas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    //metodo polimórfico
    @Override
    public void presentacion() {
        super.presentacion();
        System.out.println("tengo " + numPatas + " patas ");
    }

    public void identificacion() {
        System.out.println("Soy un animal de una especie sin determinar ");
    }

    //metodo polimórfico
    public void comunicacion() {
        System.out.println("Me comunico mediante sonidos");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.tipo);
        hash = 37 * hash + this.numPatas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        // Compara ambos vehiculos antes de comparar
        // los atributos propios de turismo
        if (!super.equals(obj)) {
            return false;
        }

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Especie other = (Especie) obj;
        if (this.numPatas != other.numPatas) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " Especie{" + "tipo=" + tipo + ", numPatas=" + numPatas + ' ';
    }

}
