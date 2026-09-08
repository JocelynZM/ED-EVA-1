/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_5_paso_parametros;

/**
 *
 * @author jozza
 */
public class EVA_1_5_PASO_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PASO POR VALOR
        int i = 5;
        System.out.println("VALOR DE I = " +i);
        incrementar(i);
        
        System.out.println("VALOR DE I (DESPUES DE INCREMENTAR) = "+i);
        
        //PASO POR REFERENCIA
        Prueba prueba = new Prueba();
        System.out.println("VALOR DE PRUEBA . Y = "+ prueba.y);
        incrementarObj(prueba);
        System.out.println("VALOR DE PRUEBA . Y (DESPUES DE INCREMENTAR) = "+ prueba.y);
    }
    
    public static void incrementar(int valor){//PASO POR VALOR (RECIBO UNA COPIA)
        
        valor ++;
    }
    
    public static void incrementarObj(Prueba objeto){
        objeto.y++;
                
        
        
        
    }
    
    
}
class Prueba{
    
    int y = 5;
    
}
