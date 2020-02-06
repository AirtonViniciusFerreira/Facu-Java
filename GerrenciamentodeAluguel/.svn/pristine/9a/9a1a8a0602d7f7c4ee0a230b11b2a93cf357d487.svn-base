package dao;

// @author a120104

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import modelo.Contrato;
import util.JpaUtil;

public class ContratoDao implements Serializable{
    private final EntityManager em;
    
    public ContratoDao(){
        this.em = JpaUtil.getEntityManager();
    }
    
    public ContratoDao(EntityManager em){
        this.em = em;
    }
    
    public boolean alterar(Contrato contrato) {
        EntityManager manager = JpaUtil.getEntityManager();
        manager.getTransaction().begin();
        manager.merge(contrato);
        manager.getTransaction().commit();
        manager.close();
        return true;
    }
    
    public Contrato buscarPorCodigo(int cod) {
        EntityManager manager = JpaUtil.getEntityManager();
        Contrato contrato = manager.find(Contrato.class, cod);
        manager.close();
        return contrato;
    }
    
     public Contrato buscarPorNome(String nome){
        Contrato retorno = null;
        EntityManager manager = JpaUtil.getEntityManager();
        TypedQuery<Contrato> query = 
                manager.createQuery("SELECT c FROM Curso c WHERE c.nome = :nome", Contrato.class); 
        query.setParameter("nome", nome);
        retorno = query.getSingleResult();
        manager.close();
        return retorno;
    }
    
    public boolean excluir(Contrato adm) {
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Contrato temp = manager.find(Contrato.class, adm.getCodigo());
        manager.remove(temp);
        tx.commit();
        manager.close();
        return true;
    }
    
    public boolean inserir(Contrato contrato) {
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(contrato);
        tx.commit();
        manager.close();
        return true;
    }
    
    public List<Contrato> listarTodos() {
        EntityManager manager = JpaUtil.getEntityManager();
        CriteriaQuery<Contrato> query = manager.getCriteriaBuilder().createQuery(Contrato.class);
        query.select(query.from(Contrato.class));
        List<Contrato> lista = manager.createQuery(query).getResultList();
        manager.close();
        return lista;
    }
    
}
