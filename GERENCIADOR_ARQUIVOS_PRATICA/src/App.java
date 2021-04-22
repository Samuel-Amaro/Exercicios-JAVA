import java.nio.file.Path;

import br.com.ifg.GerenciaArquivo;

public class App {

    public static void main(String[] args) throws Exception {
        
        String nomeArquivo = "arquivoTeste02";
        String extensao = "txt";
        String caminhoAbsoluto = "C:\\Users\\SAMUE\\Documents\\PROGRAMACAO-CURSOS-PROJETOS-2020-2021\\JAVA_2020_2021\\EXERCICIOS_PRATICOS\\Gerenciador_Arquivos_Pratica\\src\\br\\com\\ifg\\arquivos";

        GerenciaArquivo g = new GerenciaArquivo();

        String conteudo = g.geraConteudoArquivo();

        //cria um arquivo e coloca conteudo nele usando STREAMS DE I/O  SEM BUFFER
        g.createFileAndAppendUsingIOStream(conteudo, nomeArquivo, caminhoAbsoluto, extensao);        
        
        //LENDO OS BYTES DO ARQUIVO E IMPRIMENDO CONTEUDO NA SAIDA PADRÃO USANDO I/O STREAMS SEM BUFFER
        g.readFileUsingStream(nomeArquivo, caminhoAbsoluto, extensao);

        //CRIANDO ARQUIVO USANDO ENTRADA E SAIDA DE STREAMS E BUFFER
       String n1 = "arquivo03";
       String e1 = "txt";
       String c1 = g.geraConteudoArquivo();
       g.createFileUsingIOStreamAndBuffer(caminhoAbsoluto, n1, e1, c1);

       //LENDO O CONTEUDO DO ARQUIVO USANDO STREAMS DE ENTRADA E SAIDA EM BUFFER
       g.readFileUsingIOStreamAndBuffer(caminhoAbsoluto + "\\" + n1 + "." + e1);
    }
}
