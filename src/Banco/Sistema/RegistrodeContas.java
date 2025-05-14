package Banco.Sistema;

import Banco.Clientes.Cliente;
import Banco.Contas.ContaCorrente;

import java.util.HashMap;
import java.util.Map;

public class RegistrodeContas {

    Map<String, ContaCorrente> contaCorrenteMap;


    public RegistrodeContas() {
        this.contaCorrenteMap = new HashMap<>();
    }

    public void adicionarContaCorrente(Cliente cliente, ContaCorrente contaCorrente) {
        contaCorrenteMap.put(cliente.getCpf(), contaCorrente);
    }


    public void removerContaCorrente(Cliente cliente) {
        contaCorrenteMap.remove(cliente.getCpf());
    }

    public void mostrarContaCorrente(String string) {
        System.out.println(contaCorrenteMap.get(string));}



}
