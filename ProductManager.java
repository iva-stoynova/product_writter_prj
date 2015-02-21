/*
 * ProductManager.java
 *
 * Created on Сряда, 2010, Ноември 24, 12:43
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package test1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 *
 * @author grade
 */
public class ProductManager{
    
    private Product[] product;
    private Product[] iWritable;
    
    public ProductManager(Product[] p){
        setProduct(p);
    }
    
    public ProductManager(){
        this(new Product[0]);
    }
    public void setProduct(Product[] p) {
        if(p!=null){
            product=new Product[p.length];
            for(int i=0;i<p.length;i++){
                product[i]=new Product(p[i]);
            }
        }else{
            product=new Product[0];
        }
    }
    public Product[] getProduct(){
        Product[] t=new Product[product.length];
        for(int i=0;i<product.length;i++){
            t[i]=new Product(product[i]);
        }
        return t;
    }
    
    public String toString() {
        StringBuilder input=new StringBuilder();
        for(int i=0;i<product.length;i++){
            input.append(product[i]+"");
            if((i+1)%5==0){
                input.append("\n");
            }
        }
        return input.toString();
    }
    
    private class Inner implements IWritable{
        public void writeProducts(File filename) throws IOException{
            ObjectOutputStream output;
            output= new ObjectOutputStream(new FileOutputStream(filename));
            output.writeObject(product);
            output.close();
        }
//Selection Sort:
        public Product[] sort() {
            Product[] p;
            p = new Product[product.length];
            
            for(int i=0;i<product.length;i++){
                p[i]=new Product(product[i]);
            }
            
             int max;
            for(int i=0;i<p.length;i++){
                max=i;
                for(int k=i+1;k<p.length-1;k++){
                    if(p[k].getInvNumber()>p[max].getInvNumber()){
                        max=k;
                    }
                   swap(p,max,k); }
         
             }
          
            return p;
     //Insertion Sort       
            //int insert;
            //Product moveItem;
            //for(int i=1;i<result.length;i++);
            //moveItem=result[i];
            //insert=i;
            //while(p[insert-1].getInvNumber()<moveItem.getInvNumber()&& insert>0){
            //p[insert]=p[insert-1];
            //insert--;
            //}
        }
 
        private void swap(Product[] arr,int a,int b){
            Product tmp=arr[a];
            arr[a]=arr[b];
            arr[b]=tmp;
        }
    }
       public IWritable getIWritable(){
        IWritable iw=new Inner();
        return iw;
        
    }
       
    
}
