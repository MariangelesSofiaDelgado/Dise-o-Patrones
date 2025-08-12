/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo1;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class ImpresoraLibro {
    public void imprimir (Libro libro){
        System.out.println("Titulo: "+libro.getTitulo()+
                "Autor: "+libro.getAutor()+ 
                "Año: "+libro.getAnio());
    }    
}
