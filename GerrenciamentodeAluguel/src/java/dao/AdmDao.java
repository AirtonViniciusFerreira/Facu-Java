package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import modelo.Adm;
import util.JpaUtil;

// @author a120104


public class AdmDao {
    
    /**
     * Neste projeto o login do usuário é seu e-mail
     * @param adm - objeto Adm com email e senha, pelo menos.
     * @return objeto com os dados do banco ou null, se email ou senha estiverem incorretos.
     */
    public Adm autenticar(Adm adm){
        Adm temp = null; // administrador retornado na consulta ao banco
        EntityManager manager = JpaUtil.getEntityManager();
        TypedQuery<Adm> query = manager.createQuery("SELECT a FROM Adm a WHERE a.nome = :nome AND a.senha = :senha",
                Adm.class); 
        query.setParameter("nome", adm.getNome());
        query.setParameter("senha", adm.getSenha());
        try{
            temp = query.getSingleResult(); 
        }
        catch(Exception e){ }     //aqui poderia haver um tratamento de exceção mais decente
        finally{
            manager.close();
        }        
        return temp;
    }
    
    public boolean inserir(Adm adm) {
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(adm);
        tx.commit();
        manager.close();
        return true;
    }
}
