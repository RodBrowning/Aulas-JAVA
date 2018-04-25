package aula;


public class Numero {
    // Variables
    private int num;
    
    // Constructors
    public Numero(int num){
        this.num = num;
    }    
    public Numero(){
        this(1);
    }
    
    // Getters and Setters
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    
    public void maior(int x){
        if(this.num > x){
            System.out.println("Numero informado não é maior que o numero do objeto.");
        }else{
            System.out.println("Numero informado é maior que o numero de origem.");
        }
    }
    
    public void par_impar(){
        if(this.num % 2 == 0){
            System.out.println("Numero Par");
        }else{
            System.out.println("Numero Inpar");
        }
    } 
}
