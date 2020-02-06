/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaQuery;
import modelo.Item;
import util.JpaUtil;

/**
 *
 * @author a120104
 */
public class ItemDao {
    
    public boolean alterar(Item item) {
        EntityManager manager = JpaUtil.getEntityManager();
        manager.getTransaction().begin();
        manager.merge(item);
        manager.getTransaction().commit();
        manager.close();
        return true;
    }
    
    public Item buscarPorCodigo(int cod) {
        EntityManager manager = JpaUtil.getEntityManager();
        Item curso = manager.find(Item.class, cod);
        manager.close();
        return curso;
    }
    
    public boolean excluir(Item adm) {
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Item temp = manager.find(Item.class, adm.getCodigo());
        manager.remove(temp);
        tx.commit();
        manager.close();
        return true;
    }
     
    public boolean inserir(Item deposito) {
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(deposito);
        tx.commit();
        manager.close();
        return true;
    }
     
    public List<Item> listaTodos(){
        EntityManager manager = JpaUtil.getEntityManager();
        CriteriaQuery<Item> query = manager.getCriteriaBuilder().createQuery(Item.class);
        query.select(query.from(Item.class));
        List<Item> lista = manager.createQuery(query).getResultList();
        manager.close();
        return lista;
    }
}
