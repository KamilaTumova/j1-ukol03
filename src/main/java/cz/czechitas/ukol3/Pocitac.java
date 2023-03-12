package cz.czechitas.ukol3;

import java.util.Objects;

public class Pocitac {

    private boolean jeZapnuty;

    private Procesor cpu;

    private Pamet ram;

    private Disk pevnyDisk;

    public String toString() {
        return
                "jeZapnuty=" + jeZapnuty +
                        ", " + cpu + ram + pevnyDisk;
    }


    public boolean isJeZapnuty() {

        return this.jeZapnuty;


    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {

        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {

        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {

        this.pevnyDisk = pevnyDisk;
    }


    public void zapniSe() {

        if (ram == null || cpu == null || pevnyDisk == null) {
            System.err.println("Pocitac nema vsechny povinne soucasti.");
            return;
        }
        if (jeZapnuty) {

            System.err.println("Pocitac je uz zapnuty.");
        } else {
            jeZapnuty = true;
            System.out.println("Pocitac se zapnul.");

        }

    }

    public void vypniSe() {
        if (jeZapnuty) {
            System.out.println("Pocitac se vypnul.");
        } else {
            System.err.println("Pocitac je uz vypnuty.");
        }
    }


    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            this.pevnyDisk.setVyuziteMisto(this.pevnyDisk.getVyuziteMisto() + velikost);
            if (pevnyDisk.getVyuziteMisto() > pevnyDisk.getKapacita()) {
                System.err.println("Malo mista na disku.");
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);


            }
        }
    }

    public void smazSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            this.pevnyDisk.setVyuziteMisto(this.pevnyDisk.getVyuziteMisto() - velikost);
            if (pevnyDisk.getVyuziteMisto() < 0) {
                pevnyDisk.setVyuziteMisto(0);
            }
        }
    }


}
