
package revisao;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
      Curso curso = new Curso();
      curso.cadastrar();
      System.out.println("Valor por hora: "+ curso.calcularHoraCurso());
      System.out.println("Digite quantas horas por dia: ");      
      Scanner scan = new Scanner(System.in);
      curso.calcularTempoCurso(scan.nextInt());
    }
    
}
