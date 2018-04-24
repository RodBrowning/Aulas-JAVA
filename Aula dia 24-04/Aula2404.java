import aula.pkg24.pkg04.*;
import java.util.Scanner;

public class Aula2404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numero num = new Numero();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um Numero para instanciar o objeto: ");
        num.setNum(scan.nextInt());
        
        int menu =0;
        System.out.println("Escolha a opção:");
        System.out.println("1) Verificar maior: ");
        System.out.println("2) Verificar par ou impar:");
        menu = scan.nextInt();
        if(menu == 1){
            System.out.print("Digite um numero para verificar se é maior: ");
           num.maior(scan.nextInt());
        }else if(menu == 2){
            num.par_impar();
        }
    }
    
}
