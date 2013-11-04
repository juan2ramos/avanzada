/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialciclismo;

/**
 *
 * @author juan2ramos
 */
public class PersonalApoyo extends Participantes {
    
    private String cargo;
    private String Tiempo;

    public PersonalApoyo(String cargo, String Tiempo, String nombre, String edad, String genero, String foto) {
        super(nombre, edad, genero, foto);
        this.cargo = cargo;
        this.Tiempo = Tiempo;
    }
    @Override
    public String toString() {
        return getNombre(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
