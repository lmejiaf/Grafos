/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;

import java.util.LinkedList;

/**
 *
 * @author lmejiaf
 */
public class Grafo {

    LinkedList<Vertice> vertices = new LinkedList<>();
    LinkedList<Vertice> visitados = new LinkedList<>();

    public void insertarAdyacente(Vertice inicial, Vertice fin) {
        if (vertices.contains(inicial)) {
            inicial.apuntadores.add(fin);
        }
    }

    public void add(Vertice v) {
        vertices.add(v);
    }


    public void DFS(Vertice inicio) {

// como hacer un preOrden
//        //origen u, destino v
//        System.out.print(u + " ");
//        visitado[u] = true;
//        for (int v = 0; v < matAd.length; v++) {
//            if (matAd[u][v] == 1) {
//                if (!visitado[v]) {
//                    DFS(v);
//
//                }
//            }
//
//        }
//
//    }   
        System.out.print(inicio.dato + " ");
        visitados.add(inicio);
        for (Vertice apuntador : inicio.apuntadores) {
            if (!visitados.contains(apuntador)) {
                DFS(apuntador);
            }
        }

    }

    public static void main(String[] args) {
        Grafo g = new Grafo();

        Vertice A = new Vertice(0);
        Vertice B = new Vertice(1);
        Vertice C = new Vertice(2);
        Vertice D = new Vertice(3);
        Vertice E = new Vertice(4);

        g.add(A);
        g.add(B);
        g.add(C);
        g.add(D);
        g.add(E);

        g.insertarAdyacente(B, A);
        g.insertarAdyacente(A, C);
        g.insertarAdyacente(C, E);
        g.insertarAdyacente(E, D);
        g.insertarAdyacente(D, B);
        g.insertarAdyacente(A, D);
        g.insertarAdyacente(B, E);
        
        g.DFS(A);
        
    }
}
