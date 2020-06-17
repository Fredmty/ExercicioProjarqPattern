
/**
 *
 * @author Frederico
 */
public class Produto {
    private int preco;
    private String nome;
    
    public Produto(int preco, String nome){
        this.preco = preco;
        this.nome = nome;
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
