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
public class DevivadaQuocienteTest {
    
    public DevivadaQuocienteTest() {
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
    public void testDevivadaQuociente() {
        DerivadaQuociente f = new DerivadaQuociente();
        f.getfOriginal().setFuncao("2x^3+25x^2-x-5/2x^4+x-5");
        f.dividir();
        System.out.println(f.getFx().getSeparado().toString());
        System.out.println(f.getfLinhax().getSeparado().toString());
        System.out.println(f.getGx().getSeparado().toString());
        System.out.println(f.getgLinhax().getSeparado().toString());
        f.juntar();
    }
    
}
