/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mack.meuPacote;

/**
 *
 * @author H_W
 */
@javax.ejb.Remote 
    public interface SimpleBean { 
   public String sayHello(String name); 
}