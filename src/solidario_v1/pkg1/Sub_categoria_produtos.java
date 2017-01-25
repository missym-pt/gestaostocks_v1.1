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
public class Sub_categoria_produtos extends Categoria_produtos {
    
    private int id_sub_categoria_produto;
    private String nome_subcategoria_produto;
    
    public Sub_categoria_produtos(int id_categoria_produtos, String nome_categoria_produtos, int id_sub_categoria_produto, String nome_subcategoria_produto ){
        super(id_categoria_produtos, nome_categoria_produtos);
        this.id_sub_categoria_produto=id_sub_categoria_produto;
        this.nome_subcategoria_produto=nome_subcategoria_produto;
    }

    public int getId_sub_categoria_produto() {
        return id_sub_categoria_produto;
    }

    public void setId_sub_categoria_produto(int id_sub_categoria_produto) {
        this.id_sub_categoria_produto = id_sub_categoria_produto;
    }

    public String getNome_subcategoria_produto() {
        return nome_subcategoria_produto;
    }

    public void setNome_subcategoria_produto(String nome_subcategoria_produto) {
        this.nome_subcategoria_produto = nome_subcategoria_produto;
    }
    
    
}
