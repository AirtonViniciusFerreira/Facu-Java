package controle;

import dao.ClienteDao;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Cliente;

/* @author a120104 */

@ManagedBean(name = "clienteControle")
@ViewScoped
public class ClienteControle implements Serializable{
    private Cliente cliente;
    private ClienteDao clientedao;
    
    public ClienteControle(){
        this.cliente = new Cliente();
        this.clientedao = new ClienteDao();
    }
    
    public String cancelar(){
        return "/index";
    }

    
    public void salvar(){
        FacesContext context = FacesContext.getCurrentInstance();
        if(this.clientedao.inserir(this.cliente)){
            context.addMessage(
                    null, new FacesMessage (FacesMessage.SEVERITY_INFO, "Usuario cadastrado com sucesso",null));
        }
        else{
            context.addMessage(
                    null, new FacesMessage (FacesMessage.SEVERITY_INFO, "Usuario cadastrado com erro",null));
        }
       this.cliente = new Cliente();
    }
    
    public void logar(){
        ClienteDao con = new ClienteDao();
        Cliente con2 = new Cliente();
        FacesContext context = FacesContext.getCurrentInstance();
        con2 = con.autenticar(cliente);
        if(this.cliente == con2){
            FacesContext.getCurrentInstance().addMessage(
                    null, new FacesMessage (FacesMessage.SEVERITY_INFO, "Usuario logado com sucesso",null));
        }
        else{
            FacesContext.getCurrentInstance().addMessage(
                    null, new FacesMessage (FacesMessage.SEVERITY_INFO, "Usuario logado com erro",null));
        }
    }
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ClienteDao getClientedao() {
        return clientedao;
    }

    public void setClientedao(ClienteDao clientedao) {
        this.clientedao = clientedao;
    }
}
