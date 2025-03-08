package entities;

public class house {
    public String nome;
    public String email;
    public int quarto;

    public house(String name, String endereco, int room){
        this.nome = name;
        this.email = endereco;
        this.quarto = room;
    }

    public String toString() {
        return nome + ", " + email;
    }
}
