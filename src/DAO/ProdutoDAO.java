/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Produto;
import Outros.DataSetPadrao;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan Ferreira
 */
public class ProdutoDAO {
    private Connection con;
    private String user;
    private String url;
    private String password; 
    
    public ProdutoDAO(){
        url = "jdbc:mysql://localhost/db_loja";
        user = "root";
        password = "admin";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean inserir(Produto p) {
                boolean Result = true;
        String sqlprod = "INSERT INTO tb_produto (COD_PROD, NOME_PROD, MARCA_PROD, PRECO_PROD, QTD_PROD, GARANTIA_PROD) VALUES('" +  p.getCodigo() + "', '" + p.getNome() + "','" + p.getMarca() + "','" + p.getPreco()+ "','" + p.getQuantidade() + "','" + p.getGarantia() + "');";
        try {
            Statement st = con.createStatement();
            st.executeUpdate(sqlprod);
        } catch (MySQLIntegrityConstraintViolationException a){ 
           Result = false;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Result;
    }
    
    public DataSetPadrao pesquisar(int opcao, String filtro) {
        String cmp;
        String sql;
        String bS, eS;
        switch (opcao) {
            case 0:cmp = "COD_PROD LIKE ";bS = "'%";eS = "%'";break;
            case 1:cmp = "NOME_PROD LIKE ";bS = "'%";eS = "%'";break;
            case 2:cmp = "MARCA_PROD LIKE ";bS = "'%";eS = "%'";break;
            default:cmp = bS = eS = "*";break;//flag de erro
        }
        sql = "SELECT COD_PROD AS \"Código\",NOME_PROD AS \"Nome\",MARCA_PROD AS \"Marca\",PRECO_PROD AS \"Preço\",QTD_PROD AS \"Quantidade\",GARANTIA_PROD AS \"Garantia\" FROM tb_produto where " + cmp + bS + filtro + eS + ";";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            DataSetPadrao pds = new DataSetPadrao();
            int i;
            for(i=1;i<=rs.getMetaData().getColumnCount();i++){
                pds.addColumnName(rs.getMetaData().getColumnName(i));
            }
            while(rs.next()){
                Vector<Object> vector = new Vector<Object>();
                for(i=1;i<=rs.getMetaData().getColumnCount();i++){
                    vector.add(rs.getObject(i));
                }
                pds.addData(vector);
            }
            return pds;

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
    
    public void editar(Produto p)
    {
        String sqlprod = "UPDATE tb_produto set NOME_PROD = '"+ p.getNome()+ "', MARCA_PROD='" + p.getMarca() + "', PRECO_PROD = '" + p.getPreco() + "', QTD_PROD = '" + p.getQuantidade() + "', GARANTIA_PROD = '" + p.getGarantia() + "' where COD_PROD LIKE '" + p.getCodigo() + "';";
        Statement st;
        try {
            st = con.createStatement();
            st.executeUpdate(sqlprod);
            JOptionPane.showMessageDialog(null, "Produto " + p.getNome() + " atualizado");
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletar(String codigo)
    {
        String sqlprod = "DELETE FROM tb_produto where COD_PROD LIKE '" + codigo+"'; ";
        Statement st;
        try {
            st = con.createStatement();
            st.executeUpdate(sqlprod);
            JOptionPane.showMessageDialog(null, "Produto "+codigo+" excluído");
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

}
