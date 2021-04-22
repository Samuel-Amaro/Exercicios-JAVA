package ID_1131;

import java.util.ArrayList;
import java.util.Scanner;

public class Grenal {
    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        int resposta = 1,contador = 0;

        ArrayList<Integer> golsGremio = new ArrayList<Integer>();
        ArrayList<Integer> golsInter = new ArrayList<Integer>();

        while(resposta < 2 && resposta > 0) {
            if(resposta == 1) {
                golsInter.add(entrada.nextInt()); 
                System.out.printf("");
                golsGremio.add(entrada.nextInt());
            }
            contador++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            resposta = entrada.nextInt();
        }

        int vitoriaInter = 0,vitoriaGremio = 0, empates = 0;
        for (int i = 0; i < golsInter.size(); i++) {
            if(golsInter.get(i) > golsGremio.get(i)) {
                //vitoria inter
                vitoriaInter = vitoriaInter + 1;
            }else if(golsGremio.get(i) > golsInter.get(i)) {
                //vitoria gremio
                vitoriaGremio = vitoriaGremio + 1;
            }else{
                //empate
                empates = empates + 1;
            }    
        }

        if(vitoriaGremio > vitoriaInter) {
            System.out.println(contador + " grenais");
            System.out.println("Inter: " + vitoriaInter);
            System.out.println("Gremio: " + vitoriaGremio);
            System.out.println("Empates: " + empates);
            System.out.println("Gremio cenceu mais");
        }else if(vitoriaGremio == vitoriaInter) {
           System.out.println(contador + " grenais");
           System.out.println("Inter: " + vitoriaInter);
           System.out.println("Gremio: " + vitoriaGremio);
           System.out.println("Empates: " + empates);
           System.out.println("Nao houve vencedor");
        }else {
           System.out.println(contador + " grenais");
           System.out.println("Inter: " + vitoriaInter);
           System.out.println("Gremio: " + vitoriaGremio);
           System.out.println("Empates: " + empates);
           System.out.println("Inter venceu mais");
        }



        
    }
}
