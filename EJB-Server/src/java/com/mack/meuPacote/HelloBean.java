/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mack.meuPacote;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.Stateless;

/**
 *
 * @author H_W
 */
@Stateless(mappedName = "ejb/Hello")
public class HelloBean implements SimpleBean {
    /*
     * Implementacao antiga - retornava só 'Hello' antes do nome e '!' depois do nome tudo concatenado em uma string
     @Override 
     public String sayHello(String name) { 
     return "Hello " + name + "!"; 
     } 
     * 
     * Implementacao nova - Retorna dia/mes/ano hora:min:seg do servidor em uma unica string
     */
    @Override
    public String sayHello(String name) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date).toString();
    }
}