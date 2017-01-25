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
public class Localizacao {
    
    private int id_localizacao;
    private String morada_localizacao;
    private Estado estado;
    private String data_estado;

public Localizacao(int id_localizacao, String morada_localizacao, Estado estado, String data){
    this.id_localizacao=id_localizacao;
    this.morada_localizacao=morada_localizacao;
    this. estado=estado;
    this.data_estado=data_estado;
}   

    public int getId_localizacao() {
        return id_localizacao;
    }

    public void setId_localizacao(int id_localizacao) {
        this.id_localizacao = id_localizacao;
    }

    public String getMorada_localizacao() {
        return morada_localizacao;
    }

    public void setMorada_localizacao(String morada_localizacao) {
        this.morada_localizacao = morada_localizacao;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getData_estado() {
        return data_estado;
    }

    public void setData(String data) {
        this.data_estado = data_estado;
    }



}
