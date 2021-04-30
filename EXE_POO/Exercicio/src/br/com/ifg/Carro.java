public class Carro {
    
    private String modelo;
    private String cor;
    private int ano;
    private String chassi;
    private Proprietario proprietario;
    private int velocidadeMaxima;
    private int numeroDePortas;
    private boolean temTetoSolar;
    private int numeroMarchas;
    private boolean temCambioAutomatico;
    private int volumeCombustivel;
    private int velocidadeAtual;
    private int marchaAtual;
    private Marca marcaVeiculo;

    public Carro(Proprietario propP, Marca m) {
        this.proprietario = propP;
        this.marcaVeiculo = m;
    }

    public void calculaAutonomiaViagem(int distanciaPercorrida, int qtdLitrosUtilizada, double valorMedioCombustivel, int distanciaAteDestino) {
        //valores não podem ser zeros
        if(distanciaPercorrida > 0 && qtdLitrosUtilizada > 0 && valorMedioCombustivel > 0 && distanciaAteDestino > 0) {
            double consumoMedio = distanciaPercorrida / qtdLitrosUtilizada;
            System.out.println("#####CONSUMO MEDIO#####");
            System.out.println("CM = " + consumoMedio);
            double combustivelNecessario = distanciaAteDestino/consumoMedio;
            System.out.println("#####COMBUSTIVEL NECESSARIO PARA A VIAGEM#####");
            System.out.println("CN = " + combustivelNecessario);
            double valorTotalCombustivel = combustivelNecessario * valorMedioCombustivel;
            System.out.println("######VALOR TOTAL COMBUSTIVEL#####");
            System.out.println("VTC = " + valorTotalCombustivel);
        }else{
            System.err.println("INFORMAÇÕES NECESSARAIAS NÃO INFORMADAS!");
        }
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public Marca getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(Marca marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public void exibirVolumeCombustivel() {
        if(volumeCombustivel <= 0) {
            System.err.println("TANQUE VAZIO!");
        }else{
            System.out.println("VOLUME COMBUSTIVEL = " + this.volumeCombustivel + "L");
        }
    }

    public void acelera() {
        //velocidade não iniciada
        if(this.velocidadeAtual != 0) {  
          this.velocidadeAtual = 0;
          this.velocidadeAtual += 1;
        }else{
            this.velocidadeAtual += 1;
        }
    }

    public void freia() {
        this.velocidadeAtual = 0;
    }

    public void trocaMarcha() {
        //engatando primeira marcha
        if(this.marchaAtual != 0) {
           this.marchaAtual = 0;
           this.marchaAtual += 1; 
        }else{
            this.marchaAtual += 1;
        }
    }

    public void engatarMarchaRe() {
        if(this.velocidadeAtual > 0) {
            System.err.println("marcha ré não engatada");
        }else{
            System.out.println("engatando marchar re");
        }
    }

    public void reduzMarcha() {
        this.marchaAtual -= 1;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public boolean isTemTetoSolar() {
        return temTetoSolar;
    }

    public void setTemTetoSolar(boolean temTetoSolar) {
        this.temTetoSolar = temTetoSolar;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public boolean isTemCambioAutomatico() {
        return temCambioAutomatico;
    }

    public void setTemCambioAutomatico(boolean temCambioAutomatico) {
        this.temCambioAutomatico = temCambioAutomatico;
    }

    public int getVolumeCombustivel() {
        return volumeCombustivel;
    }

    public void setVolumeCombustivel(int volumeCombustivel) {
        this.volumeCombustivel = volumeCombustivel;
    }

    
}
