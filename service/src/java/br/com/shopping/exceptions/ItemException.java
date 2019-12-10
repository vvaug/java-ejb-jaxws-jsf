package br.com.shopping.exceptions;

import br.com.shopping.business.FaultInfo;
import javax.xml.ws.WebFault;

/**
 *
 * @author Victor Augusto
 */
@WebFault(name = "itemException" )
public class ItemException extends Exception {
    
    private FaultInfo faultInfo;

    public ItemException(){
        
    }
    
    public ItemException(FaultInfo faultInfo) {
        this.faultInfo = faultInfo;
    }

    public ItemException(String message) {
        super(message);
    }
    
    public FaultInfo getFaultInfo(){
        return faultInfo;
    }
    
}
