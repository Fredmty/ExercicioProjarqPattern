
import java.util.*;
/**
 *
 * @author Frederico
 */
public class Principal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Facade fachada = new Facade();
        fachada.AdicionaProdutoObserver(CarrinhodeCompras.getInstance(false)); //ato de notificar e criar o carrinho para as compras

        while (1 > 0) {
            System.out.println("0 - Finalizar compra");
            System.out.println("1 - Adicionar um produto no seu carrinho");
            System.out.println("2 - Encerrar a aplicação");
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
    
