/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases02;

public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        
        // Antes de todo reviso si las variables estan bien inicializadas
        System.out.printf("%s - %d - %.2f\n", hospital.getNombre(),
                hospital.getNumeroCamas(), hospital.getPresupuesto());
        
        // Se asigna valores particulares al objeto
        
        hospital.setNombre("Isidro Ayora");
        hospital.setNumeroCamas(100);
        hospital.setPresupuesto(560340.43); 
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f\n", hospital.getNombre(),
                hospital.getNumeroCamas(), hospital.getPresupuesto());
    }
}
