/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_10_4dimensiones;

/**
 *
 * @author jozza
 */
public class EVA_1_10_4DIMENSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][][][] arreglo = new int[2][2][2][2];//ALMACENA 16 ENETEROS
        
        for(int i = 0 ; i <arreglo.length ; i++){//1ERA DIMENSION
            
            for(int j = 0 ; j <arreglo[i].length ; j++){ //2DA DIMENSIONS
                
                for(int k = 0 ; k <arreglo[i][j].length ; k++){//3ERA DIMENSION
                    
                    for(int l = 0 ; l <arreglo[i][j][k].length ; l++){//4TA DIMENSION
                        
                        arreglo[i][j][k][i] = (int)(Math.random()*100);
                        System.out.print("[" + arreglo[i][j][k][l] + "]");
                        
                    }
                }
            }
        }














    }
    
}
