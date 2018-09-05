/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolibros;

/**
 *
 * @author Estudiante
 */
public class Libro {
    private String titulo;
    private int numPags;
    private float calificacion;
    private Autor autor;

    public Libro(String titulo, int numPags, float calificacion) {
        this.titulo = titulo;
        this.numPags = numPags;
        this.calificacion = calificacion;
    }

    public Libro(String titulo, int numPags, float calificacion, Autor autor) {
        this.titulo = titulo;
        this.numPags = numPags;
        this.calificacion = calificacion;
        this.autor = autor;
    }

    public String getTitulo() {
    return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    
    
    
}
