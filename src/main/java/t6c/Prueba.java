/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6c;

import java.util.ArrayList;

/**
 * Crea al menos dos instancias de cada clase y añádelas a una lista de objetos
 * de la superclase A. Recorre la lista y realiza las siguientes acciones: llama
 * a métodos propios de cada clase (“metodoB”, “metodoC” y “metodoD”). llama a
 * “metodoA” de todos los objetos. Usa los métodos indexof(Object o),
 * contains(Object o) y remove(Object o) de la clase ArrayList, sobre la lista
 * de objetos que ya tienes, para buscar un objeto en la lista, saber si existe
 * un objeto en la lista y borrar un objeto de la lista, respectivamente. Si
 * funcionan correctamente significa que el método equals está correctamente
 * implementado. Realiza un commit  *
 */
public class Prueba {

    public static void main(String[] args) {

        //Crea al menos dos instancias de cada clase y añádelas a una lista de objetos de la superclase A. 
        Especie especie1 = new Especie("felino", 4, VertebradoInvertebrado.VERTEBRADO);
        Especie especie2 = new Especie("equino", 4, VertebradoInvertebrado.VERTEBRADO);

        Canina perro = new Canina("Tierra", "Perro", 4, VertebradoInvertebrado.VERTEBRADO);
        Canina hiena = new Canina("Tierra", "hiena", 4, VertebradoInvertebrado.VERTEBRADO);

        Cephalopodo pulpo = new Cephalopodo("Mar", "Cephalopodo", 8, VertebradoInvertebrado.INVERTEBRADO);
        Cephalopodo calamar = new Cephalopodo("Mar", "Cephalopodo", 10, VertebradoInvertebrado.INVERTEBRADO);
        
        ArrayList<Animal> listaAnimales=new ArrayList<>();
        
        listaAnimales.add(especie1);
        listaAnimales.add(especie2);
        
        listaAnimales.add(perro);
        listaAnimales.add(hiena);
        
        listaAnimales.add(pulpo);
        listaAnimales.add(calamar);
        

    }
}
