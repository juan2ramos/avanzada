/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialciclismo;

/**
 *
 * @author juan2ramos
 */
public class Entrenador extends Participantes  {
    
    private String tiempoCiclista;

    public Entrenador(String tiempoCiclista, String nombre, String edad, String genero, String foto) {
        super(nombre, edad, genero, foto);
        this.tiempoCiclista = tiempoCiclista;
    }

    @Override
    public String toString() {
        return getNombre(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
