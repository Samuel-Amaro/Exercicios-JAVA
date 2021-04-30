import br.com.ifg.Endereco;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        //proprietario de um carro
        Proprietario p1 = new Proprietario("Dilera", "000.000.000-1", "0921-091-1");

        //endereço do dono do carro
        Endereco end = new Endereco("rua sabia", "jardim triângulo", "luziania", "GO", "43849-101", "perto do corpo de bombeiros");

        //MARCA DO VEICULO
        Marca m = new Marca();
        m.setNome("Wolkswagem");
        m.setAnoDeLancamento(2010);
        m.setNrDeModelos(5);
        m.setCodigoIdentificador(3201);

        //o veiculo
        Carro c = new Carro(p1, m);

        //usando o carro
        c.exibirVolumeCombustivel();

        c.engatarMarchaRe();

        c.calculaAutonomiaViagem(100,36, 5.15, 300);


    }
}
