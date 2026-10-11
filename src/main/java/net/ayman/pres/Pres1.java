package net.ayman.pres;

import net.ayman.dao.DaoImpl;
import net.ayman.ext.DaoImplV2;
import net.ayman.metier.MetierImpl;


public class Pres1 {
    static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d); // Injection des dépendances via le setter
        System.out.println("RES= "+metier.calcul());
    }
}
