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
public class ListaTest {
    
    public ListaTest() {
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
    public void testLista() {
        long tempoInicio = System.currentTimeMillis();
        CC c1 = new CC(9,5);
        CC c2 = new CC(1,15);
        CC c3 = new CC(8,55);
        CC c4 = new CC(5,25);
        CC c5 = new CC(68,25);
        CC c6 = new CC(4,25);
        
        Lista list = new Lista(200);
        
       /* list.inserir(c1);
        list.inserir(c2);
        list.inserir(c3);
        list.inserir(c4);
        list.inserir(c5);
        list.inserir(c6);*/
        
        list.gerar();
        list.bubbleSort();
        System.out.println(list.toString());
        System.out.println("Tempo total: " + (System.currentTimeMillis()-tempoInicio));
        
    }
    
}
