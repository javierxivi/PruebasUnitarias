/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.de.desarrollar;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Objects;

/**
 *
 * @author Javier
 */
public class Vendedores {
    private  Hashtable<Integer,Vendedor> tb = new Hashtable<Integer,Vendedor>();
    
    public Vendedores (){
        
    }
    public boolean Anaydir_Vendedor(Vendedor v){
        boolean metido = false;
        if(tb.containsKey(v.getnumvend())){
              tb.put(v.getnumvend(),v);
              metido = true;
        }
        return metido;
        
    }
     public boolean eliminar_vendedor (int nv){
         Vendedor v = tb.get(nv);
         if(tb.containsKey(nv)){     
            tb.remove(nv);
         
            return true;
         }
        return false;
    }
     public Vendedor buscar_vendedor(int nv){
         if(tb.containsKey(nv)){
             return tb.get(nv);
         }
         return null;
        
    }
    public Vendedores buscar_vendedor(String prov){
        Vendedores vend = new Vendedores();
        Enumeration e = total();
        while(e.hasMoreElements()) {
            Vendedor v = (Vendedor) e.nextElement();
            if(v.getprovincia()== prov){
                vend.Anaydir_Vendedor(v);
            }
        }
        return vend;
        
    }

    
    
    public void Cargar_Datos(String provincia){
        
        Vendedor v = new Vendedor(1,"Pepe","Pepsi","Barcelona","Barcelona","Espronceda10");
        Anaydir_Vendedor(v);
        Vendedor v2 = new Vendedor(2,"Maria","Pikolinos","Alicante","Elche","Espronceda10");
        Anaydir_Vendedor(v2);
        Vendedor v3 = new Vendedor(3,"Antonio","Mercadona","Alicante","Santa Pola","Espronceda10");
        Anaydir_Vendedor(v3);
    }
    public Enumeration<Integer> total(){
        Enumeration<Integer> claves=tb.keys();
        return claves;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if (o == null){
            return false;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        final Vendedores other = (Vendedores) o;
        if(!Objects.equals(this.tb, other.tb)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return  41 * hash + Objects.hashCode(tb);
        
         //To change body of generated methods, choose Tools | Templates.
    }
    

   
    
    
    
    
}
