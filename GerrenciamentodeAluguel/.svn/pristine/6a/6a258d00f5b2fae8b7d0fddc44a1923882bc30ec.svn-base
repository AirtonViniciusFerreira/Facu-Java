/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import modelo.Cliente;
import modelo.Contrato;

// @author a120104

public class ContratoControle {
    private Cliente cliente;
    private List<Contrato> contratos;
    
    public ContratoControle(){
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ectx = context.getExternalContext();
        cliente = (Cliente) ectx.getApplicationMap().get("curso") ;   //recupera o curso selecionado na pagina anterior.
        contratos = cliente.getContratos();
    }

    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public List<Contrato> getContratos() {
        return contratos;
    }


    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }

   
}
