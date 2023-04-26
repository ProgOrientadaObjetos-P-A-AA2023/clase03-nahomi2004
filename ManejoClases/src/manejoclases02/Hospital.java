/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases02;

public class Hospital {
    private String nombre="Hospital X";
    private int numeroCamas=0;
    private double presupuesto=0.00;
    
    // get obtener
    
    public String getNombre() {
        return nombre;
    }
    public int getNumeroCamas() {
        return numeroCamas;
    }
    public double getPresupuesto() {
        return presupuesto;
    }
    
    // set establecer
    
    public void setNombre(String n) {
        nombre=n;
    }
    public void setNumeroCamas(int n) {
        numeroCamas=n;
    }
    public void setPresupuesto(double n) {
        presupuesto=n;
    }
            
}
