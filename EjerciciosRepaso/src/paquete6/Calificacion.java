/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Calificacion {

    private double nota;
    private String nombreMateria;
    private Profesor profesor;

    public Calificacion(double not, String nombre) {

        nombreMateria = nombre;
        nota = not;

    }

    public void establecerNota(double n) {
        nota = 0;
    }

    public void establecerNombreMateria(String n) {
        nombreMateria = n;
    }

    public void establecerProfesor(Profesor n) {
        profesor = n;
    }

    public double obtenerNota() {
        return nota;
    }

    public String obtenerNombreMateria() {
        return nombreMateria;
    }

    public Profesor obtenerProfesor() {
        return profesor;
    }

}
