/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.ArrayList;

/**
 *
 * @author jramosp1
 */
public class CuentaPrototypeFactory {
    private CuentaUsuario cuentaRep;
    private CuentaUsuario supervisor;

    public CuentaPrototypeFactory() {
        cuentaRep =  new CuentaUsuario();
        ArrayList<String> permisosRep = new ArrayList();
        permisosRep.add("lectura");
        cuentaRep.setPermisos(permisosRep);
        
        supervisor =  new CuentaUsuario();
        ArrayList<String> permisosSupervisor = new ArrayList();
        permisosSupervisor.add("lectura");
        permisosSupervisor.add("escritura");
        supervisor.setPermisos(permisosSupervisor);
    }
    
    

    public CuentaPrototypeFactory(CuentaUsuario cuentaRep, CuentaUsuario supervisor) {
        this.cuentaRep = cuentaRep;
        this.supervisor = supervisor;
    }
    public CuentaUsuario tipoCuenta(String tipo) throws CloneNotSupportedException{
        
        if(tipo.equals("supervisor")){
            return (CuentaUsuario) supervisor.clone();
        }else{
            return (CuentaUsuario) cuentaRep.clone();
        }
    }
    
}
