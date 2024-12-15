package model;

public class ContaPoupanca extends Conta implements Investimento{


    public ContaPoupanca(String numero, String nome_titular) {
        super(numero, nome_titular);
    }

    @Override
    public void reajustar(double percentual){
        double saldo = this.getSaldo();
        double reajuste = saldo * percentual;
        this.depositar(reajuste);
    }

}
