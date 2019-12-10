/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.shopping.business;

import br.com.shopping.dao.ItemDAO;
import br.com.shopping.entities.Item;
import br.com.shopping.exceptions.ItemException;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Victor Augusto
 */
@Stateless()
public class ItemBusiness {

    @Inject
    ItemDAO dao;
    
    FaultInfo faultInfo = new FaultInfo();
    
    public ItemBusiness(){
        
    }
    
    public Item insertItem(Item item){
        
        return dao.inserir(item);
    }
    
    public List<Item> getCart(){
        return dao.getAllItems();
    }
    
    public String deleteItem(String cod) throws ItemException {
        Integer rows = dao.deleteItem(cod);
        
        if ( rows == 0 ){
           
            faultInfo.setCodErr("90");
            faultInfo.setDescErr("Item não existe com o codigo informado!");
            throw new ItemException(faultInfo);
        }
        
        return "Foram deletados " + rows.toString() + " registros.";
    }
}

