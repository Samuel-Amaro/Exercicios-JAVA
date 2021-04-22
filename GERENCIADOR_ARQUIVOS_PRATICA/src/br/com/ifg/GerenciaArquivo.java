package br.com.ifg;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

import static java.nio.file.StandardOpenOption. *;


/**
 * Esta classe gerencia arquivos, cria, deleta, exclui, escreve, apaga, etc... para poder praticar ENTRADAS E SAIDAS DE ARQUIVOS EM JAVA APRENDENDO I/O.
 * 
 * Esta classe implementa um padrão de metodos da interface Operacoes Arquivo, todos esses metodos são implementados aqui na classe.
 * 
*/

public class GerenciaArquivo implements OperacoesArquivo {
    
    private String nomeArquivo;
    private String caminhoText;
    private String extensaoArquivo;
    private Path pathFile;
    
    //COSNTRUTOR PADRÃO
    public GerenciaArquivo() {}

    /**
     * Este metodo mostra informações sobre o caminho do arquivo 
    */
    public void informationPathFile() {
         System.out.println("################################################");
         System.out.format("PATH COMPLETO: %s %n",this.pathFile.toString());
         System.out.format("NOME DO ARQUIVO: %s %n", this.pathFile.getFileName());
         System.out.format("ELEMENTO MAIS PROXIMO DA RAIZ: %s %n",this.pathFile.getName(0));
         System.out.format("NUMERO DE ELEMENTO NO PATH COMPLETO: %s %n",this.pathFile.getNameCount());
         System.out.format("SUBCAMINHO: %s %n",this.pathFile.subpath(0,this.pathFile.getNameCount()));
         System.out.format("CAMINHO DO DIRETORIO PAI: %s %n",this.pathFile.getParent());
         System.out.format("RETORNA A RAIZ DO CAMINHO: %s %n", this.pathFile.getRoot());   
    }

    /**
     * * * CRIANDO E GRAVANDO UM ARQUIVO USANDO ENTRADA/SAIDA DE FLUXO SEM BUFFER
     * 
     * se o arquivo exsitir so anexa o conteudo no arquivo.
     * 
     * se o arquivo não existe cria o arquivo e escreve o conteudo
     * 
     * @param conteudo
     * @param nomeArquivo
     * @param caminho
     * @param extensao
     */
    public void createFileAndAppendUsingIOStream(String conteudo, String nomeArquivo, String caminho, String extensao) {
        if(conteudo.isEmpty()) {
            //string vazia
            System.err.println("CRIAR ARQUIVO COM ENTRADA E SAIDA DE FLUXOS NÃO DEU CERTO, PRECISA DE CONTEUDO PARA GRAVAR NO ARQUIVO!");
        }else{
            String str = conteudo;
            String file = caminho + "\\" + nomeArquivo + "." + extensao;
            byte[] dados = str.getBytes();
            Path caminhoAbsolutoArquivo = Paths.get(file);
            //APPEND - acrecenta novos dados ao final do arquivo
            //CREATE - abre o arquivo se ele existir ou cria um novo arquivo se não existir
            try(OutputStream out = new BufferedOutputStream(Files.newOutputStream(caminhoAbsolutoArquivo,CREATE,APPEND))) {
                //escreve o str conteudo no arquivo
                out.write(dados,0,dados.length);
                System.out.print("GRAVANDO DADOS NO ARQUIVO!: " + caminhoAbsolutoArquivo.getFileName());
            }catch(IOException e) {
                System.err.println("ERRO AO GRAVAR DADOS NO ARQUIVO OU CRIALO: " + e);
            }
        }
    }

