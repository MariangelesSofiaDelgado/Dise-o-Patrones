package demo1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-USR-LNORTE
 */
public class LibroX {
    //atributos
    private String titulo;
    private String autor;
    private int anio;
    //construtor explicito
    public LibroX(String titulo, String autor, int anio){
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }
    
    public void imprimirLibro (){
        System.out.println("Titulo: "+titulo+"Autor: "+autor+"Año: "+anio);
    }
    
    public void guardarBasedeDatos () {
        System.out.println("Guardando el libro en la base de datos...");
    }

    
}
