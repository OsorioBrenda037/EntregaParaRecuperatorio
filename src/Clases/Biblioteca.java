
package Clases;

import Excepciones.PublicacionYaExisteException;
import Interfaces.Leible;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Publicacion> publicaciones;
    
    public Biblioteca() {
        publicaciones = new ArrayList<>();
    }
    
    public void agregarPublicacion(Publicacion p) {
        if (p == null){
            throw new NullPointerException("La publicacion no existe.");
        }
        if (publicaciones.contains(p)) {
            throw new PublicacionYaExisteException();
        }
        publicaciones.add(p);
    }
    
    public void mostrarPublicaciones() {
        for (Publicacion p: publicaciones) {
            System.out.println(p);  
        }
    }
    
    public void leerPublicaciones() {
        for (Publicacion p: publicaciones) {
            if (p instanceof Leible pl) {
                pl.leer();
            } else {
                System.out.println("La ilustracion " + p.getTitulo() + " no se puede leer.");
            }            
        }
    }
    
}
