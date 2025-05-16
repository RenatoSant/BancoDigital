package Banco.Registro;

import Banco.Contas.ContaCorrente;
import Banco.Contas.ContaPoupanca;

import java.util.HashMap;
import java.util.Map;

public class Registro {

    Map<String, ContaCorrente> contaCorrenteMap;
    Map<String, ContaPoupanca> contaPoupancaMap;

    public Registro() {
        this.contaCorrenteMap = new HashMap<>();
        this.contaPoupancaMap = new HashMap<>();
    }
}
