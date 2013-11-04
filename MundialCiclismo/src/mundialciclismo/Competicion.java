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
public class Competicion {
    private String pais;
    private String fechaInicio;
    private String fechaFin;
    private ArrayList <Delegaciones> delegaciones = new ArrayList();

    public Competicion(String pais, String fechaInicio, String fechaFin) {
        this.pais = pais;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public ArrayList<Delegaciones> getDelegaciones() {
        return delegaciones;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getPais() {
        return pais;
    }

    public void setDelegaciones(ArrayList delegaciones) {
        this.delegaciones = delegaciones;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    @Override
    public String toString() {
        return getPais(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
