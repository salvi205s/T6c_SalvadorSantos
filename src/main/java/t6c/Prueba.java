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
 * “metodoA” de todos los objetos. * Usa los métodos indexof(Object o),
 * contains(Object o) y remove(Object o) de la clase ArrayList, sobre la lista
 * de objetos que ya tienes, para buscar un objeto en la lista, saber si existe
 * un objeto en la lista y borrar un objeto de la lista, respectivamente.
 *
 * Si funcionan correctamente significa que el método equals está correctamente
 * implementado. Realiza un commit Comenta el código, indicando donde haces
 * conversiones implícitas y explícitas y cual o cuales son los métodos
 * polimórficos que hay en la jerarquía
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

        //creamos la lista
        ArrayList<Animal> listaAnimales = new ArrayList<>();

        //añadimos los objetos a la lista
        listaAnimales.add(especie1);
        listaAnimales.add(especie2);

        listaAnimales.add(perro);
        listaAnimales.add(hiena);

        listaAnimales.add(pulpo);
        listaAnimales.add(calamar);

        System.out.println("-----------------------------------------------------------------");

        //Recorre la lista y realiza las siguientes acciones:  
        //llama a métodos propios de cada clase (“metodoB”, “metodoC” y “metodoD”). llama a “metodoA” de todos los objetos.
        for (Animal animales : listaAnimales) {
            //metodo polimórfico
            animales.presentacion();
            System.out.println("");
        }
        //Todas las conversiones dentro de este for son explicitas
        for (Animal animales : listaAnimales) {

            if (animales instanceof Especie) {
                System.out.println("Metodo propio de especie");

                Especie e = (Especie) animales;
                e.identificacion();
                System.out.println("-----------------");
            }
            if (animales instanceof Canina) {
                System.out.println("Metodo propio de Canina");

                Canina c = (Canina) animales;
                c.ladro();
                System.out.println("------------------");

            }
            if (animales instanceof Cephalopodo) {
                System.out.println("Metodo propio de Cephalopodo");

                Cephalopodo ceph = (Cephalopodo) animales;
                ceph.patear();
                System.out.println("------------------");

            }

        }

        /*Usa los métodos indexof(Object o), contains(Object o) y remove(Object o) de la clase ArrayList, 
        sobre la lista de objetos que ya tienes, para buscar un objeto en la lista, saber si existe un objeto en la lista y borrar un objeto de la lista, 
        respectivamente. Si funcionan correctamente significa que el método equals está correctamente implementado. Realiza un commit 
         */
        System.out.println("indexof " + listaAnimales.indexOf(pulpo));
        System.out.println("contains " + listaAnimales.contains(pulpo));
        System.out.println("remove " + listaAnimales.remove(pulpo));

        //imprimir para comprobar que pulpo ya no esta en la lista
        for (int i = 0; i < listaAnimales.size(); i++) {
            System.out.println(listaAnimales.get(i));
        }

    }
}
