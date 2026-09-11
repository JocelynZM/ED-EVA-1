/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_8_arreglos_objetos;

/**
 *
 * @author jozza
 */
public class EVA_1_8_ARREGLOS_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // Ejemplo[] arreglo;
        // System.out.println("ARREGLO = " + arreglo);
        Ejemplo[] arreglo = null;
        
        arreglo = new Ejemplo[2];
        System.out.println("ARREGLO = " + arreglo);
        System.out.println("ARREGLO [0] = "+ arreglo[0]);
        System.out.println("ARREGLO [1] = "+ arreglo[1]);
        
        arreglo[0]= new Ejemplo();
        arreglo[1]= new Ejemplo();
        //GUARDA LA DIRECCION EN EL OBJETO
        System.out.println("ARREGLO [0] = "+ arreglo[0]);
        System.out.println("ARREGLO [1] = "+ arreglo[1]);
        
        //AQUI EL ARRAY GUARDA LA DIRECCION DEL OBJETO, I ALMACENA UN ENTERO 5
        System.out.println("ARREGLO [1] = "+ arreglo[0].i);
        
        
        
        
        
    }

    
}   
    


