
package Livraria;

public class CD extends Produto{
    private String artista;
    private String gravadora;
    private String paisOrigem;

    //Constructors
    public CD() 
        {
            this("","","","","",0,0.0,0.0);
        }

    public CD(String artista, String gravadora, String paisOrigem, String descricao, String genero, int estoqueDisponivel, double precoCusto, double PrecoVenda) {
        super(descricao, genero, estoqueDisponivel, precoCusto, PrecoVenda);
        this.artista = artista;
        this.gravadora = gravadora;
        this.paisOrigem = paisOrigem;
    }
    
    
    //Methods
    public void listarProdutos()
        {
            System.out.println(
                "Artista: "+ this.getArtista() +
                " Descricao: " + this.getDescricao()
            );
        }

    
    //Getters and Setters
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    
    
}
