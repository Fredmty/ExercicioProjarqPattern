/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.LinkedList;
/**
 *
 * @author Frederico
 */
public class CarrinhodeCompras implements AdicionaProdutoObserver {
    private int Total;
    private static CarrinhodeCompras singletonCarrinho;
    private LinkedList<Produto> Caixa;
    
    private CarrinhodeCompras(){
        Caixa = new LinkedList<Produto>();
        Total = 0; //caixa vazio
    }
    
    
    public int getTotalRecall(){
        return Total;
    }
    
    public static CarrinhodeCompras getInstance(boolean e){ //Evento de singleton
        if(singletonCarrinho == null | e) {
            singletonCarrinho = new CarrinhodeCompras();
        }
        return singletonCarrinho;
    }
    
    
    @Override
    public void adicionaProduto(EventoAdicionaProduto event){
        Produto p = event.getProduto();
        Caixa.add(p);
        Total = Total + p.getPreco();
    }
    
    
    public String toString() {
        String stringao = "";
        for (Produto p : Caixa) {
            stringao = stringao + p.toString();
        }
        stringao =   "\nValor total: " + (stringao + getTotalRecall());
        return stringao;
    }
    
}
