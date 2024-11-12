
package Excepciones;

public class PublicacionYaExisteException extends RuntimeException {
    private static final String MENSAJE = "La publicacion ya esta en la biblioteca.";
    
    public PublicacionYaExisteException() {
        super(MENSAJE);
    }
}
