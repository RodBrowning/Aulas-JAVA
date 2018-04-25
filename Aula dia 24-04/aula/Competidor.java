
package aula;

/**
 *
 * @author FSB
 */
public class Competidor {
    private int idade;
    
    public Competidor(){
        this(10);
    }
    public Competidor(int idade){
        this.idade = idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    
    public String verificarCategoria(){        
        
        String message = "";
        
        if(this.idade < 10 || this.idade > 99){
            message = "Idade invalida";
        }else if(this.idade >= 10 && this.idade <= 12){
            message = "Infantil";            
        }else if(this.idade >= 14 && this.idade <= 16){
            message = "Juvenil";
        }else if(this.idade >= 17 && this.idade <= 20){
            message = "Junior";
        }else if(this.idade >= 21 && this.idade <= 30){
            message = "Adulto";
        }else if(this.idade >= 31 && this.idade <= 99){
            message = "Veterano";
        }
        
        return message;
    }
    
        
}
