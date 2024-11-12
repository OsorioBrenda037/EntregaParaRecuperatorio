
package Clases;

import Interfaces.Leible;

public class Revista extends Publicacion implements Leible {
    private int nroEdicion;

    public Revista(String titulo, int anioPublicacion, int nroEdicion) {
        super(titulo, anioPublicacion);
        this.nroEdicion = nroEdicion;
    }

    @Override
    public void leer() {
        System.out.println("La revista " + getTitulo() + " se esta leyendo...");
    }

    @Override
    public String toString() {
        return "Revista{" + "nroEdicion=" + nroEdicion + '}';
    }
}
