

public class Item
{
    private int quantidade;
    private Produto produto;
    public Item()
    {
         this.produto = produto;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public Produto getProduto(){
        return produto;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
    public double total(){
        return produto.getPreco() * quantidade;
    }
   
}
