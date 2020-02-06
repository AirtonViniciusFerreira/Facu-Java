/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

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
public class MachinesControllerTest {
    
    public MachinesControllerTest() {
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
    public void testMachine() {
        MachinesController m = new MachinesController();
        m.getMachine().setRibbon1("a+b/c*d");
        m.format();
        System.out.println(m.getMachine().getRibbon1() + "\n" + m.getMachine().getRibbon2());
    }
    
}
