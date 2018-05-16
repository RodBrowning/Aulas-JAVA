package Livraria;

public class DVD extends Produto{
    private String diretor;
    private String duracao;
    private String censura;

    
    //Constructors
    public DVD() 
        {
            this("","","","","",0,0.0,0.0);
        }

    public DVD(String diretor, String duracao, String censura, String descricao, String genero, int estoqueDisponivel, double precoCusto, double PrecoVenda) {
        super(descricao, genero, estoqueDisponivel, precoCusto, PrecoVenda);
        this.diretor = diretor;
        this.duracao = duracao;
        this.censura = censura;
    }

    
    //Methods 
    public void listarProdutos()
        {
            System.out.println(
                "Diretor: "+ this.getDiretor()+
                " Duracao: "+ this.getDuracao()+
                " Censura: "+ this.getCensura()
            );
        }
    
    
    //Getters and Setters
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCensura() {
        return censura;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }
    
}
