import br.com.edu.ifg.Doutor;
import br.com.edu.ifg.Paciente;
import br.com.edu.ifg.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        String str = " ";//"Lorem ipsum nulla"; //libero himenaeos convallis libero viverra et netus, aliquet tempor consequat non ut neque scelerisque. proin neque ipsum varius volutpat ut hendrerit imperdiet venenatis sem, per neque porta scelerisque fermentum purus lobortis ante fames, mollis fermentum erat nam potenti nec quisque suspendisse.";

        String[] relatoPaciente = str.split(" ");
        
       Doutor d1 =  new Doutor("afonso", "555.666.222-00", "clinico geral", relatoPaciente);
       Thread t2 = new Thread(d1);
       t2.start();

       Paciente p1 = new Paciente("Amadeu", "000.111.222.-33", relatoPaciente); 
       Thread t1 = new Thread(d1);
       t1.start();

       d1.information();
       d1.setCpf("012.321.091-34");
       d1.setNome("Miguel");
       d1.information();
       d1.threadAtual();
       
       System.out.println("CLASS THREAD T1: " + t1.getClass().getName());
       


       

       
    }
}
