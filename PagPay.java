
import java.util.Scanner;
/**
 *
 * @author Frederico
 */
public class PagPay implements MetPag{
    @Override
    public boolean pago(int valor) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o seu login");
        String login = sc.nextLine();
        
        System.out.println("Insira a sua senha");
        String validadecartao = sc.nextLine();
        
        System.out.println("Tá chique hein, cuidado com o golpe");
        
        System.out.println("Seu pagamento foi efetuado, yay");
        return true;
    }
}