    /**
     * * * METODO QUE LE O CONTEUDO DE UM ARQUIVO SEM PRECISAR USAR BUFFER DE ENTRADA E SAIDA, APENAS USANDO STREAMS DE I/O
     * 
     * retorna o fluxo de entrada sem buffer para ler bytes do arquivo
     * @param nomeArquivo
     * @param caminho
     * @param extensao
     */
    public void readFileUsingStream(String nomeArquivo, String caminho, String extensao) {
        //caminho até o arquivo
        Path caminhoFile = Paths.get(caminho + "\\" + nomeArquivo + "." + extensao);
        //verificar se o caminho até o arquivo  existe
        try(InputStream in = Files.newInputStream(caminhoFile); BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            
            String linha = null;

            System.out.println("##########CONTEUDO DO ARQUIVO: " + caminhoFile.getFileName() + " ######################");

            while((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
                System.err.println("ERRO AO LER ARQUIVO: " + e);
        }
    }

    /**
     * Este metodo simplementes tem a tarefa de criar um arquivo, da maneira mais simple possivel, usando a classe File. 
    */
    @Override
    public void criaArquivoSimples(String caminhoAbsoluto, String nomeArquivo, String extensao) {
        caminhoAbsoluto = caminhoAbsoluto.concat(nomeArquivo + "." + extensao);
        Path path = Paths.get(caminhoAbsoluto);
        try {
            //cria um arquivo com atributos e permissões padrões definidos pelo SO
            Files.createFile(path);
            this.pathFile = path;
            //return true;

        }catch(FileAlreadyExistsException x) {
            System.err.println("ARQUIVO JA EXISTE: " + x);
            //return false;
        }
        catch (IOException e) {
            System.err.println("ERRO AO CRIAR ARQUIVO! " + e);
            //return false;
        }
    }

    /**
     * ESTE METODO ESCREVE CONTEUDO EM UM ARQUIVO, USANDO BUFFER DE DADOS E OPERAÇÕES DA CLASSE FILE. 
    */
    @Override
    public void escreveLinhasArquivo(String linhaConteudo, String caminhoAbsolutoArquivo) {
        //se não tiver conteudo
        if (linhaConteudo.isEmpty()) {
            System.out.println("linha de conteudo tem que ter conteudo!");
        } else {
            Path caminhoFile = Paths.get(caminhoAbsolutoArquivo);
            //conteudo transformado em bytes
            byte[] bufDados = linhaConteudo.getBytes();
            try {
                //escrevendo no arquivo
                Files.write(caminhoFile,bufDados);    
            } catch (IOException e) {
                System.err.println("ERRO AO ESCREVER LINHA NO ARQUIVO: " + e);
            }
        }
    }

    /**
     * le o conteudo de um arquivo da maneira mais simples usando, buffer de dados e operações da classe file
     * @param caminhoAbsolutoArquivo
     */
    @Override
    public void lerLinhasArquivo(String caminhoAbsolutoArquivo) {
        //onde os dados do arquivo vão ser armazenados
        byte[] buferDados;
        //caminho ate o arquivo
        Path pathFile = Paths.get(caminhoAbsolutoArquivo);
        try {
            //ler todos os bytes do arquivo, de arquivo pequeno
            buferDados = Files.readAllBytes(pathFile);
            //ler todas as linhas de conteudo do arquivo, na codificação padrão de caracteres da paltaforma DO SO que se esta usando 
            List<String> linhaConteudoArquivo = Files.readAllLines(this.pathFile,Charset.defaultCharset());
            System.out.println("############## CONTEUDO DO ARQUIVO : " + pathFile.getFileName() + "######################");
            for (String linha : linhaConteudoArquivo) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("ERRO AO LER CONTEUDO DO ARQUIVO: " + e);
        }
    }

    /**
     * este metodo vai selecionar um paragrafo aleatorio e retornalo como string
     * @return
     */
    @Override
    public String geraConteudoArquivo() {
        String conteudo[] = {"Lorem ipsum porta blandit suscipit metus et cras facilisis mi id, aliquam vulputate massa auctor consequat volutpat ornare phasellus urna habitant, ut orci in aptent eleifend mi risus vitae porttitor. nullam litora laoreet duis vehicula nunc donec, dictumst urna varius per porta, varius hendrerit elit aliquam quis. enim integer tincidunt ad iaculis lacinia mauris vestibulum urna pretium pharetra, consequat risus scelerisque tellus litora aenean enim sem ac vivamus, purus justo ullamcorper felis at inceptos quisque nibh et. leo aenean orci quam senectus eget etiam molestie facilisis bibendum cursus fames, erat adipiscing tristique ornare donec magna molestie purus eu euismod.", "Nullam accumsan curae sociosqu ultrices vulputate rhoncus, neque praesent conubia porttitor quisque scelerisque diam, ligula et aenean lacinia porttitor. a ac aliquam rhoncus rutrum viverra nibh fermentum commodo, placerat non pellentesque condimentum mattis tellus primis, taciti porta in lorem mollis lacus vitae. odio nulla fringilla cubilia massa interdum lobortis, tincidunt gravida phasellus platea massa dui, convallis aenean iaculis faucibus himenaeos. hac dictum inceptos ac netus suscipit senectus sodales donec vivamus, semper vehicula duis vivamus nec suspendisse quam arcu, lectus dui curabitur id ultricies orci potenti amet. nullam euismod magna sollicitudin commodo mattis eget rhoncus malesuada, sed a primis viverra varius ultrices varius. ", "Pretium vivamus curae neque mollis vehicula eleifend senectus iaculis cubilia morbi quisque a, turpis et tortor habitasse bibendum ut arcu dolor integer maecenas. lacinia mauris donec sodales id lectus class massa donec blandit praesent ante, turpis molestie etiam consectetur gravida netus pellentesque amet scelerisque ut, rutrum pulvinar habitasse aenean consequat aliquet habitant lectus semper hac. ligula cursus praesent congue arcu elit posuere sem conubia tincidunt, etiam justo integer a amet diam semper accumsan quam arcu, vitae vestibulum aliquam ultrices augue sed ut accumsan. litora suscipit vivamus himenaeos donec egestas blandit, donec himenaeos potenti nostra consequat bibendum ligula, mollis consectetur odio neque donec. "};
        Random geraAleatorio = new Random();
        int item = geraAleatorio.nextInt(2);
        return conteudo[item];
    }

    /**
     * Este metodo cria e escreve conteudo em um arquivo usando Streams de entrada e saida com buffer
     */
    @Override
    public void createFileUsingIOStreamAndBuffer(String caminho, String file, String extension, String conteudo) {
        Path path = Paths.get(caminho + "\\" + file + "." + extension);
        //PADRÃO DE CODIFIÇÃO DO ARQUIVO
        Charset conjuntoCaracteres = Charset.forName("UTF-8");
        //verificando se tem o conteudo
        if(conteudo.isEmpty()) {
            System.err.println("PRECISA DE CONTEUDO PARA ESCREVER NO ARQUIVO!");
        }else{
            //APPEND - acrecenta novos dados ao final do arquivo
            //CREATE - abre o arquivo se ele existir ou cria um novo arquivo se não existir
            try (BufferedWriter writer = Files.newBufferedWriter(path, conjuntoCaracteres, CREATE,APPEND)) {

                //escrevendo o buffer no arquivo
                writer.write(conteudo, 0, conteudo.length());
                
            } catch (IOException e) {
                System.err.format("ERRO AO ESCREVER BUFFER NO ARQUIVO: %s %n", e);
            }
        }
    }

    /**
     * este metodo le o conteudo de um arquivo usando streams e buffer de I/O 
    */
    @Override
    public void readFileUsingIOStreamAndBuffer(String caminho) {
           //caminho
           Path path = Paths.get(caminho);
           //CODIFICAÇÃO DOS CARACTERES
           Charset conjuntoCaracteres = Charset.forName("UTF-8");
           try (BufferedReader reader = Files.newBufferedReader(path, conjuntoCaracteres)) {
                
                //lendo conteudos do arquivo
                String linha = null;
                System.out.println("########CONTEUDO DO ARQUIVO: " + path.getFileName() + "#############");
                while((linha = reader.readLine()) != null) {
                     System.out.println(linha);
                }
           } catch (IOException e) {
               System.err.println("ERRO AO LER BUFFER DO ARQUIVO: " + e);
           }
    }

}
