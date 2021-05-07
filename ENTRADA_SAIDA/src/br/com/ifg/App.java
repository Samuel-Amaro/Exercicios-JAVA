package br.com.ifg;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        GerenciaArquivo g = new GerenciaArquivo();
        
        String caminhoAbsoluto = "C:\\Users\\SAMUE\\Documents\\MEUS_PROJETOS_GITLOCAIS_REMOTOS_2020_2021\\EXERCICIOS_PRATICOS_JAVA\\GERENCIADOR_ARQUIVOS_PRATICA\\src\\br\\com\\ifg\\arquivos";
        String extensao = "txt";
        Scanner entrada = new Scanner(System.in);
        int respota = 0;
       
        do {
                System.out.println("\n\n-------------------------------------------------------------------");
                System.out.println("            ########## GERENCIADOR DE ARQUIVOS ##########              ");
                System.out.println("                    ########## OPÇÕES ###########                      ");
                System.out.println("1 - OPERAÇÃO DE CRIAÇÃO DE ARQUIVO MANEIRA SIMPLES!                    ");
                System.out.println("2 - OPERAÇÃO DE ESCRITA DE CONTEUDO MANEIRA SIMPLES!                   ");
                System.out.println("3 - OPERAÇÃO DE LEITURA DE CONTEUDO MANEIRA SIMPLES!                   ");
                System.out.println("4 - OPERAÇÃO DE CRIAÇÃO E ESCRITA USANDO I/O DE STREAMS SEM BUFFER!    ");
                System.out.println("5 - OPERAÇÃO DE LEITURA USANDO I/O DE STREAMS SEM BUFFER               ");
                System.out.println("6 - OPERAÇÃO DE CRIAÇÃO E ESCRITA USANDO I/O DE STREAMS COM BUFFER!    ");
                System.out.println("7 - OPERAÇÃO DE LEITURA USANDO I/O COM BUFFER!                         ");
                System.out.println("8 - INFORMAÇÕES SOBRE O DIRETORIO-PASTA!                               ");
                System.out.println("-----------------------------------------------------------------------");
                System.out.print("SUA RESPOSTA: ");
                int operacao = entrada.nextInt();
                String file = g.geraNomeFile();
                switch(operacao) {
                    case 1:
                        g.criaArquivoSimples(caminhoAbsoluto,file, extensao);
                        g.salvaArquivosCriados(caminhoAbsoluto, file, extensao);
                        break;
                    
                    case 2: 
                            //sempre informara a referencia do ultimo arquivo criado
                            String[] d = g.getReferenciaUltimoArquivo();
                            //gera conteudo dinamicamente
                            String conteudo = g.geraConteudoArquivo();
                            g.escreveLinhasArquivo(conteudo, d[0], d[1], d[2]);
                            break;

                    case 3:
                           //sempre informara a referencia do ultimo arquivo criado
                           String[] s = g.getReferenciaUltimoArquivo(); 
                           g.lerLinhasArquivo(s[0], s[1], s[2]);     
                           break;
                    case 8:
                        //sempre informara a referencia do ultimo arquivo criado
                        String[] c = g.getReferenciaUltimoArquivo();
                        g.informationPathFile(c[1], c[0], c[2]);
                        break;
                    default:
                        System.out.println("---------------*--------------------");
                        System.out.println("OPERAÇÃO NÃO SUPORTADA!");
                        break;
                }
                System.out.println("---------------------*--------------------------*----------------------");
                System.out.println("        ##### DESEJA CONTINUAR FAZENDO OPERAÇÕES ? #####               ");
                System.out.println("Digite(1) para continuar!");
                System.out.println("Digite(0) para finalizar Programa!");
                System.out.print("SUA RESPOSTA: ");
                respota = entrada.nextInt();
                //1 - continuar
                //0 - finalizar    
        } while (respota > 0 && respota < 2);
        System.out.println("\n\n------------------------------------------------------------------------");
        System.out.println("                               PROGRAMA FINALIZADO!                         ");
        System.out.println("----------------------------------------------------------------------------");                
       
    }
}
