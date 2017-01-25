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
public class Armazem {
    
    private int id_armazem;
    private String nome_armazem;
    private Localizacao local;
    private Funcionario responsavel_de_armazem;
    private Estado estado;
    private String data_estado_armazem;
    
    public Armazem(int id_armazem,String nome_armazem, Localizacao local, Funcionario responsavel_de_armazem, Estado estado, String data_estado_armazem){
        this.id_armazem=id_armazem;
        this.nome_armazem=nome_armazem;
        this.local=local;
        this.responsavel_de_armazem=responsavel_de_armazem;
        this.estado=estado;
        this.data_estado_armazem=data_estado_armazem;
    }

    public int getId_armazem() {
        return id_armazem;
    }

    public void setId_armazem(int id_armazem) {
        this.id_armazem = id_armazem;
    }

    public String getNome_armazem() {
        return nome_armazem;
    }

    public void setNome_armazem(String nome_armazem) {
        this.nome_armazem = nome_armazem;
    }

    public Localizacao getLocal() {
        return local;
    }

    public void setLocal(Localizacao local) {
        this.local = local;
    }

    public Funcionario getResponsavel_de_armazem() {
        return responsavel_de_armazem;
    }

    public void setResponsavel_de_armazem(Funcionario responsavel_de_armazem) {
        this.responsavel_de_armazem = responsavel_de_armazem;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getData_estado_armazem() {
        return data_estado_armazem;
    }

    public void setData_estado_armazem(String data_estado_armazem) {
        this.data_estado_armazem = data_estado_armazem;
    }
    
    
}
