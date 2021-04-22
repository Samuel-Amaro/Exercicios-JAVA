package ID_1174;

import java.util.List;
import java.util.Scanner;


public class SelecaoVetor1 {

    public static void main(String[] args) {
       
        //definindo o tipo do array como a classe number, que e uma super classe, das classe Wrapes, como Integer, Float, Double, etc... so numericas
        Array<Number> a = new Array<Number>(100);

        //apos definir o tipo do array eu posso passar qualquer tipo de classe filha de number que não seja um tipo primitivo
    
        //gera 25 numeros aleatorios da classe double
        for(int i = 0; i < 25; i++) {
            a.setArrayGenerico(Double.valueOf(Math.random() * 25),i);
        }

        //gera 25 numeros aleatorios da classe Integer
        for(int i = 25; i < 50; i++) {
            a.setArrayGenerico(Integer.valueOf((int)(Math.random() * 15)),i);
        }

        //gera 25 numeros aleatorios da classe Float
        for (int i = 50; i < 75; i++) {
            a.setArrayGenerico(Float.valueOf((float)Math.random() * 0.50f),i);
        }

        //gera 25 numeros aleatorios Integer negativos
        for (int i = 75; i < 100; i++) {
            a.setArrayGenerico(Integer.valueOf((int)(Math.random() * - 15)),i);
        }

        //a.imprimeLista();

        a.trataTipos();
        a.trataArrays();
        a.pegaValoresAndArmazena();
        //a.imprimeArraysTratados();
        a.menorQue(10);
        a.imprimeValoresMenores();
    }
}
