
package Clases;

import java.util.Objects;

public class Publicacion {
    protected String titulo;
    protected int anioPublicacion;

    public Publicacion(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, anioPublicacion);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Publicacion other = (Publicacion) obj;
        return this.titulo.equals(other.titulo) && this.anioPublicacion == other.anioPublicacion;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "autor=" + titulo + ", anioPublicacion=" + anioPublicacion + '}';
    }
}
