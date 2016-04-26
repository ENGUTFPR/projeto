/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Exceptions.CamposBrancosException;

/**
 *
 * @author Wagner Chaves
 */
public class Produto {
    private String Codigo; //Usado apenas na consulta
    private String Nome;
    private String Marca;
    private float Preco;
    private Integer Quantidade;
    private Integer Garantia;
    
    public Produto(String cod, String nome, String marca, float preco, Integer qtd, Integer garantia) throws CamposBrancosException{
        this.setCodigo(cod);
        this.setNome(nome);
        this.setMarca(marca);
        this.setPreco(preco);
        this.setQuantidade(qtd);
        this.setGarantia(garantia);
    }
    
    public Produto(){
        
    }

    /**
     * @return the Codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(String Codigo) throws CamposBrancosException {        
        if (Codigo.equals("")){
            throw new CamposBrancosException("Campo Código vazio");
        }
        else{
            this.Codigo = Codigo;
        }

    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) throws CamposBrancosException {        
        if (Nome.equals("")){
            throw new CamposBrancosException("Campo Nome vazio");
        }
        else{
            this.Nome = Nome;
        }
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) throws CamposBrancosException {
        this.Marca = Marca;
        
        if (Marca.equals("")){
            throw new CamposBrancosException("Campo Marca vazio");
        }
        else{
            this.Marca = Marca;
        }
    }

    /**
     * @return the Preco
     */
    public float getPreco() {
        return Preco;
    }

    /**
     * @param Preco the Preco to set
     */
    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

    /**
     * @return the Quantidade
     */
    public Integer getQuantidade() {
        return Quantidade;
    }

    /**
     * @param Quantidade the Quantidade to set
     */
    public void setQuantidade(Integer Quantidade) {
        this.Quantidade = Quantidade;
    }

    /**
     * @return the Garantia
     */
    public Integer getGarantia() {
        return Garantia;
    }

    /**
     * @param Garantia the Garantia to set
     */
    public void setGarantia(Integer Garantia) {
        this.Garantia = Garantia;
    }
}
