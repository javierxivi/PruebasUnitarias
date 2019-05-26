/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.de.desarrollar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Javier
 */
public class VendedoresTest {
    
    public VendedoresTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Anaydir_Vendedor method, of class Vendedores.
     */
    @Test
    public void testAnaydir_Vendedor() {
        System.out.println("Anaydir_Vendedor");
        Vendedor v = null;
        Vendedores instance = new Vendedores();
        Vendedor vendedor = new Vendedor(1,"Pepe","Pepsi","Alicante","Elche","Espronceda10");
        boolean expResult = false;
        boolean result = instance.Anaydir_Vendedor(vendedor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

  
   

    /**
     * Test of buscar_vendedor method, of class Vendedores.
     */
    @Test
    public void testBuscar_vendedor_int() {
        System.out.println("buscar_vendedor");
        int nv = 0;
        Vendedores instance = new Vendedores();
        Vendedor expResult = null;
        Vendedor result = instance.buscar_vendedor(nv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

   
    
}
