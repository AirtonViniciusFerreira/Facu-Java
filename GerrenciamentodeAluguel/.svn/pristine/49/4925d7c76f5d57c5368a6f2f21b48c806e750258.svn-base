/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Adm;
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
public class AdmDaoTest {
    
    public AdmDaoTest() {
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
    public void testAdmDao() {
       Adm adm = new Adm();
       adm.setNome("admin");
       adm.setEmail("airton.vi.fe@gmail.com");
       adm.setSenha("admin");
       AdmDao dao = new AdmDao();
       dao.inserir(adm);
    }
    
}
