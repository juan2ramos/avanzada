/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialciclismo;


import java.util.ArrayList;
import java.util.Enumeration;

/**
 *
 * @author juan2ramos
 */
public class Facade {

    public static Facade INSTANCE;
    private CiclistaModel ciclistaModel;
    private CompetenciaModel competenciaModel;
    private CompeticionModel competicionModel;
    private DelegacionModel delegacionModel;
    private EntrenadorModel entrenadorModel;
    private PersonalApoyoModel personalApoyoModel;
    

    /**
     * constructor
     */

    public Facade() {
        ciclistaModel = (CiclistaModel) FactoriaMundial.getInstance().crearObjetos(FactoriaMundial.CiclistaModelStr);
        //competenciaModel = (CompetenciaModel) FactoriaMundial.getInstance().crearObjetos(FactoriaMundial.CompetenciaModelStr);
        //competicionModel = (CompeticionModel) FactoriaMundial.getInstance().crearObjetos(FactoriaMundial.CompeticionModelStr);
        //delegacionModel = (DelegacionModel) FactoriaMundial.getInstance().crearObjetos(FactoriaMundial.DelegacionModelStr);
        //entrenadorModel = (EntrenadorModel) FactoriaMundial.getInstance().crearObjetos(FactoriaMundial.EntrenadorModelStr);
        //personalApoyoModel = (PersonalApoyoModel) FactoriaMundial.getInstance().crearObjetos(FactoriaMundial.PersonalApoyoModelStr);
    
    }
    public static Facade getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Facade();
        }
        return INSTANCE;
    }
    public void  insertarCiclista(Ciclista ciclista){
        ciclistaModel.addCiclista(ciclista);
    }
    public ArrayList getCiclictas(){
        return ciclistaModel.getCiclista();
    }
        
}
