/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author jramosp1
 */
public class CuentaUsuario implements Cloneable{

    private String apellido;
    private String nombre;
    private String nombreUsuario;
    private String password;
    private ArrayList permisos;

    public CuentaUsuario() {
    }

    
    public CuentaUsuario(String apellido, String nombre, String nombreUsuario, String password, ArrayList permisos) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.permisos = permisos;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList getPermisos() {
        return permisos;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPermisos(ArrayList permisos) {
        this.permisos = permisos;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return nombre+permisos; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
