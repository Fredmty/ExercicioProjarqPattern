/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frederico
 */
public class Produto {
    private int preco;
    private String nome;
    
    public Produto(int preco, String nome){
        this.nome = nome;
        this.preco = preco;
    }
    
    public int getPreco() {
        return preco;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String toString () {
        return "\n O seu produto é" + getNome() + "\n e seu preço é de" + getPreco();
    }
}
