package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import modelo.Cliente;
import util.JpaUtil;

/* @author a12010 */
public class ClienteDao implements Serializable{
    
    private final EntityManager em;
    
    public ClienteDao(){
        this.em = JpaUtil.getEntityManager();
    }
    
    public ClienteDao(EntityManager em){
        this.em = em;
    }
    
    public Cliente autenticar(Cliente u){
        Cliente temp = null; // administrador retornado na consulta ao banco
        EntityManager manager = JpaUtil.getEntityManager();
        TypedQuery<Cliente> query = manager.createQuery("SELECT u FROM Cliente u WHERE u.nomeUsuario = :nomeDeUsuario AND u.senha = :senha",
                Cliente.class); 
        query.setParameter("nomeDeUsuario", u.getNomeUsuario());
        query.setParameter("senha", u.getSenha());
        try{
            temp = query.getSingleResult(); 
        }
        catch(Exception e){ }     //aqui poderia haver um tratamento de exceção mais decente
        finally{
            manager.close();
        }        
        return temp;
    }
    
    public boolean alterar(Cliente cliente) {
        EntityManager manager = JpaUtil.getEntityManager();
        manager.getTransaction().begin();
        manager.merge(cliente);
        manager.getTransaction().commit();
        manager.close();
        return true;
    }
    
    public Cliente buscarPorCodigo(int cod) {
        EntityManager manager = JpaUtil.getEntityManager();
        Cliente curso = manager.find(Cliente.class, cod);
        manager.close();
        return curso;
    }
    
    public boolean excluir(Cliente adm) {
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Cliente temp = manager.find(Cliente.class, adm.getCodigo());
        manager.remove(temp);
        tx.commit();
        manager.close();
        return true;
    }
    
    public boolean inserir(Cliente cliente) {
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(cliente);
        tx.commit();
        manager.close();
        return true;
    }
    
    public List<Cliente> listarTodos() {
        EntityManager manager = JpaUtil.getEntityManager();
        CriteriaQuery<Cliente> query = manager.getCriteriaBuilder().createQuery(Cliente.class);
        query.select(query.from(Cliente.class));
        List<Cliente> lista = manager.createQuery(query).getResultList();
        manager.close();
        return lista;
    }
    
    @SuppressWarnings("unchercked")
    public ArrayList<Cliente> lista(){
        return (ArrayList<Cliente>) em.createQuery("select p fron Cliente p ").getResultList();
    }
    
    @SuppressWarnings("unchercked")
    public Cliente listaT(Cliente cliente){
        return (Cliente) em.createQuery("select * from Usuario p WHERE p.usuario='" + cliente.getNomeUsuario()+"' and p.senha='" + cliente.getSenha()+"'");
    }
    
    public boolean verificarLogin(Cliente cliente){
        System.out.println("select * from Usuario p WHERE p.usuario='" + cliente.getNomeUsuario()+"' and p.senha='" + cliente.getSenha()+"'");
        Cliente aux = listaT(cliente);
        if(aux != null){
            return true;
        }
        return false;
    }
}
