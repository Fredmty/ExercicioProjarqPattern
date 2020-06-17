/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frederico
 */
public class FactoryPag {
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
