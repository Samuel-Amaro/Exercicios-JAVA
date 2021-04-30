public class Proprietario {
    
    private String nome;
    private String cpf;
    private String rg;
    private String dataNascimento;
    

    public Proprietario(String nomeP, String cpfP, String rgP) {
        this.nome = nomeP;
        this.cpf = cpfP;
        this.rg = rgP;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
