package entities;

public class student {
    public String nome;
    public double nota1;
    public double nota2;
    public double media;

    public student (String name, double nota1, double nota2){
        this.nome = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcMedia() {
        this.media = (nota1 + nota2) / 2;
        return this.media;
    }

    public void aprovado() {
        if (calcMedia() >= 6) {
            System.out.println(this.nome);
        }
        return;
    }
}
