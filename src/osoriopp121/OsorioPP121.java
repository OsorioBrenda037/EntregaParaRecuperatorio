
package osoriopp121;

import Clases.Biblioteca;
import Clases.Genero;
import Clases.Ilustracion;
import Clases.Libro;
import Clases.Revista;
import Excepciones.PublicacionYaExisteException;

public class OsorioPP121 {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
         
        //Agrego publicaciones
        biblioteca.agregarPublicacion(new Libro("H. G. Wells", 1898,"La Guerra de los Mundos",Genero.FICCION));
        biblioteca.agregarPublicacion(new Revista("Muy Interesante", 2024, 436));
        biblioteca.agregarPublicacion(new Ilustracion("La naranja pensante", 2015, "Daniel Osorio", 125.5, 105.0));
        biblioteca.agregarPublicacion(new Libro("Rodolfo Walsh", 1957, "Operacion Masacre", Genero.NO_FICCION));
        biblioteca.agregarPublicacion(new Revista("Caras", 875,2010));
        biblioteca.agregarPublicacion(new Ilustracion("El lavaropas", 2021, "Quiros Camila", 50, 100));
            
        try {     
            biblioteca.mostrarPublicaciones();
            
            System.out.println();
            biblioteca.leerPublicaciones();
            
            System.out.println();
            
            //Repetidos
            biblioteca.agregarPublicacion(new Libro("H. G. Wells", 1898, "La Guerra de los Mundos", Genero.FICCION));
            biblioteca.agregarPublicacion(new Revista("Caras", 875, 2010));
            biblioteca.agregarPublicacion(new Ilustracion("El lavaropas", 2021, "Quiros Camila", 50, 100));
            
            System.out.println();
            
            biblioteca.mostrarPublicaciones();
            
            System.out.println();
            
            biblioteca.leerPublicaciones();
            
            System.out.println();
        } catch(PublicacionYaExisteException e) {
            System.out.println(e.getMessage());
        }
    }

}
