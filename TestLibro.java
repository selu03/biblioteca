/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.Biblioteca;
public class TestLibro {
    public static void main(String[] args) {
        Libro li=new Libro();
        li.settitulo("Don Quijote");
        li.setautor("Miguel de Cervantes");
        li.setejemplares(4);
        li.setprestados(2);
        System.out.println(li.toString());
        
        
    }
    
}
