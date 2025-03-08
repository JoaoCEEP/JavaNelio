package entities;

public class bank {
    private int numeroConta;
    private String nome;
    private double depositoInicial;
    private double saldo;
    private char verificacao;

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
        this.saldo = depositoInicial;
    }

    public char getVerificacao() {
        return verificacao;
    }

    public void setVerificacao(char verificacao) {
        this.verificacao = verificacao;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return """
                Updated account data: 
                Account  """ + numeroConta + ", Holder: " + nome + ", Balance: " + saldo;
    }

    public int numero (int numeroConta){
        return this.numeroConta = numeroConta;
    }

    public void deposito (double valor) {
        this.saldo += valor;
    }

    public void saque (double valor) {
        this.saldo -= valor + 5;
    }
}
