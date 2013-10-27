/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialciclismo;

/**
 *
 * @author juan2ramos
 */
public class FactoriaMundial {

    public static String CiclistaModelStr = "CiclistaModel";
    public static String EntrenadorModelStr = "EntrenadorModel";
    public static String PersonalApoyoModelStr = "PersonalApoyoModel";
    public static String DelegacionModelStr = "DelegacionModel";
    public static String CompetenciaModelStr = "CompetenciaModel";
    public static String CompeticionModelStr = "CompeticionModel";
    private static FactoriaMundial INSTANCE = null;

    private FactoriaMundial() {
    }

    public static FactoriaMundial getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FactoriaMundial();
        }
        return INSTANCE;
    }

    public ObjectsInterface crearObjetos(String nombre) {
        
        if (CiclistaModelStr.equals(nombre)) {
            return CiclistaModel.getInstance();
        }
        if (EntrenadorModelStr.equals(nombre)) {
            return CiclistaModel.getInstance();
        }
        if (PersonalApoyoModelStr.equals(nombre)) {
            return CiclistaModel.getInstance();
        }
        if (DelegacionModelStr.equals(nombre)) {
            return CiclistaModel.getInstance();
        }
        if (CompetenciaModelStr.equals(nombre)) {
            return CiclistaModel.getInstance();
        }
        if (CompeticionModelStr.equals(nombre)) {
            return CiclistaModel.getInstance();
        }
        return null;

    }
}
