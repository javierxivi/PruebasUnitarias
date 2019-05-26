/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fueltank;

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
public class ParamConsume {
    FuelTank tank = new FuelTank(60, 50);
    
    @Parameterized.Parameters
    public static Iterable data(){
        return Arrays.asList(new Object[][]{{10, 20}, {15, 35}, {20, 30}, {35, 45}});
    }
    
    public int metido;
    public int resEsperado;
    
    public ParamConsume(int metido, int resEsperado){
        this.metido = metido;
        this.resEsperado = resEsperado;
    }
    @Test
    public void fill(){
        tank.consume(metido);
        double nivelTanque = tank.getTankLevel();
        Assert.assertEquals(resEsperado, nivelTanque, 0.0);
    }
    
}
