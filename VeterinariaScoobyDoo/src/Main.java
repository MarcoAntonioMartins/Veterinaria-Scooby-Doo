
import util.HibernateUtil;

public class Main {

    public static void main(String args[]) {
        HibernateUtil h = new HibernateUtil();
        h.getSessionFactory().openSession();
    }
}
