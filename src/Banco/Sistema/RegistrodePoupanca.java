package Banco.Sistema;

import Banco.Clientes.Cliente;
import Banco.Contas.ContaCorrente;
import Banco.Contas.ContaPoupanca;

import java.util.HashMap;
import java.util.Map;

public class RegistrodePoupanca {

    Map<String, ContaPoupanca> contaPoupancaMap;

    public RegistrodePoupanca() {
        this.contaPoupancaMap = new HashMap<>();
    }

    public void adicionarContaPoupanca(Cliente cliente, ContaPoupanca contaPoupanca) {
        contaPoupancaMap.put(cliente.getCpf(), contaPoupanca);
    }


    public void removerContaPoupanca(Cliente cliente) {
        contaPoupancaMap.remove(cliente.getCpf());
    }

    public void mostrarContaPoupanca(String string) {
        System.out.println(contaPoupancaMap.get(string));}

}
