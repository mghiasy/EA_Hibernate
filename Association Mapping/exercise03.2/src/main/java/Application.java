import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;


public class Application {
    private static SessionFactory sessionFactory;
//    static {
//        // This step will read hibernate.cfg.xml and prepare hibernate for use
//        Configuration configuration = new Configuration();
//        configuration.configure("hibernate.cfg.xml");
//        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//        sessionFactory= configuration.buildSessionFactory(sr);
//    }

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory= configuration.buildSessionFactory(sr);
    }

}
