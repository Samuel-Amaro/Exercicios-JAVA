package ID_1120;

import java.util.Scanner;

public class RevisaoContrato {
    
    public static void main(String[] args) {
        
        int d;
        long n;
        

        Scanner entrada = new Scanner(System.in);

        d = entrada.nextInt();
        System.out.printf("");
        n = entrada.nextLong();

        String nText = Long.toString(n);
        String dText = Integer.toString(d);
        char nChar = dText.charAt(0);
        char[] texto = new char[nText.length()];

        for(int i = 0; i < nText.length(); i++) {
            if(nText.charAt(i) == nChar) {
                //texto[i] = ' ';
            }else{
                texto[i] = nText.charAt(i);
            }
        }

       for(int i = 0; i < texto.length; i++) {
           System.out.print(texto[i]);
       }
    }
}
