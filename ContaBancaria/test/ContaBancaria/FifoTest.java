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
public class FifoTest {
    
    public FifoTest() {
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
    public void testFifo() {
       Fifo teste = new Fifo(10);
       CC c1 = new CC(5,0);
       CC c2 = new CC(3,10);
       CC c3 = new CC(9,20);
       CC c4 = new CC(4,0);
       CC c5 = new CC(1,10);
       CC c6 = new CC(6,20);
       

       
       teste.inserir(c1);
       System.out.println("conta: "+teste.toString()+ "\n\n");
       teste.inserir(c2);
       System.out.println("conta: "+teste.toString()+ "\n\n");
       teste.inserir(c3);
       System.out.println("conta: "+teste.toString()+ "\n\n");
       teste.inserir(c4);
       System.out.println("conta: "+teste.toString()+ "\n\n");
       teste.inserir(c5);
       System.out.println("conta: "+teste.toString()+ "\n\n");
       teste.inserir(c6);
       System.out.println("conta: "+teste.toString()+ "\n\n");
       System.out.println("conta: "+teste.toString()+ "\n\n");
       
       System.out.println(teste.remover() + "\n\n");
       System.out.println("conta: "+teste.toString()+ "\n\n");
    }
    
}
