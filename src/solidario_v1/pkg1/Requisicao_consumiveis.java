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
public class Requisicao_consumiveis extends Requisicao {
    private Armazem armazem;
    private HashMap <Produto,Float> produtos_requisitados=new HashMap <>();
    private Departamento departamento_destino;  
    
    
    public Requisicao_consumiveis(int id_requisicao, Departamento departamento_requisitante, Funcionario requisitante, String data_requisicao, Armazem armazem, HashMap <Produto,Float> produtos_requisitados, Departamento departamento_destino){
        super(id_requisicao, requisitante, data_requisicao);
        this.armazem=armazem;
        this.produtos_requisitados=produtos_requisitados;
        this.departamento_destino=departamento_destino;
}

    public Armazem getArmazem() {
        return armazem;
    }

    public void setArmazem(Armazem armazem) {
        this.armazem = armazem;
    }

    public HashMap <Produto,Float> getProdutos_requisitados() {
        return produtos_requisitados;
    }

    public void setProdutos_requisitados(HashMap <Produto,Float> produtos_requisitados) {
        this.produtos_requisitados = produtos_requisitados;
    }

    public Departamento getDepartamento_destino() {
        return departamento_destino;
    }

    public void setDepartamento_destino(Departamento departamento_destino) {
        this.departamento_destino = departamento_destino;
    }


}
