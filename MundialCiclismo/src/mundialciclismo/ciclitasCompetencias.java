/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialciclismo;

/**
 *
 * @author juan2ramos
 */
public class ciclitasCompetencias implements Comparable<ciclitasCompetencias>{

    private Ciclista ciclista;
    private int minutos;
    private int segundos;
    private int tiempoTotal;

    public ciclitasCompetencias(Ciclista ciclista)  {
        this.ciclista = ciclista;
        this.minutos = random(60 , 100);
        this.segundos = random(0, 59);
        this.tiempoTotal = (this.minutos*100) + this.segundos;
    }

    private int random(int init, int end) {
        int i = (int) (Math.random() * (end - init + 1) + init);
        return i;
    }

    public Ciclista getCiclista() {
        return ciclista;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
    

    public int getTiempo() {
        return minutos;
    }

    public void setCiclista(Ciclista ciclista) {
        this.ciclista = ciclista;
    }

    public void setTiempo(int minutos) {
        this.minutos = minutos;
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }
    

    @Override
    public int compareTo(ciclitasCompetencias t) {
         
    
        int compareQuantity = ((ciclitasCompetencias) t).getTiempoTotal(); 
       return this.tiempoTotal - compareQuantity;
     
    }
      @Override
    public  String toString(){
        return   Integer.toString(getTiempoTotal());
    }
}
