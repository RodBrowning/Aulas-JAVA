
package Livraria;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
      Produto prod;
      
      Scanner scan = new Scanner(System.in);
      int menu = 0;
      System.out.println("Escolha opção:"
        + "\n -Livro"
        + "\n -CD"
        + "\n -DVD");
      menu = scan.nextInt();
      
      switch(menu)
        {
          case 1:
               prod = new Livro();
               break;
          case 2:
               prod = new DVD();
               break;
          case 3:
               prod = new CD();
               break;
          default:
              System.out.println("Some error occured");
        }
        
    }
    
}
