import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.swing.JMenuBar;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class ExerciciosTexto3
{
   // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public ExerciciosTexto3()
    {
  
    }
    
    public String exercicio3_1(){
        Date dataAtual = new Date();
        return "" + dataAtual;
    }
    
    public String exercicio3_2(String dataRecebida){
        
        Date dataFormatada = new Date();
        try {
          SimpleDateFormat formato = new SimpleDateFormat("EEEE, dd/MMMM/yyyy, HH:mm:ss");
          dataFormatada = formato.parse(dataRecebida); 
        } catch (Exception ex) {
       }
       String dataF = ""+ dataFormatada;
       String dataFinal = dataF.substring(0,3) +", " + dataF.substring(8,10) +" "+ dataF.substring(4,7)+ " to " + dataF.substring(23, dataF.length());
       
       return ""+ dataFinal;
    }
    
    public String[] exercicio3_3(String caminho){
            
        File diretorioTemp = new File(caminho);
        String[] conteudo = diretorioTemp.list();
        return conteudo;
    }
    
    public String[] exercicio3_4(String caminho){
            
        File diretorioTemp = new File(caminho);
        String[] conteudo = diretorioTemp.list();
        int tamanhoVet = conteudo.length;
        String[] newConteudo = new String[tamanhoVet];
        if(diretorioTemp.exists()){
        for(int i = 0; i<= tamanhoVet-1; i++){
            if(conteudo[i].contains(".")){
                        newConteudo[i] = "[A] " + conteudo[i];
                    }
                    else{
                        newConteudo[i] = "[D] " + conteudo[i];
                    }
             }        
    
        return newConteudo;
        }else{return null;}
    }
    
    public String[] exercicio3_5(String caminho){
        File diretorioTemp = new File(caminho);
        if(diretorioTemp.exists()){
             diretorioTemp.delete();
        }
        
        return null;  
    }
    
    public void exercicio3_6(){
        JFrame tela = new JFrame();
        tela.setTitle("Exercicio 3.6");
        tela.setSize(300,500);
        tela.setVisible(true);
        JMenuBar menuMain = new JMenuBar();
        tela.setJMenuBar(menuMain);
        JMenu arquivo = new JMenu("Arquivo");
        JMenu editar = new JMenu("Editar");
        menuMain.add(arquivo);
        menuMain.add(editar);
        menuMain.setVisible(true);
        JMenuItem arqNovo = new JMenuItem("Novo...");
        JMenuItem arqAbrir = new JMenuItem("Abrir...");
        JMenuItem arqAbrirColocar = new JMenuItem("Abra e Coloque...");
        JMenuItem arqAbrirMais = new JMenuItem("Abrir Mais");
        JMenuItem arqSalvar = new JMenuItem("Salvar");
        JMenu arqExp = new JMenu("Exportar como");
        arquivo.add(arqNovo);
        arquivo.add(arqAbrir);
        arquivo.add(arqAbrirColocar);
        arquivo.add(arqAbrirMais);
        arquivo.add(arqSalvar);
        arquivo.add(arqExp);
        JMenuItem png = new JMenuItem("PNG");
        JMenuItem jpg = new JMenuItem("JPG");
        JMenuItem svg = new JMenuItem("SVG");
        JMenuItem gif = new JMenuItem("GIF");
        JMenuItem pdf = new JMenuItem("PDF");
        arqExp.add(png);
        arqExp.add(jpg);
        arqExp.add(svg);
        arqExp.add(gif);
        arqExp.add(pdf);
        JMenuItem editDesf = new JMenuItem("Desfazer/Refazer");
        JMenuItem editCopy = new JMenuItem("Copiar");
        JMenuItem editCortar = new JMenuItem("Cortar");
        JMenuItem editColar = new JMenuItem("Colar");
        editar.add(editDesf);
        editar.add(editCopy);
        editar.add(editCortar);
        editar.add(editColar);
    }
    
    public void exercicio3_7(String caminho){
        caminho = caminho.toLowerCase();
        String[] comando = {"cmd", "/c", "start", caminho};
        
        try{
              Runtime.getRuntime().exec(comando);

        }catch (Exception ex) {
        }
    }
    
    public void exercicio3_8(String caminho){
      
        caminho = caminho.toLowerCase();
        String[] comando = {"notepad", caminho};
        
        try{
              Runtime.getRuntime().exec(comando);

        }catch (Exception ex) {
        }
    
    }
    
    public void exercicio3_9(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension scrnsize = toolkit.getScreenSize();
        int largura = (int)scrnsize.getWidth();
        int altura = (int)scrnsize.getHeight();
        JFrame janela = new JFrame();
        janela.setTitle("Exercicio 3.9");
        janela.setVisible(true);
        janela.setSize(largura, altura);

    }
    
   public String exercicio3_10(String data1, String data2){
       
     try{
      Calendar hoje = Calendar.getInstance();
      String anoAtual = ""+ hoje.get(Calendar.YEAR);
      String mesAtual = ""+ hoje.get(Calendar.MONTH);
      String diaAtual = ""+ hoje.get(Calendar.DAY_OF_MONTH);
      
      int anoAt = Integer.parseInt(anoAtual);
      int mesAt = Integer.parseInt(mesAtual);
      int diaAt = Integer.parseInt(diaAtual);
      //System.out.printf("ano da data 1: %s\n", data1.substring(0,2));
      int anoDt1 = Integer.parseInt(data1.substring(6,10));
      int anoDt2 = Integer.parseInt(data2.substring(6,10));
      int mesDt1 = Integer.parseInt(data1.substring(3,5));
      int mesDt2 = Integer.parseInt(data2.substring(3,5));
      int diaDt1 = Integer.parseInt(data1.substring(0,2));
      int diaDt2 = Integer.parseInt(data2.substring(0,2));
      
      
      if(anoAt - anoDt1 > anoAt - anoDt2){
        return data2;
      }
      if(anoAt - anoDt1 == anoAt - anoDt2){
           if(mesAt - mesDt1 > mesAt - mesDt2){
                return data2;
            }
           if(mesAt - mesDt1 == mesAt - mesDt2){
               if(diaAt - diaDt1 > diaAt - diaDt2){
                  return data2;
                }
               if(diaAt - diaDt1 == diaAt - diaDt2){
                  return "as datas são iguais :" + data2;
               }
               else{
                  return data1;
                }
           }
           else{
                return data1;
           }
        
      }
      
      return data1;  
      
     }catch(Exception ex){
        return "Por favor digite a data no formato 00/00/0000";
     }
    }
 
     public String[] exercicio3_11(String[] data ){
        Calendar hoje = Calendar.getInstance();
      String anoAtual = ""+ hoje.get(Calendar.YEAR);
      String mesAtual = ""+ hoje.get(Calendar.MONTH);
      String diaAtual = ""+ hoje.get(Calendar.DAY_OF_MONTH);
      
      int anoAt = Integer.parseInt(anoAtual);
      int mesAt = Integer.parseInt(mesAtual);
      int diaAt = Integer.parseInt(diaAtual);
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    
        int tamanho = data.length;
   
        String aux;
        try{
        
        
        
        
        for(int i = 0; i<= tamanho; i++){
          for(int j =0; j<= tamanho; j++){
                System.out.printf("data[%d].compareTo(%d) = %d\n data[i] > data[j] ?\n %s > %s?\n", i, j,data[i].compareTo(data[j].substring(6,10)), data[i], data[j] );
                   
              if(data[i].compareTo(data[j].substring(6,10))> 0){
                      aux =  data[i];
                      data[i] = data[j];
                      data[j] = aux;
                  
                  
              }
            
              
   
            }
            
        }

        
    }catch(Exception ex){};
        return data;
     }
 
     public String exercicio3_12(String data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Date dataD = new Date();

        try
        {
            dataD = formatador.parse(data);
        }
        catch (java.text.ParseException pe)
        {
            pe.printStackTrace();
        }
        data = ""+ dataD;
        String diaS = data.substring(0,3);
        diaS = diaS.toLowerCase();
        if(diaS.contains("sun")){
            diaS = "Domingo";
        }
        if(diaS.contains("mon")){
            diaS = "Segunda";
        }
        if(diaS.contains("tue")){
            diaS = "Terça";
        }
        if(diaS.contains("wed")){
            diaS = "Quarta";
        }
        if(diaS.contains("thu")){
            diaS = "Quinta";
        }
        
        if(diaS.contains("fri")){
            diaS = "Sexta";
        }
        if(diaS.contains("sat")){
            diaS = "Sabádo";
        }
        
        
        
        
        
        
        return diaS;
    }
   
}
