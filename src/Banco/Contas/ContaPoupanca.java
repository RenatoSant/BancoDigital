package Banco.Contas;

public class ContaPoupanca extends Conta {

    private final static double juros = 0.005; // 5% de juros


    public ContaPoupanca(String nomeCliente, int agencia, int numeroConta) {
        super(nomeCliente, agencia, numeroConta);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            double novoSaldo = getSaldo() + valor;
            setSaldo(novoSaldo);
            System.out.println("Depósito de " + valor + " realizado com sucesso. Novo saldo: " + novoSaldo);
            renderJuros();
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            System.out.println("Saque realizado com sucesso. Novo saldo: " + getSaldo());
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }

    }

    public void transferirContaPoupanca(ContaPoupanca contaOrigem, ContaPoupanca contaDestino, double valor) {
        if (valor > 0 && valor <= contaOrigem.getSaldo()) {
            double novoSaldoOrigem = contaOrigem.getSaldo() - valor;
            double novoSaldoDestino = contaDestino.getSaldo() + valor;
            contaOrigem.setSaldo(novoSaldoOrigem);
            contaDestino.setSaldo(novoSaldoDestino);
            System.out.println("Transferência de " + valor + " realizada com sucesso. Novo saldo: " + novoSaldoOrigem);
        } else {
            System.out.println("Valor de transferência inválido ou saldo insuficiente.");
        }
    }

    public void transferirPoupancaCorrente(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            renderJuros();
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositartransferencia(double valor){
        if (valor > 0) {
            double novoSaldo = getSaldo() + valor;
            setSaldo(novoSaldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }

    }

    public void renderJuros() {
        double jurosAcumulados = getSaldo() * juros;
        double novoSaldo = getSaldo() + jurosAcumulados;
        setSaldo(novoSaldo);
    }

    public void extrato() {
        System.out.println("Nome do Cliente: " + getNomeCliente());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Número da Conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Juros: " + juros);
    }
}
