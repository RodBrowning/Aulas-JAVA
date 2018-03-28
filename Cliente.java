
public class Cliente {
    
    String nome;
    String cpf;
    
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void setNome(String nome, String cpf){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public String getCPF(){
        return cpf;
    }
    
    
    
    public boolean validarCPF(String Cpf){
        return true;
        
    }
    
}
