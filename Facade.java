/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Frederico
 */
public class Facade {
    
    private Scanner sc;
    
    private final List<AdicionaProdutoObserver> aquelequetudove = new ArrayList<>();
    
    public void AdicionaProdutoObserver(AdicionaProdutoObserver aquelequetudove) {
        this.aquelequetudove.add(aquelequetudove);
    }
    
    public Facade(){
        sc = new Scanner(System.in);
    }
    
     public void finalizaCompras() {
        FactoryPag pagamento = new FactoryPag();
        while(1 > 0) {
            System.out.println("Preco total: " + CarrinhodeCompras.getInstance(false).getTotalRecall());
            System.out.println("Escolha o metodo de pagamento:\1 - Cartão de crédito\2 - Cartão de débito\n3 - PayPal!");
            int opcaodepagamento = sc.nextInt();
            MetPag met = pagamento.escolheCartao(opcaodepagamento);
            if(met == null){
                System.out.println("Numero invalido!");
            }else{
                if(met.pago(CarrinhodeCompras.getInstance(false).getTotalRecall())){
                    System.out.println("Pedido Finalizado!");
                    CarrinhodeCompras.getInstance(true);
                    return;
                }else{
                    System.out.println("Erro no pagamento!");
                }
            }
        }
    }
    
    
    
    public void addnoCarrinho(){
        System.out.println("Insira o preco do produto:");
        int precoproduto = sc.nextInt();
        
        System.out.println("Insira o nome produto:");
        String nomeproduto = sc.nextLine();
         
        Produto produto = new Produto(precoproduto, nomeproduto);
         System.out.println(produto.toString());
        
        System.out.println("inserir no seu carrinho? tecle 0 para sim, 1 para não");
        if(sc.nextInt() == 0){
            EventoAdicionaProduto event = new EventoAdicionaProduto(produto);
            for (AdicionaProdutoObserver aquelequetudove : this.aquelequetudove){
                aquelequetudove.adicionaProduto(event);
            }
            
        }
    }




}
