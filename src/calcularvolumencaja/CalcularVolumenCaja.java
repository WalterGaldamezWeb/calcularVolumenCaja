/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularvolumencaja;
import java.util.Scanner;
/**
 *
 * @author Walter Gdmz
 */
class Caja{
    double ancho;
    double alto;
    double largo;
    
    Caja(){
    }
    
    Caja(double ancho,double alto,double profundo){
        this.ancho=ancho;
        this.alto=alto;
        this.largo=largo;
    }
    
    double calcularVolumen(double ancho,double alto,double largo){
        double volumen=ancho*alto*largo;
        return volumen;
        }
}
public class CalcularVolumenCaja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja objeto = new Caja();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ancho de la caja");
        double ancho = leer.nextDouble();
        System.out.println("Ingrese la altura de la caja");
        double alto = leer.nextDouble();
        System.out.println("Ingrese el largo de la caja");
        double largo = leer.nextDouble();
        
        double resultado = objeto.calcularVolumen(ancho, alto, largo);
        
        System.out.println("El Volumen de la caja es: "+resultado+" cm3");
    }
    
}
