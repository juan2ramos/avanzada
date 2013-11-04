/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialciclismo;

import java.util.ArrayList;

/**
 *
 * @author juan2ramos
 */
public class EntrenadorModel implements ObjectsInterface{
    private static EntrenadorModel INSTANCE = null;
    private ArrayList<Entrenador> entrenadores = new ArrayList();

  

    public static EntrenadorModel getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new EntrenadorModel();
        }
        return INSTANCE;
    }

    public void addEntrenador(Entrenador entrenador) {
        this.entrenadores.add(entrenador);
    }



    public ArrayList getEntrenador() {
        return entrenadores;
        
    }

    public boolean eliminar(Entrenador entrenador) {
        entrenadores.remove(entrenador);
        return true;
    }
}
