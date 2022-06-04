package classes;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;

    public Conta() {
    }

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public Conta(int numero, String nome, double depInicial) {
        this.numero = numero;
        this.nome = nome;
        deposito(depInicial);
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public void saque(double valor){
        this.saldo -= valor + 5.00;
    }

    @Override
    public String toString() {
        return "Conta [nome=" + nome + ", numero=" + numero + ", saldo=" + saldo + "]";
    }

    

}
