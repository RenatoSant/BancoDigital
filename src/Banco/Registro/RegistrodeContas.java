package Banco.Registro;

import Banco.Clientes.Cliente;
import Banco.Contas.ContaCorrente;
import Banco.Contas.ContaPoupanca;

public class RegistrodeContas extends Registro{


    public RegistrodeContas() {
        super();
    }

    public void adicionarContaCorrente(Cliente cliente, ContaCorrente contaCorrente) {
        contaCorrenteMap.put(cliente.getCpf(), contaCorrente);
    }

    public void sacarContaCorrente(String string, double valor) {
        ContaCorrente contaCorrente = contaCorrenteMap.get(string);
        if (contaCorrente != null) {
            contaCorrente.sacar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void depositarContaCorrente(String string, double valor) {
        ContaCorrente contaCorrente = contaCorrenteMap.get(string);
        if (contaCorrente != null) {
            contaCorrente.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void transferirContaCorrente(String s,String string, double valor){
        ContaCorrente transferirConta = contaCorrenteMap.get(string);
        ContaCorrente contaTransferida = contaCorrenteMap.get(s);
        if (transferirConta != null) {
            transferirConta.transferirContaCorrente(contaTransferida,transferirConta, valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void transferirCorrentePoupanca(String string, double valor){
        ContaCorrente transferirConta = contaCorrenteMap.get(string);
        if (transferirConta != null) {
            transferirConta.transferirCorrentePoupanca(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void depositartransferencia(String string, double valor){
        ContaCorrente transferirConta = contaCorrenteMap.get(string);
        if (transferirConta != null) {
            transferirConta.depositartransferencia(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void removerContaCorrente(String string) {
        contaCorrenteMap.remove(string);
        System.out.println("Conta deletada com sucesso.");
    }

    public void mostrarContaCorrente(String string) {
        System.out.println(contaCorrenteMap.get(string));}



}
