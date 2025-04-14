package Pres;

import Dao.IDao;
import Metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresV2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));

            String daoClassname = scanner.nextLine();
            Class cDao = Class.forName(daoClassname);
            IDao dao =(IDao) cDao.getConstructor().newInstance();

            String metierClassname = scanner.nextLine();
            Class cMetier = Class.forName(metierClassname);
            //IMetier metier =(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
            IMetier metier =(IMetier) cMetier.getConstructor().newInstance();
            Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
            setDao.invoke(metier, dao);

            System.out.println(metier.calcul());
        } catch (Exception e) {
            System.out.println("e.getMessage()");
        }
    }
}

