package br.com.edu.ifg;

public class Doutor extends Pessoa {

    private String especializacao;
    private String[] relatoPaciente;

    public Doutor(String nome, String cpf, String espe, String[] relato) {
        //chama o construtor de Pessoa
        super(nome, cpf, new String[0]);

        this.especializacao = espe;
        
        this.relatoPaciente = relato;

    }

    public void consulta(String[] relatoPaci) {
        if (relatoPaci.length == 0) {
            System.out.println("PACIENTE NÃO FALOU NADA!");
        }else{
            for (String string : relatoPaci) {
                System.out.println("-----------------------------------------------------------------------");
                //se a thread for interropida
                if(Thread.interrupted()) {
                    System.out.println("Thread interropida!");
                }
                System.out.println("DOUTOR: " + this.getNome() + " OUVINDO PACIENTE FALAR: " + string);
                System.out.println("---------------------------------------------------------------------");      
            }
            
        }
        
    }

    public String getEspecializacao() {
        return especializacao;
    }


    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public void run() {
      consulta(this.relatoPaciente
      );
    }

    public void information() {
        System.out.println("NOME: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("ESPECIALIZAÇÃO: " + this.getEspecializacao());
    }

    public synchronized void threadAtual() {
        //synchronized(this) {
        System.out.println("THREAD: " + Thread.currentThread().getName() + " " +  this.getNome() + " executou");
        //}
    }
    
    
}
