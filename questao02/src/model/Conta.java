package model;

public class Conta {
    private String numero;
    private String nome_titular;
    protected double saldo;

    public Conta(String numero, String nome_titular) {
        this.numero = numero;
        this.nome_titular = nome_titular;
        this.saldo = 0;
    }

    public String getNome_titular() {
        return nome_titular;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valorSaque){
        if (valorSaque >= this.getSaldo()){
            return false;
        }
        this.saldo -= valorSaque;
        return true;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
}
