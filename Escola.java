import java.util.ArrayList;

public class Escola
{
    
    private String nome;
    private ArrayList<Estudante> estudantes;
    
    public Escola()
    {
  
    }
     public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public ArrayList<Estudante> getEstudantes(){
        return estudantes;
    }
    public void setEscolas(ArrayList<Estudante> estudantes){
        this.estudantes = estudantes;
    }
    public double mediaLeitura(){
        double soma =0;
        for(Estudante e: estudantes){
            soma += e.getNivelLeitura();
        }
        
        return soma/estudantes.size();
    }
    public ArrayList<Estudante> estudantesAcimaMediaEscola(){
        ArrayList<Estudante> acimaMediaEscola = new ArrayList<>();
        for(Estudante e: estudantes){
            if(e.getNivelLeitura() > mediaLeitura()){
                acimaMediaEscola.add(e);
            }
        }
        return acimaMediaEscola;
    }
    
    public ArrayList<Estudante> estudantesAcimaMedia(int media){
        ArrayList<Estudante> acimaMedia = new ArrayList<>();
        for(Estudante e: estudantes){
            if(e.getNivelLeitura() > media){
                acimaMedia.add(e);
            }
        }
        return acimaMedia;
    }


}
