/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo2;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Empleadox {
    private String nombre;
    private double horastrabajadas;
    private double tarifahora;

    public Empleadox(String nombre, double horastrabajadas, double tarifahora) {
        this.nombre = nombre;
        this.horastrabajadas = horastrabajadas;
        this.tarifahora = tarifahora;
    }
    
    public double calcularSalario(){
        return horastrabajadas*tarifahora;
    }
    
    public void imprimirRecibo(){
        System.out.println("Empleado: " +nombre);
        System.out.println("Salario: "+calcularSalario());
    }
}
