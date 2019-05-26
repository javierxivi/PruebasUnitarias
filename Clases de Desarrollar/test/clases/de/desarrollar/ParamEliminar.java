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
public class ParamEliminar {
    Vendedores vend = new Vendedores();
    
    @Parameterized.Parameters
    public static Iterable data(){
        return Arrays.asList(new Object[][]{{1, true}, {2, true}, {3, true}, {4, false}});
    }
    public void SetUP(){
        Vendedor v = new Vendedor(1,"Pepe","Pepsi","Barcelona","Barcelona","Espronceda10");
        vend.Anaydir_Vendedor(v);
        Vendedor v2 = new Vendedor(2,"Maria","Pikolinos","Alicante","Elche","Espronceda10");
        vend.Anaydir_Vendedor(v2);
        Vendedor v3 = new Vendedor(3,"Antonio","Mercadona","Alicante","Santa Pola","Espronceda10");
        vend.Anaydir_Vendedor(v3);
    }
    
    public int metido;
    public boolean resEsperado;
    
    public ParamEliminar(int metido, boolean resEsperado){
        this.metido = metido;
        this.resEsperado = resEsperado;
    }
    @Test
    public void fill(){
        boolean result = vend.eliminar_vendedor(metido);
        Assert.assertEquals(result, resEsperado);
    }
    
}
