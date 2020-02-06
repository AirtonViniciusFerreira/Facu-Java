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
public class CcLdeTest {
    
    public CcLdeTest() {
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
    public void testCcLde() {
        long tempoInicio = System.currentTimeMillis();
        CcLde c1 = new CcLde(2,5);
        CcLde c2 = new CcLde(1,15);
        CcLde c3 = new CcLde(8,55);
        CcLde c4 = new CcLde(4,25);
        CcLde c5 = new CcLde(9,25);
        CcLde c6 = new CcLde(6,25);
        
        Lde lista = new Lde();
        Lde lista2 = new Lde();
        Lde lista3 ;
        
        lista.inserir(c1);
        lista.inserir(c2);
        lista.inserir(c3);
        lista.inserir(c4);
        lista.inserir(c5);
        lista.inserir(c6);
        
        /*System.out.println(lista.toString());*/
        
       /* CcLde re = lista.remover(3);*/
       
      /*  System.out.println(  "\n\n" +lista.toString()+ "\n\n");
        System.out.println(  "\n\n" +lista2.toString()+ "\n\n");*/
       lista.bubbleSort();
        System.out.println(  "\n\n" +lista.toString() + "\n\n");
        System.out.println("Tempo total: " + (System.currentTimeMillis()-tempoInicio));
        
        
        
    }
    
}
