/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.shoppingclient.beans;

import br.com.shoppingclient.services.Item;
import br.com.shoppingclient.services.ItemException;
import br.com.shoppingclient.services.ShoppingWS;
import br.com.shoppingclient.services.ShoppingWS_Service;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Victor Augusto
 */
@ManagedBean
public class ItemMB {
    
    public ShoppingWS service = new ShoppingWS_Service().getShoppingWSPort();
    
    public List<Item> getItem(){
        List<Item> itens = new ArrayList<Item>();
        itens = service.getCart();
        return itens;
    }
    
    public void delete (String codItem) throws ItemException{
        service.deleteItem(codItem);
    }
    
    public void addItem (Item item){
        service.newItem(item);
    }
}
