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

            Customer cust = new Customer("Maryam", "Ghiasvand");
            session.persist(cust);
            Order order = new Order(ConvertToDate(2016,11,10),cust);
            session.persist(order);
            Order order1 = new Order(ConvertToDate(2019,11,10),cust);
            session.persist(order1);
            Product DVD = new DVD("DVD1","DescDVD","Genrer1");
            Product CD = new CD("CD1","DescCD","Artist1");
            Product Book = new Book("DVD1","Desc1","title1");
            session.persist(DVD);
            session.persist(CD);
            session.persist(Book);
            OrderLine orderLineDVD= new OrderLine(10,DVD);
            OrderLine orderLineDVD1= new OrderLine(20,DVD);
            OrderLine orderLineCD= new OrderLine(10,CD);
            OrderLine orderLineCD1= new OrderLine(20,CD);
            OrderLine orderLineBook= new OrderLine(10,Book);
            OrderLine orderLineBook1= new OrderLine(20,Book);
            session.persist(orderLineDVD);
            session.persist(orderLineDVD1);
            session.persist(orderLineCD);
            session.persist(orderLineCD1);
            session.persist(orderLineBook);
            session.persist(orderLineBook1);

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
    public static Date ConvertToDate(int year, int month, int day){
        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate localDate = LocalDate.of(year,month,day);
        //local date + atStartOfDay() + default time zone + toInstant() = Date
        Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        return  date;
    }
}
