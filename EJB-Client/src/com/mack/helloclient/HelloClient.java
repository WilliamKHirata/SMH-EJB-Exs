/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mack.helloclient;
import javax.naming.*;
import com.mack.meuPacote.SimpleBean; 
import java.util.Properties;
/**
 *
 * @author H_W
 */
public class HelloClient {
   public void runTest() throws Exception { 
      Properties props = new Properties();
      
      props.load(new java.io.FileInputStream("jndi.properties"));
      InitialContext ctx = new InitialContext(props);
      
      SimpleBean bean = (SimpleBean) ctx.lookup("ejb/Hello");
      String result = bean.sayHello("Bom dia!");
      System.out.println(result);
   }

   public static void main(String[] args) {
      try {
         HelloClient cli = new HelloClient();
         cli.runTest();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}