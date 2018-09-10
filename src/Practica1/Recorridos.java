/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;

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

        //origen u, destino v
        System.out.print(u + " ");
        visitado[u] = true;
        for (int v = 0; v < matAd[0].length; v++) {
            if (matAd[u][v] == 1) {
                if (!visitado[v]) {
                    DFS(v);

                }
            }

        }

    }

    public static void main(String[] args) {
        DFS(0);
        
    }

}
