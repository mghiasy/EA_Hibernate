import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Application {
    private static SessionFactory sessionFactory;

    static {
        // This step will read hibernate.cfg.xml and prepare hibernate for use
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(sr);
    }

    public static void main(String[] args) {
        Session session = null;
        Transaction tx = null;

        try {
            session = sessionFactory.openSession();
            tx = session.beginTransaction();

            Employee emp = new Employee("Maryam", "Ghiasvand");
            session.persist(emp);
            Laptop laptop = new Laptop("Del", "11", emp);
            Laptop laptop1 = new Laptop("Mac", "22", emp);
            session.persist(laptop);
            session.persist(laptop1);

            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                System.err.println("Rolling back: " + e.getMessage());
                tx.rollback();
            }
        } finally {
            if (session != null) {
                session.close();

            }
        }
    }
}
