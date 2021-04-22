package ID_1013;

import java.util.Scanner;

/**
 *  Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
 * 
 *  maiorAb = (a + b + abs(a - b)) / 2
 * 
 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.
 * 
 * O arquivo de entrada contém três valores inteiros.
 * 
 * Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/

public class Maior {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        System.out.printf("");
        int b = input.nextInt();
        System.out.printf("");
        int c = input.nextInt();


        //maior entre a e b
        int maiorAb = (a+b+Math.abs(a-b)) / 2;

        if(c > a || c > b) {
            System.out.format("%d eh o maior",c);    
        }else if(maiorAb > c) {
            System.out.format("%d eh o maior",maiorAb);
        }

        //System.out.format("%d %d %d %.2f",a,b,c,maiorAb);
        


    }
    

}
