/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.de.desarrollar;

/**
 *
 * @author Javier
 */
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Javier
 */
@RunWith(Parameterized.class)
public class ParamBuscar {
    Vendedores vend = new Vendedores();
    static Vendedores vendprueba = new Vendedores();
    String provincia;
    
    
    public void SetUP(){
        Vendedor v = new Vendedor(1,"Pepe","Pepsi","Barcelona","Barcelona","Espronceda10");
        vendprueba.Anaydir_Vendedor(v);
        Vendedor v2 = new Vendedor(2,"Maria","Pikolinos","Alicante","Elche","Espronceda10");
        vendprueba.Anaydir_Vendedor(v2);
        Vendedor v3 = new Vendedor(3,"Antonio","Mercadona","Alicante","Santa Pola","Espronceda10");
        vendprueba.Anaydir_Vendedor(v3);
    }
   
    
    
    public ParamBuscar(String provincia, Vendedores vendprueba){
        this.provincia = provincia;
        this.vend = vendprueba;
    }
    @Parameterized.Parameters
    public static Iterable data(){
        return Arrays.asList(new Object[][]{{"Barcelona",vendprueba}});
    }
    
    @Test
    public void fill(){
       vendprueba = vend.buscar_vendedor(provincia);
        Assert.assertEquals(vend, vendprueba);
    }
    
}