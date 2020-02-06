package controle;

import dao.ItemDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Cliente;
import modelo.Item;

/**
 *
 * @author a120104
 */
@ManagedBean(name = "itemControle")
@ViewScoped
public class ItemControle implements Serializable{
    private Item item;
    private ItemDao itemDao;
    private List<Item> listaItem;
    
    public ItemControle(){
        this.item = new Item();
        this.itemDao = new ItemDao();
        this.listaItem = this.itemDao.listaTodos();
    }
    
    public void salvar(){
        FacesContext context = FacesContext.getCurrentInstance();
        if(this.itemDao.inserir(this.item)){
            context.addMessage(
                    null, new FacesMessage (FacesMessage.SEVERITY_INFO, "Usuario cadastrado com sucesso",null));
        }
        else{
            context.addMessage(
                    null, new FacesMessage (FacesMessage.SEVERITY_INFO, "Usuario cadastrado com erro",null));
        }
        this.item = new Item();
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }
    
}
