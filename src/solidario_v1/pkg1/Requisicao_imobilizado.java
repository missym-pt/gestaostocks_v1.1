/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidario_v1.pkg1;

/**
 *
 * @author Missy M
 */
public class Requisicao_imobilizado extends Requisicao{
    private Item_imobilizado material;
    private String hora_inicio; //string hora????
    private int duracao; //int duracao para fazer calculo de quando a entrega é devida????
    private Localizacao local;
    private String sala;
    
    public Requisicao_imobilizado(int id_requisicao, Funcionario requisitante, String data_requisicao, Item_imobilizado material, String hora_inicio, int tempo, Localizacao local, String sala){
        super(id_requisicao, requisitante, data_requisicao);
        this.material=material;
        this.hora_inicio=hora_inicio;
        this.duracao=duracao;
        this.local=local;
        this.sala=sala;        
    }

    public Item_imobilizado getMaterial() {
        return material;
    }

    public void setMaterial(Item_imobilizado material) {
        this.material = material;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Localizacao getLocal() {
        return local;
    }

    public void setLocal(Localizacao local) {
        this.local = local;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    
}
