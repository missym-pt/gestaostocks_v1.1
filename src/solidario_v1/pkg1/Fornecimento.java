/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidario;

/**
 *
 * @author Missy M
 */
public class Fornecimento {
    private int id_fornecimento;
    private Entidade_fornecedora fornecedor;
    private String data_fornecimento;
    
    public Fornecimento(int id_fornecimento, Entidade_fornecedora fornecedor, String data_fornecimento){
        this.id_fornecimento=id_fornecimento;
        this.fornecedor=fornecedor;
        this.data_fornecimento=data_fornecimento;
        
    }

    public int getId_fornecimento() {
        return id_fornecimento;
    }

    public void setId_fornecimento(int id_fornecimento) {
        this.id_fornecimento = id_fornecimento;
    }

    public Entidade_fornecedora getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Entidade_fornecedora fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getData_fornecimento() {
        return data_fornecimento;
    }

    public void setData_fornecimento(String data_fornecimento) {
        this.data_fornecimento = data_fornecimento;
    }
    
    
}
