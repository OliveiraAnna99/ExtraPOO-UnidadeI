
public class Rede_de_Mercados
{
    private String nome;
    private Mercadinho[] mercadinhos;
    
    public Rede_de_Mercados(String nome)
    {
       this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;    
    }
    public Mercadinho[] getMercadinhos(){
        return mercadinhos;
    }
    public void setMercadinhos(Mercadinho[] mercadinhos){
        this.mercadinhos = mercadinhos;
    }
    
    
    public double total(String data){
        double soma = 0;
        
        for(Mercadinho m: mercadinhos){
            
            if(m.getVendas().equals(data)){
                 soma += m.total();
            }
           
        }
        return soma;
    }

    public double total(){
        double soma = 0;
        for(Mercadinho m: mercadinhos){
            soma += m.total();
        }
        return soma;
    }
}
