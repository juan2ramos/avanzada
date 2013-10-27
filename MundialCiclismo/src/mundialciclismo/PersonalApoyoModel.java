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
public class PersonalApoyoModel implements ObjectsInterface{
    private static PersonalApoyoModel INSTANCE = null;
    private ArrayList<PersonalApoyo> personalApoyos = new ArrayList();

  

    public static PersonalApoyoModel getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PersonalApoyoModel();
        }
        return INSTANCE;
    }

    public void addCompeticion(PersonalApoyo personalApoyo) {
        this.personalApoyos.add(personalApoyo);
    }



    public ArrayList getCompeticion() {
        return null;
        
    }

    public boolean eliminar(PersonalApoyo personalApoyo) {
        personalApoyos.remove(personalApoyo);
        return true;
    }
}
