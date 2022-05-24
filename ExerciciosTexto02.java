
import java.lang.Math;
import java.lang.String;
import java.util.ArrayList;

public class ExerciciosTexto02
{
    private ArrayList<String> nomeSobrenome = new ArrayList<String>();
  
    public ExerciciosTexto02()
    {
    
    }


    public int []exercicio2_2(int n1, int n2){
       
        if(n1 > n2){
            return new int[]{n2,n1};
        }else{
            return new int[]{n1,n2};
        }
    }
    
    public double []exercicio2_3(double n1, double n2, double n3)
    {
        if(n1 > n2 && n1 > n3){
            if(n2>n3){
                  return new double[]{n1,n2,n3};
            }else{
                return new double[]{n1,n3,n2};
            }
          
        }
        if(n2 > n1 && n2 > n3){
            if(n1>n3){
                  return new double[]{n2,n1,n3};
            }else{
                return new double[]{n2,n3,n1};
            }
          
        }
        
          if(n3 > n1 && n3 > n2){
            if(n2>n1){
                  return new double[]{n3,n2,n1};
            }else{
                return new double[]{n3,n1,n2};
            }
          
        } 
      return new double[]{n1,n2,n3};
    }
    
    public double exercicio2_4(int n1){
        double valorRaiz = Math.sqrt(n1);
        return valorRaiz;
    }
    public String exercicio2_5(String str1, String str2){
        
        
        if(str2.indexOf(str1) == 0){
            //indexOf compara as duas strings, retornando a posição onde ela
            //encontra a primeira letra que começa a combinar
            return "Está contido";
        }else{
        
            return "Não está contido";
        }
        
    }
    
    
    public String [] exercicio2_6 (String str1, String str2){
        int c1 = str1.compareTo(str2);
        int c2 = str2.compareTo(str1);
        if(c1 > c2){
            return new String[]{str2, str1};
        }
        else{
            return new String[]{str1, str2};
        }
    }
    
    public String []exercicio2_7(String str1, String str2, String str3){
        int c12 = str1.compareTo(str2);//se c12 for negativo entao str1 vem antes de str2
        int c23 = str2.compareTo(str3);
        int c13 = str1.compareTo(str3);
        int c31 = str3.compareTo(str1);
           
      
        if(c12 < 0 && c13 < 0){
            if(c23 < 0){
                return new String[]{str1, str2, str3};
            }
            else{
            
                return new String[]{str1, str3, str2};
            }
            
        }
        
        else{
            if(c12 > 0 && c13>0){
                if(c23>0){
                    return new String[] {str3,str2,str1};
                }
                else{
                    return new String[]{str2,str3, str1};
                }
                
            }else{
                if(c23<0){
                     return new String[]{str2, str1, str3};
                }else{
                     return new String[]{str3, str1, str2};
                }
            }
            
        }
    }
    
    public String[] exercicio2_8(String nomeS[] ){ 
      int index = 0;
      char[] nome = new char[40];
      int k = 0;
      String Snome [] = new String [nomeS[k].length() + 1];
      while(nomeS.length > k ){
      for(int i=0; i <= nomeS[k].length(); i++){
        System.out.printf("nomeS[%d] = %s \n", i, nomeS[k].substring(0,i));
        index = nomeS[k].substring(0,i).indexOf(" ");
        
         
      }
      Snome[k] = nomeS[k].substring(index+1, nomeS[k].length()) + ", " + nomeS[k].substring(0,index);
       
      k++;
    } 
 
      
       return Snome;
    }
    
    public String[] exercicio2_9 (String vetStr1[]){
        String [] novoVet = new String[vetStr1[0].length()];
        int tamanho = vetStr1[0].length();
        //System.out.printf("Tamanho: %d\n", tamanho);
    
        novoVet[0] =  vetStr1[0];
        novoVet[0] = novoVet[0].toUpperCase();
       
        return new String[]{novoVet[0]};
    
    }
    
    public String[] exericio2_10 (String vetStr1[]){

        vetStr1[0] = vetStr1[0].toUpperCase();
        return new String[]{vetStr1[0]};
    
    }
    
     public int[] exercicio2_11(int[] vetInt){
        int aux = 0;
        
        for(int i = 0; i < vetInt.length; i++){
            for(int j = i+1; j<vetInt.length; j++){
              if(vetInt[i] > vetInt[j]){
               aux = vetInt[i];
               vetInt[i] = vetInt[j];
               vetInt[j] = aux;
               
              }
            
            }
            
        }
        
        return vetInt;
        
    }
    
     public int[] exercicio2_12(int[] vetInt){
        int aux = 0;
        int qtdTrocas =0;
        for(int i = 0; i < vetInt.length; i++){
            for(int j = i+1; j<vetInt.length; j++){
              if(vetInt[i] > vetInt[j]){
               aux = vetInt[i];
               vetInt[i] = vetInt[j];
               vetInt[j] = aux;
               qtdTrocas++;
              }
            
            }
            
        }
        System.out.printf("Quantidade de Trocas = %d", qtdTrocas);
        return vetInt;
        
    }
   
  
    
