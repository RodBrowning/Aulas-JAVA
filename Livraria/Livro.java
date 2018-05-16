
package Livraria;

public class Livro extends Produto{
    private String autor;
    private String editora;
    private String edicao;

    public Livro() {
        this("","","","","",0,0.0,0.0);
    }

    public Livro(String autor, String editora, String edicao, String descricao, String genero, int estoqueDisponivel, double precoCusto, double PrecoVenda) {
        super(descricao, genero, estoqueDisponivel, precoCusto, PrecoVenda);
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
    }
    
        
    //Methods 
    public void listarProdutos()
        {
            System.out.println(
                "Autor: "+ this.getAutor()+
                " Editora: "+ this.getDescricao()+
                " Edicao: "+ this.getEdicao()
            );
        }

    
    //Getters and Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
        
    
}
