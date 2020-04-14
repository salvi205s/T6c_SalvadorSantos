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
public class Canina extends Especie {

    private String habitat;

    public Canina(VertebradoInvertebrado vertebradoInvertebrado) {
        super(vertebradoInvertebrado);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void presentacion() {
        super.presentacion();
        System.out.println("y vivo en " + habitat);
    }

    public void ladro() {
        System.out.println("Me paso todo el dia ladrando");
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.habitat);
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
        final Canina other = (Canina) obj;
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
