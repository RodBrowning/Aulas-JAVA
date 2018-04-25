import aula.*;
import java.util.Scanner;

public class Aula {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int menu = 0;
        
        Numero num = new Numero();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero para instanciar o objeto: ");
        num.setNum(scan.nextInt());
        
        System.out.println("Escolha a opção:");
        System.out.println("1) Verificar maior: ");
        System.out.println("2) Verificar par ou impar:");
        menu = scan.nextInt();
        
        if(menu == 1){
            System.out.print("Digite um numero para verificar se é maior: ");
           num.maior(scan.nextInt());
        }else if(menu == 2){
            num.par_impar();
        }else{
            System.out.println("A opção selecionara é invalida.");
        }
        
        int idadeCompetidor = 0;
        
        System.out.print("Digite a idade do competidor: ");
        idadeCompetidor = scan.nextInt();
        Competidor comp = new Competidor(idadeCompetidor);
        String categoria = comp.verificarCategoria();
        
        if("Idade invalida".equals(categoria)){
            System.out.println(categoria);
        }else{
            System.out.println("O competidor é da categoria: "+categoria);
        }
        
        
    }
    
}
