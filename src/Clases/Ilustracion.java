
package Clases;

public class Ilustracion extends Publicacion{
    
    private String ilustrador;
    private double alto;
    private double ancho;

    public Ilustracion(String titulo, int anioPublicacion, String ilustrador, double alto, double ancho) {
        super(titulo, anioPublicacion);
        this.ilustrador = ilustrador;
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Ilustracion{" + "ilustrador=" + ilustrador + ", alto=" + alto + ", ancho=" + ancho + '}';
    }
    
    
    
}
