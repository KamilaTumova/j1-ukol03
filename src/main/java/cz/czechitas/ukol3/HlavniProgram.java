package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");


        Pocitac mujPocitac;
        mujPocitac = new Pocitac();
        //  System.out.println(mujPocitac.toString());
        // mujPocitac.zapniSe();      // Vypise chybu, protoze pocitac nema vsechny povinne soucasti

        Disk mujDisk = new Disk();
        mujDisk.setKapacita(245_000_000_000L);
        mujDisk.setVyuziteMisto(93_000_000_000L);

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacita(8_000_000_000L);

        Procesor mujProcesor = new Procesor();
        mujProcesor.setRychlost(3_400_000_000_000L);
        mujProcesor.setVyrobce("TSMC");


        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setRam(mojePamet);
        mujPocitac.setPevnyDisk(mujDisk);


        // System.out.println(mujDisk.toString());
        // System.out.println(mojePamet.toString());
        // System.out.println(mujProcesor.toString());
        // System.out.println(mujPocitac.toString());


        mujPocitac.zapniSe();
        // mujPocitac.zapniSe();      // Vypise chybu, protoze pocitac uz bezi
        mujPocitac.vytvorSouborOVelikosti(212_756_341L);
        // mujPocitac.smazSouborOVelikosti(956_501_432L);
        System.out.println(mujPocitac.toString());
        // mujPocitac.vypniSe();

        // mujPocitac.vypniSe();      // Nevypise chybu, ale nic neprovede,
        //  mujPocitac.vypniSe();      // protoze pocitac je uz vypnuty


    }

}
