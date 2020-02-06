
package util;

import dao.ContratoDao;
import java.lang.annotation.Annotation;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.persistence.Converter;
import modelo.Contrato;



// @author a120104

@FacesConverter(value="contratoConverter", forClass = modelo.Contrato.class)
public class ContratoConverter implements Converter{
    
   // @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        String nome;
        Contrato temp = null;
        ContratoDao dao = new ContratoDao();
        try {
            nome = value;
            temp = dao.buscarPorNome(nome);
	} catch (Exception e) {
            throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro","Selecione um curso"));
	}
 	return temp;
    }

   // @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object obj) {
        if(obj instanceof Contrato){
            Contrato c = (Contrato) obj;
            return c.getCliente().getNome();
        }
        return "";
    }

    @Override
    public boolean autoApply() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
