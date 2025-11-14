/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estra
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
       List<Alumno> alumno = new ArrayList<>();
       alumno.add(new Alumno("Alonso", 86.9, 90.4));
       alumno.add(new Alumno("Darnell", 99, 78));
       alumno.add(new Alumno("Estrada", 80, 90.2));
       
        for (Alumno alumno1 : alumno) {
            System.out.println( alumno1.getNombre()+ " Promedio: " + alumno1.promedio() );
        }
       
        
        
        
    }
    
}
