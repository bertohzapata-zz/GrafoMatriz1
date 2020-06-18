/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos1;

/**
 *
 * @author bertohzapata
 */
public class GrafoMatriz {
    int numVertices;
    Vertice [] verts;
    int [][]matAd;
   
  
    public GrafoMatriz(int mx) {
        matAd = new int[mx][mx];
        verts = new Vertice[mx];
        for (int i = 0; i < mx; i++) {
            for (int j = 0; j < mx; j++) {
                matAd[i][j] = 0;
            }
        }
        numVertices = 0;
    }
    
    public int numVertice(String vs){ // devuelve -1 si no lo encuentra
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for (; (i < numVertices) && !encontrado;) {
            encontrado = verts[i].equals(v);
            if (!encontrado) i++;
        }
        return (i < numVertices) ? i : -1 ;
        
    }
    
    public void nuevoVertice(String nombre) { // crear nuvo Vértice
        boolean existe = numVertice(nombre) >= 0;
        if (!existe) {
            Vertice v = new Vertice(nombre);
            v.asigVertice(numVertices);
            verts[numVertices++] = v;
        }
    }
    
    public void nuevoArco(String a, String b)throws Exception { // busca en el array ambos vértices y marca la matriz
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception("Vértice no existe");
        matAd[va][vb] = 1;
    }
    
    public boolean adyacente (String a, String b) throws Exception { // comprueba si hay un arco entre dos vértices
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception("Vértice no existe");
        return matAd[va][vb] == 1;
    }
    
    
    
    
}
