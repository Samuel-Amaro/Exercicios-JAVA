package ID_1042;

import java.util.Scanner;

public class SortSimples {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] valores = {0,0,0};
        int[] valoresOrdenados = {0,0,0};


        //ordem em que valores são lidos
        valores[0] = entrada.nextInt();
        valores[1] = entrada.nextInt();
        valores[2] = entrada.nextInt();
        //cpiando valores
        valoresOrdenados[0] = valores[0];
        valoresOrdenados[1] = valores[1];
        valoresOrdenados[2] = valores[2];

        for(int i = 0; i < valores.length; i++) {
            for(int j = i; j < valores.length; j++) {
                if(valores[i] > valores[j]) {
                   //troca posições
                   int valor = valoresOrdenados[i];
                   valoresOrdenados[i] = valoresOrdenados[j];
                   valoresOrdenados[j] = valor;
                }else if(valores[i] == valores[j]){
                    //faz nada
                }else{
                    //faz nada
                }
            }   
        }

        System.out.println(); 

        for (int i : valoresOrdenados) {
            System.out.format("%d %n",i);
        }

        System.out.println();

        for (int i : valores) {
             System.out.format("%d %n",i);
        } 

        entrada.close();

    }
}
