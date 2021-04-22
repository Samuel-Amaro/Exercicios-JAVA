package ID_1010;

import java.util.Scanner;

/**
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
 * 
 * * ENTRADA:
 * 
 * O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas deci
 * mais.
 * 
 * * SAIDA:
 *  
 * A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */
public class CalculoSimples {
    
    public static void main(String[] args) {
        
        int codigoPeca1;
        int numeroPecas1;
        double valorUnitarioPeca1;
        int codigoPeca2;
        int numeroPeca2;
        double valorUnitarioPeca2;

        Scanner input = new Scanner(System.in);

        codigoPeca1 = input.nextInt();
        numeroPecas1 = input.nextInt();
        valorUnitarioPeca1 = input.nextDouble();
        codigoPeca2 = input.nextInt();
        numeroPeca2 = input.nextInt();
        valorUnitarioPeca2 = input.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f",(numeroPecas1 * valorUnitarioPeca1) + (numeroPeca2 * valorUnitarioPeca2));
    }
    

}
