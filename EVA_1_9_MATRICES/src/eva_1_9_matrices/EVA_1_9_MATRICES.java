/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_9_matrices;

/**
 *
 * @author jozza
 */
public class EVA_1_9_MATRICES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int[] [] matriz = new int [5][3];
        System.out.println("matriz = "+ matriz);
        System.out.println("matriz.length = "+ matriz.length);
        
        System.out.println("matriz[0] = "+ matriz[0]);
        System.out.println("matriz[0].lenght = "+ matriz[0].length);
        
        System.out.println("matriz[1] = "+ matriz[1]);
        System.out.println("matriz[].lenght = "+ matriz[1].length);
      //  -----------------------
      
        System.out.println("");
      for( int i = 0; i<matriz.length; i++){//PRIMER DIMENSION -----> FILAS
          for(int j=0; j< matriz[i].length;j++){//SEGUNDA DIMENSION -----> COLUMNAS
              
              matriz[i][j] =(int) (Math.random() * 100);
              
              
          }
      }
      for( int i = 0; i<matriz.length; i++){//PRIMER DIMENSION -----> FILAS
          for(int j=0; j< matriz[i].length;j++){//SEGUNDA DIMENSION -----> COLUMNAS
              
              System.out.print("[" + matriz[i][j]+ "]");
              
              
          }
          System.out.println("");
      }





    }
    
}
