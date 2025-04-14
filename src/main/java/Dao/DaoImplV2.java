package Dao;
import org.springframework.stereotype.Component;
@Component("daoV2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service");
        double temp = 10;
        return temp;
    }
}
