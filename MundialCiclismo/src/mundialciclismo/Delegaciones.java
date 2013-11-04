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
public class Delegaciones {
    private String nombre;
    private String pais;
    private String continente;
    private ArrayList <Participantes> participantes = new ArrayList();

    public Delegaciones(String nombre, String pais, String continente) {
        this.nombre = nombre;
        this.pais = pais;
        this.continente = continente;
    }

    public String getContinente() {
        return continente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public ArrayList<Participantes> getParticipantes() {
        return participantes;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setParticipantes(ArrayList<Participantes> participantes) {
        this.participantes = participantes;
    }
    
    @Override
    public String toString() {
        return getNombre(); //To change body of generated methods, choose Tools | Templates.
    }
}
