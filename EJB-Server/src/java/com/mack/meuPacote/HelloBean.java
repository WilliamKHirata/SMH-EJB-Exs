/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mack.meuPacote;

import javax.ejb.Stateless;

/**
 *
 * @author H_W
 */
@Stateless (mappedName="ejb/Hello") 
public class HelloBean implements SimpleBean { 
   @Override 
   public String sayHello(String name) { 
      return "Hello " + name + "!"; 
   } 
}