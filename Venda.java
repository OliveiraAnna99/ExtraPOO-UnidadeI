

public class Venda
{
    private String data;
    private Item[] itens;
    public Venda()
    {
 
    }
    public String getData(){
        return data;
    }
    public Item[] getItens(){
        return itens;
    }
    public void setData(String data){
        this.data = data;
    }
    public void setItens(Item[] itens){
        this.itens = itens;
    }
    
    public double total(){
        double soma = 0;
        for(Item i: itens){
            soma += i.total();
        }
        return soma;
    }

}
