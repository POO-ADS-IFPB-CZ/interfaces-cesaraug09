package view;
import model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca conta = new ContaPoupanca("3001", "César Augusto");
        conta.depositar(1000);
        System.out.println("Saldo inicial: " + conta.getSaldo());
        // Lembrando que o valorReajuste de 1 = 100%, e se for quebrar o valor use vírgula
        int valorReajuste = 1;
        conta.reajustar(valorReajuste);
        System.out.println("Saldo após reajuste: " + conta.getSaldo());
    }
}
