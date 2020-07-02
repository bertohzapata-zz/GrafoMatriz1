/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos1;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author bertohzapata
 */
public class RecorreGrafo {
    private static final int CLAVE = 90;
    
    public static int[] recorrerAnchura(GrafoMatriz g, String org) throws Exception{
        int w, v;
        int [] m;
        
        // Vértice inicial
        v = g.numVertice(org);
        if( v < 0) throw new Exception("Vértice origen no existe");
        
        Queue<Integer> cola = new LinkedList();
        m = new int[g.numVertices];
        // Inicializa los vértices como no marcados
        for (int i = 0; i < g.numVertices; i++) {
            m[i] = CLAVE;
        }
        // vértice origen marcado
        m[v] = 0;
        cola.add(v);
        
        while (!cola.isEmpty()) {
            w = cola.remove(); // Devuelve el indice o posición (entero)
            System.out.println("Vértice " + g.verts[w] + " => visitado");
            // Inserta en la cola los adyacentes de w no marcados
            for (int u = 0; u < g.numVertices; u++){
                if ((g.matAd[w][u] == 1) && (m[u] == CLAVE)){
                    // se marca vértice u con número de arcos hasta él
                    m[u] = m[w] + 1;
                    cola.add(u);
                }
            }
        }
        return m;
    }
}
