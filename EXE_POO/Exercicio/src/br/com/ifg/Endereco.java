public class Endereco {
    
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;

    public Endereco(String ruaP, String bairroP, String cidadeP, String estadoP, String cepP, String complementoP) {
        this.bairro = bairroP;
        this.rua = ruaP;
        this.complemento = complementoP;
        this.estado = estadoP;
        this.cep = cepP;
        this.estado = estadoP;
    }


    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
}
