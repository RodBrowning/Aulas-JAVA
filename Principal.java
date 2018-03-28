
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
      
        Scanner leia = new Scanner(System.in);
        
        Conta conta = new Conta();
        
        System.out.println("Criar nova conta");
        System.out.print("Digite o Saldo da Conta: ");
        double saldo = leia.nextDouble();
        conta.depositar(saldo);
        System.out.print("Digite o Limite da Conta: ");
        double limite = leia.nextDouble();
        conta.setLimite(limite);
        System.out.print("O saldo da conta e: ");
        System.out.println(saldo);
        System.out.print("O limite da conta e: ");
        System.out.println(limite);
    }
    
}
