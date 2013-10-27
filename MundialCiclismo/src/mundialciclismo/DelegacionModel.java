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
public class DelegacionModel implements ObjectsInterface{
    private static DelegacionModel INSTANCE = null;
    private ArrayList<Delegaciones> delegaciones = new ArrayList();

  

    public static DelegacionModel getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DelegacionModel();
        }
        return INSTANCE;
    }

    public void addCompeticion(Delegaciones delegaciones) {
        this.delegaciones.add(delegaciones);
    }



    public ArrayList getCompeticion() {
        return null;
        
    }

    public boolean eliminar(Delegaciones delegaciones) {
        this.delegaciones.remove(delegaciones);
        return true;
    }
}
