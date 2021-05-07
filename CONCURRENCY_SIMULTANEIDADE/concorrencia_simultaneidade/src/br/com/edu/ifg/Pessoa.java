package br.com.edu.ifg;

public class Pessoa implements Runnable{
   
    private String nome;
    private String cpf;
    private String[] msg;

    public Pessoa(String nome, String cpf, String[] msg) {
        this.nome = nome;
        this.cpf = cpf;
        this.msg = msg;
    }

    public void falar(String[] mensagem) {
        //mensagem vazia
        if(mensagem.length == 0) {
            System.out.println("Pessoa: " + this.nome + "Não quer falar!");
        }else{
            for (String string : mensagem) {
                System.out.println("-------------------------------------------------------------");
                System.out.println(string);
                System.out.println("-------------------------------------------------------------");    
            }
            
        }
    }

    public synchronized String getNome() {
        return nome;
    }

    public synchronized void setNome(String nome) {
        this.nome = nome;
    }

    public synchronized String getCpf() {
        return cpf;
    }

    public synchronized void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void run() {
       falar(this.msg); 
    }

    
}
