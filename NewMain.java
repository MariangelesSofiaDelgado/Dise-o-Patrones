/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo2;

public class NewMain {

    public static void main(String[] args) {
        Empleado emp = new Empleado("Juan Perez",160, 70.5);
        CalcularSalario cal = new CalcularSalario ();
        GenerarRecibo recibo = new GenerarRecibo();
        double salario = cal.calcular(emp);
        recibo.imprimir(emp, salario);
    }
      
    
}
