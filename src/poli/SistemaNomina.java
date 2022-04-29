/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poli;

import POL.*;

/**
 *
 * @author Juana García
 */
public class SistemaNomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Gustavo", "Salinas", "459786", 800.00);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Abraham", "Gomez", "215487", 5000, .40, 300);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Carmen", "Castillo", "789321", 1000,.60);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Carmen", "Castillo", "789321", 16.75, 40);

        System.out.println("Se procesan empleados por separado");

        System.out.printf("%s\n%s: $%,.2f\n\n", "Ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", "Ingresos", empleadoBaseMasComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", "Ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", "Ingresos", empleadoPorHoras.ingresos());
        
        Empleado[] empleados = new Empleado[4];
        empleados[0]= empleadoAsalariado;
    }
}
