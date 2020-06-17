
/**
 *
 * @author Frederico
 */
public class FactoryPag { //auto explicativo 
    public MetPag escolheCartao(int escolha) {
        switch(escolha){
            case 1:
                return new CarCred();
            
            case 2:
                return new CarDeb();
                
            case 3:
                return new PagPay(); 
        }
        return null;
    }
}
