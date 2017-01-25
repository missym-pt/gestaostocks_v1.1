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
public class Requisicao {
    
    private int id_requisicao;
    private Funcionario requisitante;
    private String data_requisicao;
    
    public Requisicao (int id_requisicao, Funcionario requisitante, String data_requisicao ){
        this.id_requisicao=id_requisicao;
        this.requisitante=requisitante;
        this.data_requisicao=data_requisicao;}

    public int getId_requisicao() {
        return id_requisicao;
    }

    public void setId_requisicao(int id_requisicao) {
        this.id_requisicao = id_requisicao;
    }

    public Funcionario getRequisitante() {
        return requisitante;
    }

    public void setRequisitante(Funcionario requisitante) {
        this.requisitante = requisitante;
    }

    public String getData_requisicao() {
        return data_requisicao;
    }

    public void setData_requisicao(String data_requisicao) {
        this.data_requisicao = data_requisicao;
    }
    
    
    }
    

