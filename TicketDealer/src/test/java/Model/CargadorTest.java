/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Resources.Compra;
import Vistas.ViewObserver;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Scoles
 */
public class CargadorTest {
    private static Cargador cargador;
    public CargadorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() throws SQLException 
    {
        cargador=new Cargador();
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of validarAdmin method, of class Cargador.
     */
    @Test
    public void testValidarAdminA1() throws Exception 
    {
        System.out.println("validarAdmin");
        String usua = "pepito";
        String pass = "1234";
        Cargador cargador = new Cargador();
        assertEquals(true, cargador.validarAdmin(usua, pass));
        //fail("The test case is a prototype.");
    }
    
    public void testValidarAdminA2() throws Exception 
    {
        System.out.println("validarAdmin");
        String usua = "Stefano";
        String pass = "stef";
        Cargador cargador = new Cargador();
        assertEquals(false, cargador.validarAdmin(usua, pass));
        
    }
    
    public void testValidarAdminF1() throws Exception 
    {
        System.out.println("validarAdmin");
        String usua = "pepito";
        String pass = "123456";
        Cargador cargador = new Cargador();
        assertEquals(false, cargador.validarAdmin(usua, pass));
        //fail("The test case is a prototype.");
    }
    
    public void testValidarEmpleadoA1() throws Exception 
    {
        System.out.println("validarEmpleado");
        String usua = "pepaaaito";
        String pass = "123aaa4";
        Cargador cargador = new Cargador();
        assertEquals(false, cargador.validarEmpleado(usua, pass));
        //fail("The test case is a prototype.");
    }
    
    public void testValidarEmpleadoF1() throws Exception 
    {
        System.out.println("validarEmpleado");
        String usua = "Stefano";
        String pass = "stef";
        Cargador cargador = new Cargador();
        assertEquals(false, cargador.validarEmpleado(usua, pass));
        //fail("The test case is a prototype.");
    }
    
    
    
}
