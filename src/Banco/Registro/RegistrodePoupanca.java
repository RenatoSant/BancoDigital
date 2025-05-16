package Banco.Registro;

import Banco.Clientes.Cliente;
import Banco.Contas.ContaCorrente;
import Banco.Contas.ContaPoupanca;

public class RegistrodePoupanca extends Registro {


    public RegistrodePoupanca() {
        super();
    }

    public void adicionarContaPoupanca(Cliente cliente, ContaPoupanca contaPoupanca) {
        contaPoupancaMap.put(cliente.getCpf(), contaPoupanca);
    }

    public void sacarContaPoupanca(String string, double valor) {
        ContaPoupanca contaPoupanca = contaPoupancaMap.get(string);
        if (contaPoupanca != null) {
            contaPoupanca.sacar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void depositarContaPoupanca(String string, double valor) {
        ContaPoupanca contaPoupanca = contaPoupancaMap.get(string);
        if (contaPoupanca != null) {
            contaPoupanca.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void transferirContaPoupanca(String s ,String string, double valor){
        ContaPoupanca transferirConta = contaPoupancaMap.get(string);
        ContaPoupanca contaTransferida = contaPoupancaMap.get(s);
        if (transferirConta != null) {
            transferirConta.transferirContaPoupanca(contaTransferida,transferirConta, valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void transferirPoupancaCorrente(String string, double valor){
        ContaPoupanca transferirConta = contaPoupancaMap.get(string);
        if (transferirConta != null) {
            transferirConta.transferirPoupancaCorrente(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void depositartransferencia(String string, double valor){
        ContaPoupanca transferirConta = contaPoupancaMap.get(string);
        if (transferirConta != null) {
            transferirConta.depositartransferencia(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void removerContaPoupanca(String string) {
        contaPoupancaMap.remove(string);
        System.out.println("Conta deletada com sucesso.");
    }

    public void mostrarContaPoupanca(String string) {
        ContaPoupanca contaPoupanca = contaPoupancaMap.get(string);
        contaPoupanca.extrato();
    }

}
