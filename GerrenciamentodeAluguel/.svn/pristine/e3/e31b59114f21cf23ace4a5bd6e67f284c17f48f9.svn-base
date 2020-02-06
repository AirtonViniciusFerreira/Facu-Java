package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaQuery;
import modelo.Persistencia;
import util.JpaUtil;

//  @author a120104

public class Dao<T extends Persistencia> {
    private Class<T> classe;
    EntityManager manager;
    
    public Dao(Class<T> classe){
        this.classe = classe;
    }
    
    public boolean alterar(T objeto) {
        manager = JpaUtil.getEntityManager();
        manager.getTransaction().begin();
        manager.merge(objeto);
        manager.getTransaction().commit();
        manager.close();
        return true;
    }
    
    /**
     * Busca no banco de dados o objeto.
     * @param codigo - o código do objeto
     * @return o objeto com os dados do banco ou null se não existir objeto com o código passado.
     */
    public T buscar(Object codigo){
        T objeto;
        manager = JpaUtil.getEntityManager();
        objeto = manager.find(classe, codigo);
        manager.close();
        return objeto;
    }
    
    public boolean excluir(Persistencia objeto) {
        manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        T temp = manager.find(classe, objeto.getCodigo());
        manager.remove(temp);
        tx.commit();
        manager.close();
        return true;
    }
       
    public boolean inserir(T objeto) {         
        manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(objeto);
        tx.commit();
        manager.close();
        return true;
    }
    
    public List<T> listar(){
        manager = JpaUtil.getEntityManager();
        CriteriaQuery<T> query = manager.getCriteriaBuilder().createQuery(classe);
        query.select(query.from(classe));
        List<T> lista = manager.createQuery(query).getResultList();
        manager.close();
        return lista;
    }
}
