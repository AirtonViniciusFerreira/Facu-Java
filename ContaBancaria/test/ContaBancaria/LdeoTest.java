/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaBancaria;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a120104
 */
public class LdeoTest {
    
    public LdeoTest() {
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

    @Test
    public void testLdeo() {
        CcLde c1 = new CcLde(2,5);
        CcLde c2 = new CcLde(1,15);
        CcLde c3 = new CcLde(9,55);
        CcLde c4 = new CcLde(5,25);
        CcLde c5 = new CcLde(6,25);
        CcLde c6 = new CcLde(4,25);
        
        Ldeo lista = new Ldeo();
        Ldeo lista2 = new Ldeo();
        Ldeo lista3 ;
        
        lista.inserir(c1);
        lista.inserir(c2);
        lista.inserir(c3);
        lista.inserir(c4);
        lista.inserir(c5);
        lista.inserir(c6);
        
        System.out.println(  "\n\n" +lista.toString()+ "\n\n");
    }
    
}
