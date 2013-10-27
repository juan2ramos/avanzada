/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialciclismo;

/**
 *
 * @author juan2ramos
 */
public abstract class Participantes {
    
    private String nombre;
    private String edad;
    private String genero;
    private String foto;

    public Participantes(String nombre, String edad, String genero, String foto) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.foto = foto;
    }

    public String getEdad() {
        return edad;
    }

    public String getFoto() {
        return foto;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
