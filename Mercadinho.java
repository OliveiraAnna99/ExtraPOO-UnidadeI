

public class Mercadinho
{
    private Venda[] vendas;
    
 
    public Mercadinho()
    {
      
    }
    public Venda[] getVendas(){
        return vendas;
    }
   
    public void setVendas(Venda[] vendas){
        this.vendas = vendas;
    }
    
    public double total(String data){
        double soma = 0;
        for(Venda v: vendas){
            if(v.getData().equals(data)){
                 soma += v.total();
            }
           
        }
        return soma;
    }
    
    public double total(){
        double soma = 0;
        for(Venda v: vendas){
            soma += v.total();
        }
        return soma;
    }
  
}
