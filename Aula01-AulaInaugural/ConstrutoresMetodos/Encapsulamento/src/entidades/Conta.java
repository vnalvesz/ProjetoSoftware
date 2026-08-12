package entidades;

public class Conta {
    String nome;
    double saldo;
    String agencia;
    String conta;

    public Conta(String nome, double saldo, String agencia, String conta) {
        this.nome = nome;
        this.saldo = saldo;
        this.agencia = agencia;
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    @Override
    public String toString() {
        return "Conta{" +
                "\nnome='" + nome + '\'' +
                "\naldo=" + saldo +
                "\ngencia='" + agencia + '\'' +
                "\nconta='" + conta + '\'' +
                '}';
    }
}
