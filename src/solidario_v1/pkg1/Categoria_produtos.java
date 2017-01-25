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
public class Categoria_produtos {
    private int id_categoria_produtos;
    private String nome_categoria_produtos;
    
    public Categoria_produtos(int id_categoria_produtos, String nome_categoria_produtos){
        this.id_categoria_produtos=id_categoria_produtos;
        this.nome_categoria_produtos=nome_categoria_produtos;
    }

    public int getId_categoria_produtos() {
        return id_categoria_produtos;
    }

    public void setId_categoria_produtos(int id_categoria_produtos) {
        this.id_categoria_produtos = id_categoria_produtos;
    }

    public String getNome_categoria_produtos() {
        return nome_categoria_produtos;
    }

    public void setNome_categoria_produtos(String nome_categoria_produtos) {
        this.nome_categoria_produtos = nome_categoria_produtos;
    }
    
    
}
