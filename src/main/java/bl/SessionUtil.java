package bl;

import lombok.Getter;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Getter
public class SessionUtil {

    private Session session;
    private Transaction transaction;

    public Session openSession(){
        return HibernateUtil.getSessionFactory().openSession();
    }

    public void closeSession(){
        session.close();
    }

    public Session openTransactionSession(){
        session = openSession();
        transaction = session.beginTransaction();
        return session;
    }

    public void closeTransactionSession(){
        transaction.commit();
        closeSession();
    }
}
