
import java.util.Scanner;

/**
 *
 * @author Frederico
 */
public class CarCred implements MetPag{
    @Override
    public boolean pago(int valor) {


        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o número do cartão de crédito");
        String numerocartao = sc.nextLine();
        
        System.out.println("Insira a data de validade do cartão");
        String validadecartao = sc.nextLine();
        
        System.out.println("Digite o código de verificação do seu cartão");
        String cvv = sc.nextLine();
        
        System.out.println("Seu pagamento foi efetuado, nos vemos mês que vem!");
        return true;
    }
}
