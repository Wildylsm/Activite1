package Pres;

import Dao.DaoImpl;
import Metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        //DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
