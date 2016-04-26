/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import DAO.ProdutoDAO;
import Entity.Produto;
import Exceptions.CamposBrancosException;
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
public class TesteProdutos {

    @Test(expected = CamposBrancosException.class)
    public void TesteCampoCodigoBranco() throws CamposBrancosException {

        Produto prod = new Produto();

        prod.setCodigo("");
    }

    @Test(expected = CamposBrancosException.class)
    public void TesteCampoNomeBranco() throws CamposBrancosException {

        Produto prod = new Produto();

        prod.setNome("");
    }
    
    
    @Test(expected = CamposBrancosException.class)
    public void TesteCampoMarcaBranco() throws CamposBrancosException {

        Produto prod = new Produto();

        prod.setMarca("");
    }
    
    @Test
    public void TesteProdutoCadastrado() throws CamposBrancosException {

        Produto prod = new Produto("10098", "TESTE1", "TESTE2", 0, 0, 0);
        ProdutoDAO prodDAO = new ProdutoDAO();
        assertFalse(prodDAO.inserir(prod));
    }
    
    @Test
    public void TesteCadastrarProduto() throws CamposBrancosException {

        Produto prod = new Produto("10101", "TESTE3", "TESTE4", 0, 0, 0);
        ProdutoDAO prodDAO = new ProdutoDAO();
        assertTrue(prodDAO.inserir(prod));
    }
    

    
    
    public TesteProdutos() {
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
