package br.com.edu.ifg;

public class Paciente extends Pessoa {

    private int numeroConsultas = 0;

    public Paciente(String nome, String cpf, String[] msg) {
        super(nome, cpf, msg);
        
    }

    public int getNumeroConsultas() {
        return numeroConsultas;
    }

    public void setNumeroConsultas(int numeroConsultas) {
        this.numeroConsultas = numeroConsultas + this.numeroConsultas;
    }

    public synchronized void serMedicado() {
        //synchronized(this) {
        System.out.println("THREAD: " + Thread.currentThread().getName() + " " +  this.getNome() + " MEDICADO!");
        //}
    }



    
    
}
