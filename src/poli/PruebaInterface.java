/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poli;

import POL.EmpleadoAsalariado;
import POL.Factura;
import POL.PorPagar;

/**
 *
 * @author invitado
 */
public class PruebaInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PorPagar[] objetosPorPagar = new PorPagar[4];

        //Se llama al arreglo con los objetos que implementan la interfaz "Por pagar"
        objetosPorPagar[0] = new Factura("123","Silla", 2,375.00);
        objetosPorPagar[1] = new Factura("123456", "Escritorio", 3, 79.55);
        
        objetosPorPagar[2] = new EmpleadoAsalariado ("Luis","Escober","111",800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado ("Luiss","Reyes","222",1800.00);
        
        System.out.println("Facturas y Empleados procesados en formas polimórficas: \n");
        // Se procesan de forma genérica cada elemento del arreglo "objetosPorPagar".
        for (PorPagar porPagarActual:objetosPorPagar) {
            //Se imprime porPagarActual y su monto de pago apropiado
            
            System.out.printf("%s \n%s: $%,.2f\n\n",porPagarActual.toString(),"Pago vencido", porPagarActual.obtenerMontoPago());
        }
    }

}
