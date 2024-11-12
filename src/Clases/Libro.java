
package Clases;

import Interfaces.Leible;

public class Libro extends Publicacion implements Leible {
    private String autor;
    private Genero genero;

    public Libro(String titulo, int anioPublicacion, String autor, Genero genero) {
        super(titulo, anioPublicacion);
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public void leer() {
        System.out.println("El libro: " + getTitulo() + " se esta leyendo...");
    }

    @Override
    public String toString() {
        return "Libro[" + "autor=" + autor + ", genero=" + genero + ']';
    }
}
