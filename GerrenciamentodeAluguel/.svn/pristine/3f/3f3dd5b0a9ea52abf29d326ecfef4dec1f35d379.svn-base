package modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author a120104
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable, Persistencia{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo")
    private Integer codigo;
    
    @Column(length = 50,name = "nomeDeUsuario")
    private String nomeUsuario;
    
    @Column(length = 50,name = "senha")
    private String senha;
    
    @Column(length = 50,name = "nome")
    private String nome;
    
    @Column(length = 50,name = "numeroDeCelular")
    private String celular;
    
    @Column(length = 50,name = "numeroDeTelefone")
    private String telefone;
    
    @Column(length = 14,name = "cpf")
    private String cpf;
    
    @Column(length = 9,name = "data")
    private String data;
    
    @Column(length = 50,name = "email")
    private String email;
    
    // Um curso tem várias disciplinas
    // curso é o atributo da classe Disciplina
    // FetchType.EAGER serve para trazer todas as disciplinas do curso quando consultar um curso
    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)  
    private List<Contrato> contratos; 

    public Cliente(){
        this.codigo = 0;
        this.nomeUsuario = "";
        this.senha = "";
        this.nome = "";
        this.celular = "";
        this.telefone = "";
        this.cpf = "";
        this.data = "";
        this.email = "";
        
    }
    
   @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.codigo);
        hash = 97 * hash + Objects.hashCode(this.nomeUsuario);
        hash = 97 * hash + Objects.hashCode(this.senha);
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.celular);
        hash = 97 * hash + Objects.hashCode(this.telefone);
        hash = 97 * hash + Objects.hashCode(this.cpf);
        hash = 97 * hash + Objects.hashCode(this.data);
        hash = 97 * hash + Objects.hashCode(this.email);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nomeUsuario, other.nomeUsuario)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) { // BIRLLLLLLLLL
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
     
    
    
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }
    
    
}
