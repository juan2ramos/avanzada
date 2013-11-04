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
public class CompeticionModel implements ObjectsInterface{
    
    private static CompeticionModel INSTANCE = null;
    private ArrayList<Competicion> competiciones = new ArrayList();

  

    public static CompeticionModel getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CompeticionModel();
        }
        return INSTANCE;
    }

    public void addCompeticion(Competicion competicion) {
        this.competiciones.add(competicion);
    }



    public ArrayList getCompeticion() {
        return competiciones;
        
    }

    public boolean eliminar(Competicion competicion) {
        competiciones.remove(competicion);
        return true;
    }


    
}
