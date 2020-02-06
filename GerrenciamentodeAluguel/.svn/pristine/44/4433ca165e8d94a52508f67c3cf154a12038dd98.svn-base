package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// @author a120104
@Entity
@Table(name = "contrato")
public class Contrato implements Serializable, Persistencia{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;
    
    
    // Um curso tem várias disciplinas
    // curso é o atributo da classe Disciplina
    // FetchType.EAGER serve para trazer todas as disciplinas do curso quando consultar um curso
    //@OneToMany(mappedBy = "contrato", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)  
    private List<Item> itens; 
    
    // MUITAS disciplinas para UM curso
    @ManyToOne
    // coluna que guarda o código do curso
    @JoinColumn(name="cliente")   
    private Cliente cliente;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.codigo);
        hash = 83 * hash + Objects.hashCode(this.itens);
        hash = 83 * hash + Objects.hashCode(this.cliente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contrato other = (Contrato) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.itens, other.itens)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        return true;
    }
    
    public Contrato (){
        this.codigo = 0;
        this.cliente = new Cliente();
     
    }
    
    @Override
    public Integer getCodigo() {
        return codigo;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
