package Exercicios.Notas;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
     
      Double[] notas = new Double[3];
        
      Scanner entrada = new Scanner(System.in);
      
      for(int i = 0; i < 3; i++) {
          System.out.print("DIGITE SUA NOTA [" + i + "] : ");
          notas[i] = entrada.nextDouble();
      }
      
      double somaTotal = notas[0] + notas[1] + notas[2];
      
      if((somaTotal / 3) > 60) {
          System.out.println(somaTotal / 3 + " :-)");
      }else{
        System.out.println(somaTotal / 3 + " :-(");
      }
    }
}
