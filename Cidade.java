

public class Cidade
{
    private String nome;
    private Escola[] escolas;
    public Cidade()
    {
   
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Escola[] getEscolas(){
        return escolas;
    }
    public void setEscolas(Escola[] escolas){
        this.escolas = escolas;
    }
    
     public double mediaLeitura(){
        double soma =0;
        for(Escola e: escolas){
            soma += e.mediaLeitura();
        }
        
        return soma/escolas.length;
    }

}
