
public class Estado
{
    private String nome;
    private Cidade[] cidades;
    public Estado()
    {
 
    }
     public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Cidade[] getCidades(){
        return cidades;
    }
    public void setEscolas(Cidade[] cidades){
        this.cidades = cidades;
    }
    
     public double mediaLeitura(){
        double soma =0;
        for(Cidade c: cidades){
            soma += c.mediaLeitura();
        }
        
        return soma/cidades.length;
    }

    
}
