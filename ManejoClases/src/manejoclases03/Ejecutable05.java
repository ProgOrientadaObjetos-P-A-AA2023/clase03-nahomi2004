/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases03;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Ejecutable05 {
    public static void main(String[] args){
        Hospital miHospital = new Hospital();
        Scanner entrada = new Scanner(System.in);
        
        String name;
        int camas;
        double saldo;
        
        System.out.println("Ingrese el nombre del hospital:");
        name= entrada.next();
        System.out.println("Ingrese el numero de camas del hospital:");
        camas= entrada.nextInt();
        System.out.println("Ingrese el presupuesto del hospital:");
        saldo= entrada.nextDouble();
        
        miHospital.establecerNombre(name);
        miHospital.establecerNumeroCamas(camas);
        miHospital.establecerPresupuesto(saldo); 
        
        System.out.printf("%s - %d - %.2f\n", miHospital.obtenerNombre(),
                miHospital.obtenerNumeroCamas(), 
                miHospital.obtenerPresupuesto());
    }
}
