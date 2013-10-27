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
public class CiclistaModel implements ObjectsInterface{
    private static CiclistaModel INSTANCE = null;
    private ArrayList<Ciclista> ciclistas = new ArrayList();

  

    public static CiclistaModel getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CiclistaModel();
        }
        return INSTANCE;
    }

    public void addCompeticion(Ciclista ciclistas) {
        this.ciclistas.add(ciclistas);
    }



    public ArrayList getCompeticion() {
        return null;
        
    }

    public boolean eliminar(Ciclista ciclistas) {
        this.ciclistas.remove(ciclistas);
        return true;
    }
}
