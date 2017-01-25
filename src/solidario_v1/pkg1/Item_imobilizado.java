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
public class Item_imobilizado extends Produto {
    
    private Sub_categoria_produtos tipo_item;
    private int qr_code;
    private Localizacao local;
    private String sala;
    
  
    public Item_imobilizado(int id_produto, String nome_produto, Categoria_produtos categoria_produto, float stock_produto, Estado estado_produto, int barcode, Sub_categoria_produtos tipo_item, int qr_code, Localizacao local, String sala){
            super(id_produto, nome_produto, categoria_produto, stock_produto, estado_produto, barcode);
            this.tipo_item=tipo_item;
            this.qr_code=qr_code;
            this.local=local;
            this.sala=sala;
}

    public Sub_categoria_produtos getTipo_item() {
        return tipo_item;
    }

    public void setTipo_item(Sub_categoria_produtos id_subcategoria_produto) {
        this.tipo_item = tipo_item;
    }

    public int getQr_code() {
        return qr_code;
    }

    public void setQr_code(int qr_code) {
        this.qr_code = qr_code;
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
