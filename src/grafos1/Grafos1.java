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
public class Grafos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GrafoMatriz matriz = new GrafoMatriz(7);
        matriz.nuevoVertice("A");
        matriz.nuevoVertice("B");
        matriz.nuevoVertice("C");
        matriz.nuevoVertice("D");
        matriz.nuevoVertice("T");
        matriz.nuevoVertice("H");
        matriz.nuevoVertice("R");
       
        try {
            matriz.nuevoArco("D", "B");
            matriz.nuevoArco("D", "C");
            matriz.nuevoArco("B", "H");
            matriz.nuevoArco("C", "R");
            matriz.nuevoArco("R", "H");
            matriz.nuevoArco("H", "D");
            matriz.nuevoArco("H", "T");
            matriz.nuevoArco("H", "A");
            
            RecorreGrafo.recorrerAnchura(matriz, "D");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
//        GrafoMatriz matriz = new GrafoMatriz(6);
//        matriz.nuevoVertice("0");
//        matriz.nuevoVertice("1");
//        matriz.nuevoVertice("2");
//        matriz.nuevoVertice("3");
//        matriz.nuevoVertice("4");
//        matriz.nuevoVertice("5");
//       
//        try {
//            matriz.nuevoArco("0", "3");
//            matriz.nuevoArco("1", "3");
//            matriz.nuevoArco("0", "4");
//            matriz.nuevoArco("4", "0");
//            matriz.nuevoArco("3", "1");
//            matriz.nuevoArco("1", "3");
//            matriz.nuevoArco("4", "2");
//            matriz.nuevoArco("2", "4");
//            matriz.nuevoArco("4", "5");
//            matriz.nuevoArco("5", "4");
//            matriz.nuevoArco("1", "5");
//            matriz.nuevoArco("5", "1");
//            
//            RecorreGrafo.recorrerAnchura(matriz, "0");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        
        
        
        
    }
    
    
    
    
}

