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
public class Animal {

    private VertebradoInvertebrado vertebradoInvertebrado;

    public Animal(VertebradoInvertebrado vertebradoInvertebrado) {
        this.vertebradoInvertebrado = vertebradoInvertebrado;
    }

    public VertebradoInvertebrado getVertebradoInvertebrado() {
        return vertebradoInvertebrado;
    }

    public void setVertebradoInvertebrado(VertebradoInvertebrado vertebradoInvertebrado) {
        this.vertebradoInvertebrado = vertebradoInvertebrado;
    }

    public void presentacion() {
        System.out.print("Hola soy un animal ");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.vertebradoInvertebrado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.vertebradoInvertebrado != other.vertebradoInvertebrado) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" + "vertebradoInvertebrado=" + vertebradoInvertebrado + '}';
    }

}
