/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frederico
 */
public class EventoAdicionaProduto {
    
    private final Produto produto;
    
    public EventoAdicionaProduto(Produto produto){
        super();
        this.produto = produto;
    }
    
    public Produto getProduto(){
        return produto;
    }


    
    
}
