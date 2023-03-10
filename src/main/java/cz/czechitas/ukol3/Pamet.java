package cz.czechitas.ukol3;

public class Pamet {

    private long kapacita;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public String toString(){
        System.out.println("'kapacita pameti je");
        return kapacita +" GB ";}
}
