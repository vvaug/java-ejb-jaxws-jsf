/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.shopping.business;

/**
 *
 * @author Victor Augusto
 */
public class FaultInfo {
    
    private String codErr;
    private String descErr;
    
    public FaultInfo(String codErr, String descErr){
        this.codErr = codErr;
        this.descErr = descErr;
    }
    
    public FaultInfo(){
        
    }

    public String getCodErr() {
        return codErr;
    }

    public void setCodErr(String codErr) {
        this.codErr = codErr;
    }

    public String getDescErr() {
        return descErr;
    }

    public void setDescErr(String descErr) {
        this.descErr = descErr;
    }
    
    
}
