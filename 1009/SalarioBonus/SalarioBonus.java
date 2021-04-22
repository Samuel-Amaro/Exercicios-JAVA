

import java.util.Scanner;

/**
 * SalarioBonus
 * 
 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
 * 
 * * entrada
 * 
 * O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente
 * 
 * * SAIDA
 * 
 * Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
 */
public class SalarioBonus{

    public static void main(String[] args) {
        
       String nome;
       double salarioFixo;
       double totalVendas;
       double comissao;
       
       Scanner input = new Scanner(System.in);

       nome = input.nextLine();
       salarioFixo = input.nextDouble();
       totalVendas = input.nextDouble();

       comissao = 0.15 * totalVendas;

       System.out.printf("TOTAL = R$ %.2f\n",comissao + salarioFixo);
    }
}