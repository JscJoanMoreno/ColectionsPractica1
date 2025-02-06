package Vaixells;

import java.util.*;

public class PortPesquer {
    private ArrayList<Vaixell> vaixells = new ArrayList<>();

    public PortPesquer() {
        vaixells = new ArrayList<>();
    }

    Scanner sc = new Scanner(System.in);

    public void addVaixell(Vaixell vaixell) {
        vaixells.add(vaixell);
    }

    public Vaixell findVaixell(String intentNom){
        Vaixell foundVaixell = null;
            for (Vaixell v : vaixells) {
            if (intentNom.equals(v.getName())) {
                foundVaixell = v;
            }
        }
            return foundVaixell;

    }

}




