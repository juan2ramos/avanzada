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
public class CompetenciaModel implements ObjectsInterface{
    private static CompetenciaModel INSTANCE = null;
    private ArrayList<Competencias> competenciases = new ArrayList();

  

    public static CompetenciaModel getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CompetenciaModel();
        }
        return INSTANCE;
    }

    public void addCompeticion(Competencias competenciases) {
        this.competenciases.add(competenciases);
    }



    public ArrayList getCompeticion() {
        return null;
        
    }

    public boolean eliminar(Competencias competenciases) {
        this.competenciases.remove(competenciases);
        return true;
    }
}
