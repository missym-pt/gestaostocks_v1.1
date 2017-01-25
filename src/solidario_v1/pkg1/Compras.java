/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidario;

import java.util.HashMap;

/**
 *
 * @author Missy M
 */
public class Compras extends Fornecimento {
    private Requisicao requisicao;
    private HashMap <Produto,Float> produtos_fornecidos=new HashMap <>();
    private Armazem armazem_destino;
    
    public Compras(int id_fornecimento, Entidade_fornecedora fornecedor, String data_fornecimento, Requisicao requisicao, HashMap <Produto,Float> produtos_fornecidos, Armazem armazem_destino){
        super(id_fornecimento, fornecedor, data_fornecimento);
        this.requisicao=requisicao;
        this.produtos_fornecidos=produtos_fornecidos;
        this.armazem_destino=armazem_destino;
    }

    public Requisicao getRequisicao() {
        return requisicao;
    }

    public void setRequisicao(Requisicao requisicao) {
        this.requisicao = requisicao;
    }

    public HashMap <Produto,Float> getProdutos_fornecidos() {
        return produtos_fornecidos;
    }

    public void setProdutos_fornecidos(HashMap <Produto,Float> produtos_fornecidos) {
        this.produtos_fornecidos = produtos_fornecidos;
    }

    public Armazem getArmazem_destino() {
        return armazem_destino;
    }

    public void setArmazem_destino(Armazem armazem_destino) {
        this.armazem_destino = armazem_destino;
    }
    
    
}
