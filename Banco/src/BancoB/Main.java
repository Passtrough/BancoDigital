package BancoB;

import BancoB.cliente.Cliente;
import BancoB.conta.Conta;
import BancoB.conta.ContaCorrente;
import BancoB.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel");

        Conta cc = new ContaCorrente(gabriel);
        Conta poupanca = new ContaPoupanca(gabriel);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
