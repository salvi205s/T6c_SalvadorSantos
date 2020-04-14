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
public class Cephalopodo extends Especie {

    private String habitat;

    public Cephalopodo(String habitat, String tipo, int numPatas, VertebradoInvertebrado vertebradoInvertebrado) {
        super(tipo, numPatas, vertebradoInvertebrado);
        this.habitat = habitat;
    }



    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void presentacion() {
        super.presentacion();
        System.out.println("y vivo en " + habitat);
    }

    public void patear() {
        System.out.println("Me he pateado medio oceano pacifico");
    }

    @Override
    public void comunicacion() {
        System.out.println("Me comunico por señas");
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.habitat);
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
        final Cephalopodo other = (Cephalopodo) obj;
        if (!Objects.equals(this.habitat, other.habitat)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "habitat=" + habitat + '}';
    }

}
