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
public class Octopoda extends Especie {

    private String habitat;

    public Octopoda(String habitat, VertebradoInvertebrado vertebradoInvertebrado) {
        super(vertebradoInvertebrado);
        this.habitat = habitat;
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

    public void parear() {
        System.out.println("Me he pateado medio oceano pacifico");
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.habitat);
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
        final Octopoda other = (Octopoda) obj;
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
