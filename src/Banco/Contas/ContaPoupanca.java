package Banco.Contas;

public class ContaPoupanca extends Conta {

    private final static double juros = 0.05; // 5% de juros


    public ContaPoupanca(String nomeCliente, int agencia, int numeroConta) {
        super(nomeCliente, agencia, numeroConta);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            double novoSaldo = getSaldo() + valor;
            setSaldo(novoSaldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    public void transferirContaCorrente(ContaCorrente contaDestino, double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Valor de transferência inválido ou saldo insuficiente.");
        }
    }

    public void transferirContaPoupanca(ContaPoupanca contaDestino, double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Valor de transferência inválido ou saldo insuficiente.");
        }
    }

    public void extrato() {
        System.out.println("Nome do Cliente: " + getNomeCliente());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Número da Conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
}
