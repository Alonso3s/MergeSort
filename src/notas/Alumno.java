/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas;

/**
 *
 * @author estra
 */
public class Alumno {
    private String Nombre;
    private double nota1;
    private double nota2;

    public Alumno() {
    }

    public Alumno(String Nombre, double nota1, double nota2) {
        this.Nombre = Nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double promedio() {
    return (nota1+nota2)/2;
    }



    
    
}
