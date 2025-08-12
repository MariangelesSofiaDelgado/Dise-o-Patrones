/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo2;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Empleado {
     private String nombre;
    private double horastrabajadas;
    private double tarifahora;

    public Empleado(String nombre, double horastrabajadas, double tarifahora) {
        this.nombre = nombre;
        this.horastrabajadas = horastrabajadas;
        this.tarifahora = tarifahora;
    }

    public String getNombre() {return nombre;}

    public double getHorastrabajadas() {return horastrabajadas;}

    public double getTarifahora() {return tarifahora;}

}
