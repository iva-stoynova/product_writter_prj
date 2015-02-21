/*
 * Product.java
 *
 * Created on Сряда, 2010, Ноември 24, 12:19
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package test1;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author grade
 */
public class Product implements Serializable{
    
 private final int invNumber;
 private String invDescription;
 private static int count=0;
 
 public Product(String invD){
     setInvDescription(invD);
     invNumber=++count;
 }

 public Product(){
     this("New Product");
 }
 public Product(Product p){
    this(p.invDescription);
 }
    public void setInvDescription(String invD) {
        if(invD!=null){
            invD=invDescription;
        }else{
            invDescription=" "; //System.err.println("Error");
        }
    }

    public String getInvDescription() {
        return invDescription;
    }
    public int getInvNumber(){
        return invNumber;
    }
    public String toString(){
      String str=String.format("%50d \n %s",invNumber,invDescription);
      return str;
    }
      
  }

