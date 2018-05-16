package Livraria;

public class Produto {
    private String descricao;
    private String genero ;
    private int estoqueDisponivel;
    private double precoCusto;
    private double PrecoVenda;
    
    //Constructors
    public Produto()
        {
            this("","",0,0.0,0.0);
        }

    public Produto(String descricao, String genero, int estoqueDisponivel, double precoCusto, double PrecoVenda) {
        this.descricao = descricao;
        this.genero = genero;
        this.estoqueDisponivel = estoqueDisponivel;
        this.precoCusto = precoCusto;
        this.PrecoVenda = PrecoVenda;
    }

  
    //Methods   
    public void comprar(int qtde)
        {
            System.out.println("Estoque anterior: "+ this.getEstoqueDisponivel());
            System.out.println("Estoque anterior: "+ (this.getEstoqueDisponivel() + qtde));
        }
    
    public void vender(int qtde)
        {
            System.out.println("Estoque anterior: "+ this.getEstoqueDisponivel());
            System.out.println("Estoque anterior: "+ (this.getEstoqueDisponivel() - qtde));
        }
    
    public void calcularPreco()
        {
            
        }
    
    
//Getters and Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return PrecoVenda;
    }

    public void setPrecoVenda(double PrecoVenda) {
        this.PrecoVenda = PrecoVenda;
    }
    
    
}