    public String [] exercicio2_13 (String[] vetStr){
        String aux = "";
         int qtdTrocas =0;
        for(int i = 0; i < vetStr.length -1 ; i++){
          for(int j = i+1; j<vetStr.length; j++){
              //System.out.printf("vetStr[%d].compareTo(vetStr[%d]) = %d \n vetStr[%d] = %s\n vetStr[%d] = %s \n", i, j, vetStr[i].compareTo(vetStr[j]), i, vetStr[i], j, vetStr[j]);
              if(vetStr[i].compareTo(vetStr[j]) > 0){
               aux = vetStr[i];
               vetStr[i] = vetStr[j];
               vetStr[j] = aux;
               qtdTrocas++;
              }
            }
        }
        System.out.printf("Quantidade de Trocas = %d", qtdTrocas);
        return vetStr;
    }
    
    public int[] exercicio2_14(int[] vetInt){
        int aux = 0;
        int qtdTrocas =0;
        for(int i = 0; i < vetInt.length; i++){
            for(int j = i+1; j<vetInt.length; j++){
              if(vetInt[i] <= vetInt[j]){
               aux = vetInt[i];
               vetInt[i] = vetInt[j];
               vetInt[j] = aux;
               qtdTrocas++;
              }
            
            }
            
        }
        System.out.printf("Quantidade de Trocas = %d", qtdTrocas);
        return vetInt;
        
    }
    
     public String [] exercicio2_15 (String[] vetStr){
        String aux = "";
         int qtdTrocas =0;
        for(int i = 0; i < vetStr.length -1 ; i++){
            
          for(int j = i+1; j<vetStr.length; j++){
              
              //System.out.printf("vetStr[%d].compareTo(vetStr[%d]) = %d \n vetStr[%d] = %s\n vetStr[%d] = %s \n", i, j, vetStr[i].compareTo(vetStr[j]), i, vetStr[i], j, vetStr[j]);
              if(vetStr[i].compareTo(vetStr[j]) > 0){
               aux = vetStr[i];
               vetStr[i] = vetStr[j];
               vetStr[j] = aux;
               qtdTrocas++;
              }
            }
        }
        System.out.printf("Quantidade de Trocas = %d", qtdTrocas);
        return vetStr;
    }
    
    public String[] exercicio2_16(String nomeS[] ){ 
      
      String aux = "";

      int tamanho = nomeS.length;
   
      int index = 0;
      char[] nome = new char[40];
      int k = 0;
      String Snome [] = new String [tamanho];
      while(nomeS.length > k ){
      for(int i=0; i <= nomeS[k].length(); i++){
        System.out.printf("nomeS[%d] = %s \n", i, nomeS[k].substring(0,i));
        index = nomeS[k].substring(0,i).indexOf(" ");
        
         
      }
      Snome[k] = nomeS[k].substring(index+1, nomeS[k].length()) +" "+ nomeS[k].substring(0,index);
       
      k++;
    } 
    

       
        for(int i = 0; i < nomeS.length -1 ; i++){
            
          for(int j = i+1; j<nomeS.length; j++){
             
              //System.out.printf("vetStr[%d].compareTo(vetStr[%d]) = %d \n vetStr[%d] = %s\n vetStr[%d] = %s \n", i, j, vetStr[i].compareTo(vetStr[j]), i, vetStr[i], j, vetStr[j]);
              if(Snome[i].compareTo(Snome[j]) > 0){
               aux = Snome[i];
               Snome[i] = Snome[j];
               Snome[j] = aux;
             
              }
            }
        }
       return Snome;
    }
    
    
     public String[] exercicio2_17(String nomeS[] ){ 
      
      String aux = "";

      int tamanho = nomeS.length;
   
      int index = 0;
      char[] nome = new char[40];
      int k = 0;
      String Snome [] = new String [tamanho];
      while(nomeS.length > k ){
      for(int i=0; i <= nomeS[k].length(); i++){
        System.out.printf("nomeS[%d] = %s \n", i, nomeS[k].substring(0,i));
        index = nomeS[k].substring(0,i).indexOf(" ");
        
         
      }
      Snome[k] = nomeS[k].substring(index+1, nomeS[k].length()) + ", " + nomeS[k].substring(0,index);
       
      k++;
    } 
    

       
        for(int i = 0; i < nomeS.length -1 ; i++){
            
          for(int j = i+1; j<nomeS.length; j++){
             
              //System.out.printf("vetStr[%d].compareTo(vetStr[%d]) = %d \n vetStr[%d] = %s\n vetStr[%d] = %s \n", i, j, vetStr[i].compareTo(vetStr[j]), i, vetStr[i], j, vetStr[j]);
              if(Snome[i].compareTo(Snome[j]) > 0){
               aux = Snome[i];
               Snome[i] = Snome[j];
               Snome[j] = aux;
             
              }
            }
        }
       return Snome;
    }
    
}
