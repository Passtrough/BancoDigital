package BancoB.conta;

import BancoB.cliente.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println(" === Extrato Conta Poupança ===");
        imprimirInfo();
    }
}
