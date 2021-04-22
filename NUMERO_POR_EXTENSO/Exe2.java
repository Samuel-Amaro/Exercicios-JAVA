package Exercicios.NumeroPorExtenso;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String[] extenso = new String[10];
        
        int numero;

        extenso[0] = "Um";
        extenso[1] = "Dois";
        extenso[2] = "Três";
        extenso[3] = "Quatro";
        extenso[4] = "Cinco";
        extenso[5] = "Seis";
        extenso[6] = "Sete";
        extenso[7] = "Oito";
        extenso[8] = "Nove";
        extenso[9] = "Dez";

        for(int i = 0; i < 10; i++) {
            System.out.print("Digite um Numero entre 1 e 10: ");
            numero = entrada.nextInt();
            if(numero >= 1 && numero <= 10) {
               for(int j = 0; j < 10; j++) {
                    if(numero == j) {
                        System.out.println(extenso[j]);
                    }
               }
            }else{
                System.out.println("Numero invalido");
                break;
            }
        }
    }
}
