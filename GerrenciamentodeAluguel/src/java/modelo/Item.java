package modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/* @author a120104 */

@Entity
@Table(name = "Deposito")
public class Item implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo")
    private Integer codigo;
    
    @Column(length = 100,name = "Nome")
    private String nome;
    
    @Column(name = "Preço")
    private double preco;
    
    @Column(name = "Quantidade")
    private double quant;
    
    // MUITAS disciplinas para UM curso
    /*@ManyToOne
    // coluna que guarda o código do curso
    @JoinColumn(name="contrato")  */ 
    private Contrato contrato;
    
    public Item(){
        this.codigo = 0;
        this.nome = "";
        this.preco = 0;
        this.quant = 0;
        this.contrato = new Contrato();//O o homi ali
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.codigo);
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.quant) ^ (Double.doubleToLongBits(this.quant) >>> 32));
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
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quant) != Double.doubleToLongBits(other.quant)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuant() {
        return quant;
    }

    public void setQuant(double quant) {
        this.quant = quant;
    }

    /**
     * @return the contrato
     */
    public Contrato getContrato() {
        return contrato;
    }

    /**
     * @param contrato the contrato to set
     */
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    
    
}
