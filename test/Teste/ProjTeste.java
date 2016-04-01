/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import DAO.ClienteDAO;
import Entity.Cliente;
import Exceptions.CamposBrancosException;
import Outros.Triangulo;
import Outros.Util;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wagner Chaves
 */
public class ProjTeste {

    @Test
    public void TesteValidacaoCPF() {
        assertTrue(Util.validacpf("413.235.468-71"));
    }
    
    @Test(expected = CamposBrancosException.class) 
    public void TesteCampoNomeBranco() throws CamposBrancosException{
        
        Cliente cli = new Cliente();
        
        cli.setNome("");   
    }
    
    @Test(expected = CamposBrancosException.class) 
    public void TesteCampoDataNascBranco() throws CamposBrancosException{
        
        Cliente cli = new Cliente();
        
        cli.setDataNascimento("  /  /    ");
    }
    
    @Test(expected = CamposBrancosException.class) 
    public void TesteCampoCPFBranco() throws CamposBrancosException{
        
        Cliente cli = new Cliente();
        
        cli.setCPF("   .   .   -  ");   
    }
    
    @Test(expected = CamposBrancosException.class) 
    public void TesteCampoTelefoneBranco() throws CamposBrancosException{
        
        Cliente cli = new Cliente();
        
        cli.setTelefone("(  )    -    ");
    }
    
    
    @Test
    public void TesteClienteCadastrado() throws CamposBrancosException{
        
        Cliente cli = new Cliente("Teste", "2010-05-01", "413.235.468-77", "", "(43)9167-1350", "", "", "", "", "", "");
        ClienteDAO cliDAO = new ClienteDAO();
        assertFalse(cliDAO.inserir(cli)); 
    }
    
    
    
    
//    @Test
//    public void TesteTriangulo() {
//        Triangulo tr = new Triangulo();
//        assertEquals(tr.ValidaTriangulo(1, 1, 1), 1);
//    }

    public ProjTeste() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
