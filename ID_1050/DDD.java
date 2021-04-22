package ID_1050;

import java.util.Scanner;

/**
 *  Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
 * 
 * Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado
 * 
 * ENTRADA: A entrada consiste de um único valor inteiro.
 * 
 * SAIDA: Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado
*/
public class DDD {
    
    

    public static void main(String[] args) {

        
    
        Scanner entrada = new Scanner(System.in);

        int ddd = entrada.nextInt();

        String dddText = Integer.toString(ddd);

       String resp = procura(dddText);

       if(resp.isEmpty()) {
           System.out.println("DDD não cadastrado");
       }else{
        System.out.println(resp);
       }


        

        entrada.close();
    }

    public static String procura(String ddd) {
        //matriz [[],[],[]]...
        String[][] tabelaDDD = {{"61","Brasilia"},
                     {"71","Salvador"},
                     {"11","São Paulo"},
                     {"21","Rio de Janeiro"},
                     {"32","Juiz de fora"},
                     {"19", "Campinas"},
                     {"27","Vitoria"},
                     {"31","Belo Horizonte"}};

        for(int i = 0; i < tabelaDDD.length; i++) {
            for(int j = 0; j < tabelaDDD[i].length; j++) {
                if(tabelaDDD[i][j].equals(ddd)) {
                    return tabelaDDD[i][j + 1]; 
                }
            }
        }
        return null;
    }
    
}
