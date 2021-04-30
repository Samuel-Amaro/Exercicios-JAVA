package br.com.ifg;

/**
 * * INTERFACE DE OPERACOES DE UM ARQUIVO
 *  
*/

public interface OperacoesArquivo {
    
    /**
     * Este metodo cria um arquivo baseado nos parametros, cria um arquivo da maneira mais simples possivel
     * @param caminhoAbsoluto
     * @param nomeArquivo
     * @param extensao
     */
    public void criaArquivoSimples(String caminhoAbsoluto,String nomeArquivo, String extensao);

    /**
     * Este metodo escreve linhas de conteudo em um arquivo;
     * @param linhaConteudo
     * @param caminhoAbsolutoArquivo
     */
    public void escreveLinhasArquivo(String linhaConteudo, String caminho, String file, String extension);
    
    /**
     * este metodo ler conteudo de um arquivo
     * @param caminhoAbsolutoArquivo
     */
    public void lerLinhasArquivo(String caminho, String file, String extension); 


    /**
     * este metodo cria um arquivo e escreve conteudo nele;
     * @param conteudo
     * @param nomeArquivo
     * @param caminho
     * @param extensao
     */
    public void createFileAndAppendUsingIOStream(String conteudo, String nomeArquivo, String caminho, String extensao);

    /**
     * metodo para ler o conteudo de um arquivo
     * @param nomeArquivo
     * @param caminho
     * @param extensao
     */
    public void readFileUsingStream(String nomeArquivo, String caminho, String extensao);

    /**
     * este metodo vai gerar conteudo para escrever em um arquivo
     * @return
     */
    public String geraConteudoArquivo();

    /**
     * Este metodo e para criar e gravar conteudo em um arquivo usando streamns de I/O usando buffer
     * @param caminho
     * @param file
     * @param extension
     * @param conteudo
     */
    public void createFileUsingIOStreamAndBuffer(String caminho, String file, String extension, String conteudo);

    /**
     * este metodo ler o conteudo de um arquivo usando buffer e streams de entrada e saida
     * @param caminho
     */
    public void readFileUsingIOStreamAndBuffer(String caminho);


}
