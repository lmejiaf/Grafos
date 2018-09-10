/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author lmejiaf
 */
public class Recorridos {

    static int[][] matAd = {{0, 1, 1, 0, 1},
    {1, 0, 1, 1, 1},
    {1, 1, 0, 1, 1},
    {0, 1, 1, 0, 0},
    {1, 1, 1, 0, 0}};
    static boolean[] visitado = new boolean[matAd.length];

    public static void DFS(int u) {
//como hacer un preOrden
        //origen u, destino v
        System.out.print(u + " ");
        visitado[u] = true;
        for (int v = 0; v < matAd.length; v++) {
            if (matAd[u][v] == 1) {
                if (!visitado[v]) {
                    DFS(v);

                }
            }

        }

    }

    public static void BFS(int u) {
        // es como un recorrido por niveles

        Queue<Integer> cola = new LinkedList<Integer>();//FIFO
        visitado[u] = true;
        cola.add(u);

        while (!cola.isEmpty()) {
            u = cola.remove();
            System.out.print(u + " ");

            for (int v = 0; v < matAd.length; v++) {
                if (matAd[u][v] == 1) {
                    if (!visitado[v]) {
                        visitado[v] = true;
                        cola.add(v);
                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        System.out.println("DFS");
        DFS(0);
        for (int i = 0; i < visitado.length; i++) {
            visitado[i] = false;
        }
        System.out.println(" ");
        System.out.println("BFS");
        BFS(0);
    }

}
