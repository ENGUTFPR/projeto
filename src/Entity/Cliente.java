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
public class Cliente {
    private int Codigo; //Usado apenas na consulta
    private String Nome;
    private String DataNascimento;
    private String CPF;
    private String RG;
    private String Telefone;
    private String Endereco;
    private String Bairro;
    private String Cidade;
    private String CEP;
    private String Estado;
    private String Observacoes;
    
    public Cliente(String nome, String dtaNasc, String cpf, String rg, String tel, String endereco, String bairro, String cidade, String cep, String estado, String obs) throws CamposBrancosException{
        this.setNome(nome);
        this.setTelefone(tel);
        this.setCPF(cpf);
        this.setDataNascimento(dtaNasc);
        this.setRG(rg);
        this.setEndereco(endereco);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setCEP(cep);
        this.setEstado(estado);
        this.setObservacoes(obs);
    }
    public Cliente(){
        
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) throws CamposBrancosException{
        if (nome.equals("")){
            throw new CamposBrancosException("Campo Nome vazio");
        }
        else{
            this.Nome = nome;
        }
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String dtaNasc) throws CamposBrancosException {
        if (dtaNasc.equals("  /  /    ")){
            throw new CamposBrancosException("Campo Data de Nascimento vazio");
        }
        else{
           this.DataNascimento = dtaNasc;

        }
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cpf) throws CamposBrancosException {
        if (cpf.equals("   .   .   -  ")){
            throw new CamposBrancosException("Campo CPF vazio");
        }
        else{
            this.CPF = cpf;
        }
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rg) {
        this.RG = rg;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String tel) throws CamposBrancosException {
         if (tel.equals("(  )    -    ")){
            throw new CamposBrancosException("Campo Telefone vazio");
        }
        else{
            this.Telefone = tel;
        }
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        this.Endereco = endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        this.Bairro = bairro;
    }    
    
    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        this.Cidade = cidade;
    }    
    
    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cep) {
        this.CEP = cep;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }    
    
    public String getObservacoes() {
        return Observacoes;
    }

    public void setObservacoes(String obs) {
        this.Observacoes = obs;
    }    

}
