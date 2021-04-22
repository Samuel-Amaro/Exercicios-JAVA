package Exercicios.MaiorNumero;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        int maior = 0;

        for(int i = 0; i < 10; i++) {
            System.out.print("Digite um Numero: ");
            numeros[i] = entrada.nextInt();
        }

        maior = numeros[0];

        for(int j = 0; j < 10; j++) {

            for(int k = 0; k < 10; k++) {
                if(maior > numeros[k]) {
                    //maior = numeros[j];
                }else{
                    maior = numeros[k];
                }
            }
        }

        System.out.println("Maior: " + maior);
    }
}
