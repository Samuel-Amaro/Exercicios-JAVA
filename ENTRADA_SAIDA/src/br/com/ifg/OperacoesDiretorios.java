package br.com.ifg;

/**
 * esta interface dara os metodos padroes de operações em um diretorio
 *  
*/
public interface OperacoesDiretorios {
    
    public void criaDiretorio(String path, String nome);
    public void criaDiretorioTemporario(String path, String nome);
    public void lerConteudoDiretorio(String path, String nome);
    public void listaDiretorioRaiz();
    public void excluirDiretorio();
    public void copiarUmDiretorio();
}
