/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_7_arreglos_size;

/**
 *
 * @author jozza
 */
public class EVA_1_7_ARREGLOS_SIZE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

int[] original = new int[10];


//DIRECCION DEL ARREGLO
     System.out.println(original);


for(int i = 0; i< original.length;i++){
    
    original[i] = (int) (Math.random()* 100);

}

for(int i = 0; i< original.length;i++){ //IMPRIMIR
    System.out.println("[" + original[i]+"]");    
}

        System.out.print("");
          //CAMBIAR EL TAMAÑO (NO SE PUEDE)
       //  original = new int [5];
         
         System.out.println(original);

     //    for(int i = 0; i< original.length;i++){ //IMPRIMIR ARREGLO "MODIFICADO"
   // System.out.println("[" + original[i]+"]");    
    
             //}
         
     int[] original2 = new int[5];

    for(int i = 0; i< original2.length;i++){ //IMPRIMIR

    original2[i] = (int) (original[i]);
    
    System.out.println("[" + original2[i]+"]");    
    
    }

    
    
    
    
}
    }
    
    

