package revisao;
import java.util.Scanner;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private String conteudoProgramatico;
    private float valorTotal;
    
    //Constructors
    public Curso(String nome, int cargaHoraria, String conteudoProgramatico, float valorTotal){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.conteudoProgramatico = conteudoProgramatico;
        this.valorTotal = valorTotal;
    }
    
    public Curso(){
        this("Java", 30, "Learn Java in raw code!", 500);
    }
    
    //Methods
    
    public void cadastrar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do curso:");
        this.setNome(scan.nextLine());
        System.out.println("Digite a carga horaria:");
        this.setCargaHoraria(scan.nextInt());
        System.out.println("Digite o conteudo programatico do curso:");
        this.setConteudoProgramatico(scan.nextLine());
        System.out.println("Digite o valor total do curso:");
        this.setValorTotal(scan.nextFloat());
    }
    
    public float calcularHoraCurso(){
        return this.getCargaHoraria()/ this.getValorTotal();
    }
            
    public void calcularTempoCurso(int horasDias){
        float tempo = this.getCargaHoraria()/horasDias;
        System.out.println("Tempo do curso = "+ tempo);
    }
    
    // Encapsulamento Getters and Setters
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getName(){
        return this.nome;
    }
    
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }    
    public int getCargaHoraria(){
        return this.cargaHoraria;
    }
    
    public void setConteudoProgramatico(String conteudoProgramatico){
        this.conteudoProgramatico = conteudoProgramatico;
    }    
    public String getConteudoProgramatico(){
        return this.conteudoProgramatico;
    }
    
    public void setValorTotal(float valorTotal){
        this.valorTotal = valorTotal;
    }
    public float getValorTotal(){
        return this.valorTotal;
    }
    /*
    private float valorTotal;*/
}
