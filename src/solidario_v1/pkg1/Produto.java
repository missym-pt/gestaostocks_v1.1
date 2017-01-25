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
public class Produto {
    
    private int id_produto;
    private String nome_produto;
    private Categoria_produtos categoria_produto;
    private float stock_produto;
    private Estado estado_produto;
    private int barcode;
    
    public Produto(int id_produto, String nome_produto, Categoria_produtos categoria_produto, float stock_produto, Estado estado_produto, int barcode ){
        this.id_produto=id_produto;
        this.nome_produto=nome_produto;
        this.categoria_produto=categoria_produto;
        this.stock_produto=stock_produto;
        this.estado_produto=estado_produto;
        this.barcode=barcode;
        
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public Categoria_produtos getCategoria_produto() {
        return categoria_produto;
    }

    public void setCategoria_produto(Categoria_produtos categoria_produto) {
        this.categoria_produto = categoria_produto;
    }

    public float getStock_produto() {
        return stock_produto;
    }

    public void setStock_produto(float stock_produto) {
        this.stock_produto = stock_produto;
    }

    public Estado getEstado_produto() {
        return estado_produto;
    }

    public void setEstado_produto(Estado estado_produto) {
        this.estado_produto = estado_produto;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }


    
    
}
