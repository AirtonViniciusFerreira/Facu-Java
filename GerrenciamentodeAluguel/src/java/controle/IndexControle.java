package controle;

// @author a120104

import dao.AdmDao;
import dao.ClienteDao;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Adm;
import modelo.Cliente;

@ManagedBean (name="indexControle")
@ViewScoped
public class IndexControle implements Serializable{
    private Cliente usuario;
    private Adm adm;
    
    public IndexControle(){
        usuario = new Cliente();
        adm = new Adm();
    }

    public String autenticar() {
        ClienteDao ud = new ClienteDao();
        Cliente temp;
        temp = ud.autenticar(usuario);
        if (temp == null) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário ou senha inválidos", null));
            return null;  //fica na página
        }
        return "cliente/clienteMenu";    // vai para o menu
    }

    public String autenticarAdm() {
        AdmDao ud = new AdmDao();
        Adm temp;
        temp = ud.autenticar(adm);
        if (temp == null) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário ou senha inválidos", null));
            return null;  //fica na página
        }
        return "adm/admMenu";    // vai para o menu
    }

    public Cliente getUsuario() {
        return usuario;
    }

    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }

    public Adm getAdm() {
        return adm;
    }

    public void setAdm(Adm adm) {
        this.adm = adm;
    }
}
