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
    
    public static ArrayList <Participantes> participantes = new ArrayList<Participantes>();

    /**
     * constructor
     */

    public Facade() {
        ciclistaModel = (CiclistaModel) FactoriaMundial.getInstance().crearObjetos(FactoriaMundial.CiclistaModelStr);
        competenciaModel = (CompetenciaModel) FactoriaMundial.getInstance().crearObjetos(FactoriaMundial.CompetenciaModelStr);
        competicionModel = (CompeticionModel) FactoriaMundial.getInstance().crearObjetos(FactoriaMundial.CompeticionModelStr);
        delegacionModel = (DelegacionModel) FactoriaMundial.getInstance().crearObjetos(FactoriaMundial.DelegacionModelStr);
        entrenadorModel = (EntrenadorModel) FactoriaMundial.getInstance().crearObjetos(FactoriaMundial.EntrenadorModelStr);
        personalApoyoModel = (PersonalApoyoModel) FactoriaMundial.getInstance().crearObjetos(FactoriaMundial.PersonalApoyoModelStr);
    
    }
    public static Facade getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Facade();
        }
        return INSTANCE;
    }
    public void  insertarCiclista(Ciclista ciclista){
        ciclistaModel.addCiclista(ciclista);
        Facade.participantes.add(ciclista);
    }
    public ArrayList getCiclictas(){
        return ciclistaModel.getCiclista();
    }
    public void  insertarEntrenador (Entrenador entrenador){
        entrenadorModel.addEntrenador(entrenador);
        Facade.participantes.add(entrenador);
    }
    public ArrayList getEntrenador(){
        return entrenadorModel.getEntrenador();
    }
    public void  insertarPersonalApoyo (PersonalApoyo personalApoyo){
        personalApoyoModel.addPersonalApoyo(personalApoyo);
        Facade.participantes.add(personalApoyo);
    }
    public ArrayList getPersonalApoyo(){
        return personalApoyoModel.getPersonalApoyo();
    }
    public ArrayList getParticipantes(){
        return participantes;
    }
    
    //Delegacion
     public void  insertarDelegacion(Delegaciones delegaciones){
        delegacionModel.addDelegacion(delegaciones);
    }
    public ArrayList getDelegacion(){
        return delegacionModel.getDelegacion();
    }
    //Competicion
    public void  insertarCompeticion(Competicion competicion){
        competicionModel.addCompeticion(competicion);
    }
    public ArrayList getCompeticion(){
        return competicionModel.getCompeticion();
    }
     public void  insertarCompeticiones(Competencias competencias){
        competenciaModel.addCompeticiones(competencias);
    }
    public ArrayList getCompeticiones(){
        return competenciaModel.getCompeticiones();
    }
        
}
