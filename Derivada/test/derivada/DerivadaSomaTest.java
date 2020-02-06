/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derivada;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VINICIUS
 */
public class DerivadaSomaTest {
    
    public DerivadaSomaTest() {
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
    public void testDerivadaSoma() {
        DerivadaSoma f = new DerivadaSoma();
        f.getFx().setFuncao("2x^3+x^2-x-5");
        f.derivar();
        System.out.println(f.getFx().getSeparado().toString());
        System.out.println(f.getfLinhax().getSeparado().toString());
        System.out.println(f.getfLinhax().juntar());
        

        
    }
    
}
