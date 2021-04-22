package ID_1237;

import java.util.ArrayList;
import java.util.Scanner;

public class ComparacaoSubstrings {
    
    public static void main(String[] args) {

        //input
        Scanner entrada = new Scanner(System.in);
        String str1 = entrada.nextLine();
        String str2 = entrada.nextLine();

        //armazena string como caracters
        char[] arrayStr1 = new char[str1.length()];
        char[] arrayStr2 = new char[str2.length()];
        ArrayList<Character> substring = new ArrayList<Character>();
        for (int i = 0; i < arrayStr1.length; i++) {
            arrayStr1[i] = str1.charAt(i);
            if(i >= 50) 
               break; 
        }
        for (int i = 0; i < arrayStr2.length; i++) {
            arrayStr2[i] = str2.charAt(i);
            if(i >= 50) 
               break; 
        }

        //strings que possui espaço
        String[] stringCortada1 = str1.split(" ");
        String[] stringCortada2 = str2.split(" ");

        //verifica se estrings são iguais
        if(str1.equals(str2)) {
            System.out.print(str1.length());
        }else if(stringCortada1.length > 0){
            //string possui espaços em branco
            for (int i = 0; i < stringCortada1.length; i++) {
                for (int j = 0; j < stringCortada2.length; j++) {
                      if(stringCortada1[i].equals(stringCortada2[j])) {
                          //substring.add(stringCortada1[i]);
                          for (String string : stringCortada1[i]) {
                              
                          }
                          String[] t = String.valueOf();
                      } else {
                          //faz nada
                      }                         
                }
            }
        }
        else{
            //não são iguais
            for(int i = 0; i < arrayStr1.length; i++) {
                for(int j = 0; j < arrayStr2.length; j++) {
                    if(arrayStr1[i] == arrayStr2[j]) {
                        substring.add(arrayStr1[i]);
                    }
                }
            }
        }

        /*
        for(String string : stringCortada) {
             System.out.println(string);   
        }*/

        System.out.println(substring.size());
        
    }
    
}
