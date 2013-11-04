/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialciclismo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.ListIterator;

/**
 *
 * @author juan2ramos
 */
public class Competencias {

    private String nombre;
    private String lugar;
    private String fecha;
    private String hora;
    private ArrayList<ciclitasCompetencias> ciclistCompetencias = new ArrayList<ciclitasCompetencias>();

    public Competencias(String nombre, String lugar, String fecha, String hora, ArrayList<Ciclista> ciclistas) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
        this.generarCiclistCompetencias(ciclistas);
    }

    private void generarCiclistCompetencias(ArrayList ciclistas) {
        ListIterator<Ciclista> li = ciclistas.listIterator();

        while (li.hasNext()) {
            Ciclista ciclista = li.next();
            ciclistCompetencias.add(new ciclitasCompetencias(ciclista));

        }

    }

    public ArrayList<ciclitasCompetencias> getCiclistCompetencias() {
        Collections.sort(ciclistCompetencias,Collections.reverseOrder());
        for (ciclitasCompetencias temp : ciclistCompetencias) {
            System.out.println(temp);
        }
        return ciclistCompetencias;
    }

    public ArrayList<ciclitasCompetencias> getCompetidores() {
        return ciclistCompetencias;
    }

    public String getFenombrecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCompetidores(Ciclista ciclistas) {
    }

    public void setFenombrecha(String fenombrecha) {
        this.fecha = fenombrecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return getNombre(); //To change body of generated methods, choose Tools | Templates.
    }
}
