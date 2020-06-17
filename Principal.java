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
public class Principal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Facade fachada = new Facade();
        fachada.AdicionaProdutoObserver(CarrinhodeCompras.getInstance(false));

        while (1 > 0) {
            System.out.println("0 - Finalizar compra\n 1 - Adicionar um produto no seu carrinho\n 2 - Encerrar a aplicação");
            System.out.println(CarrinhodeCompras.getInstance(false).toString());

            int in = sc.nextInt();
            switch (in) {
                case 0:
                    fachada.finalizaCompras();
                    break;
                case 1:
                    fachada.addnoCarrinho();
                    break;
                case 2:
                    System.out.println("Terminando sua compra, adeus!");
                    return;
                default:
                    System.out.println("Numero invalido, digite novamente!");
                    break;
            }
        }
    }
    }
    
