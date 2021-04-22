package ID_1174;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe array que cria um array que pode armazenar qualquer tipo de valor, e uma classe parametrizada que tem um parametro de tipo TYPE pode ser qualquer tipo
 */
public class Array<T>{
    
    //ARRAY GENERICO DO TIPO TYPE(QUALQUER TIPO)
    //public List<T> arrayGenerico = null;
    public T[] arrayGenerico;
    private int tamanho;
    private int ultimaPosicaoArray;
    private ArrayList<Integer> arrayInteiros;
    private ArrayList<Float>  arrayFloats;
    private ArrayList<Double> arrayDoubles;
    private int contadorInteger = 0;
    private int contadorFloat = 0;
    private int contadorDouble = 0;
    private ArrayList<Object> arrayNumerosMenoresElem;


    public Array(int tamanho) {
        //ARRAY GENERICO SENDO CRIADO COM UMA INSTANCIA DE OBJECT QUE PODE SER QUALQUER CLASSE JA PRE-DEFINIDA OU ESCRITA A MÃO
        //CRIA UM ARRAY DE OBJECT COM A QUANTIDADE DE POSIÇÕES DEFINIDAS E LOGO DEPOIS FAZ UM CAST PARA UM ARRAY DE TIPO PARAMETRIZADO TYPE, QUE E UM ARRAY GENERICO
        arrayGenerico = (T[])new Object[tamanho];
        this.tamanho = tamanho;
    }

    /**
     * este metodo retorna um valor de uma posiçaõ especificada
     * @param indice
     * @return
     */
    public T getArrayGenerico(int indice) {
        return this.arrayGenerico[indice];
        //return arrayGenerico.get(indice);
    }

    /**
     * este metodo seta um novo valor no array em uma posição especificada
     * @param valor
     * @param indice
     */
    public void setArrayGenerico(T valor, int indice) {
        //array tem elementos
        arrayGenerico[indice] = valor;
        this.ultimaPosicaoArray = indice;
        //arrayGenerico.set(indice,valor);
        //arrayGenerico.add(valor); 
    }

    public void imprimeLista() {
        for (int i = 0; i < arrayGenerico.length; i++) {
            System.out.println(arrayGenerico[i]);
        }
        /*for (T t : arrayGenerico) {
            System.out.println(t);
        }*/
    }

    public void trataTipos() {
        for(int i = 0; i < arrayGenerico.length; i++) {
            if(arrayGenerico[i] instanceof java.lang.Integer) {
                //System.out.println("CLASSE INTEGER");
                this.contadorInteger++;
            }else if(arrayGenerico[i] instanceof java.lang.Float) {
                //System.out.println("CLASSE FLOAT");
                this.contadorFloat++;
            }else if(arrayGenerico[i] instanceof java.lang.Double){
                //System.out.println("CLASSE DOUBLE");
                contadorDouble++;
            }
        }
    }

    public void trataArrays() {
        
        this.arrayInteiros = new ArrayList<Integer>(this.contadorInteger);
        this.arrayFloats = new ArrayList<Float>(this.contadorFloat);
        this.arrayDoubles = new ArrayList<Double>(this.contadorDouble);

    }

    public void pegaValoresAndArmazena() {
        for(int i = 0; i < arrayGenerico.length; i++) {
            if(arrayGenerico[i] instanceof java.lang.Integer) {
                this.arrayInteiros.add((Integer)arrayGenerico[i]);
                //System.out.println("CLASSE INTEGER");
                //this.contadorInteger++;
            }else if(arrayGenerico[i] instanceof java.lang.Float) {
                this.arrayFloats.add((Float)arrayGenerico[i]);
                //System.out.println("CLASSE FLOAT");
                //this.contadorFloat++;
            }else if(arrayGenerico[i] instanceof java.lang.Double){
                this.arrayDoubles.add((Double)arrayGenerico[i]);
                //System.out.println("CLASSE DOUBLE");
                //contadorDouble++;
            }
        }
    }

    public void imprimeArraysTratados() {
        System.out.println("############# ARRAY DE INTEIROS ###############");
        for (int i = 0; i < this.arrayInteiros.size(); i++) {
            System.out.println(arrayInteiros.get(i) + " ");
        }
        System.out.println("############# ARRAY DE FLOATS ###############");
        for (int i = 0; i < this.arrayFloats.size(); i++) {
            System.out.println(arrayFloats.get(i) + " ");
        }
        System.out.println("############# ARRAY DE DOUBLES ###############");
        for (int i = 0; i < this.arrayDoubles.size(); i++) {
            System.out.println(arrayDoubles.get(i) + " ");
        }
    }

    public void menorQue(int valor) {
        
        this.arrayNumerosMenoresElem = new ArrayList<Object>();

        //numeros reais de dupla precisão menores que 10
        for (Double double1 : arrayDoubles) {
             if(double1 <= valor) {
                this.arrayNumerosMenoresElem.add(double1);
             }   
        }

        //numeros reais float menores que 10
        for (Float float1 : arrayFloats) {
             if(float1 <= valor) {
                this.arrayNumerosMenoresElem.add(float1);
             }   
        }

        //numeros inteiros menores que 10
        for (Integer int1 : arrayInteiros) {
            if(int1 <= valor) {
                this.arrayNumerosMenoresElem.add(int1);
            }
        }
        
    }

    public void imprimeValoresMenores() {
        for (int i = 0; i < arrayNumerosMenoresElem.size(); i++) {
            System.out.printf("A[" + i + "] = " + arrayNumerosMenoresElem.get(i) + "\n");
        }
    }



       
}
