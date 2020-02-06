
package util;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author a120104
 */
public class JpaUtil implements Serializable{
    private static final EntityManagerFactory factory;
    
    static {
        factory = Persistence.createEntityManagerFactory("GerrenciamentoDeAluguelPU");
    }
    
    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
    
    public static void close() {
        factory.close();
    }
}
