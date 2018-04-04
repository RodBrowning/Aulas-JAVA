
package revisao;

public class Professor {
    private String nome;
    private String telefone;
    private float valorHoraAula;
    
    //Methods
    public void cadastro(){
        
    }
    
    //Getters and Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setValorHoraAula(float valorHoraAula){
        this.valorHoraAula = valorHoraAula;
    }
    public float getValorHoraAula(){
        return this.valorHoraAula;
    }
    
}
