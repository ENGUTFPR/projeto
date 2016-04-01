/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Wagner Chaves
 */
public class CamposBrancosException extends Exception {
    String Mensagem;
    
    public CamposBrancosException() {
         
    }
    
    public CamposBrancosException(String msg) {
        //super(msg);
        Mensagem = msg;
    }

    @Override
    public String toString() {
        return Mensagem;
    }    
    

}
