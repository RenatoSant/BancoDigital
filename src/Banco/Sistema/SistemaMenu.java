package Banco.Sistema;

import Banco.Clientes.Cliente;
import Banco.Contas.ContaCorrente;
import Banco.Contas.ContaPoupanca;

import java.util.Random;
import java.util.Scanner;

public class SistemaMenu {



    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    RegistrodeContas registrodeContasCorrente = new RegistrodeContas();
    RegistrodePoupanca registrodeContasPoupanca = new RegistrodePoupanca();

    public void menuDepositoCorrente (double valor, String cpf){
        ContaCorrente contaCorrente = registrodeContasCorrente.contaCorrenteMap.get(cpf);
        contaCorrente.depositar(valor);
    }

    public void menuDepositoPoupanca (double valor, String cpf){
        ContaPoupanca contaPoupanca = registrodeContasPoupanca.contaPoupancaMap.get(cpf);
        contaPoupanca.depositar(valor);
    }

    public void menuDeposito (){
        System.out.println("Selecione uma opção:");
        System.out.println("1. Depositar na conta corrente");
        System.out.println("2. Depositar na conta poupança");
        System.out.println("3. Sair");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite seu cpf: ");
        System.out.println("Cpf: ");
        String cpf = scanner.nextLine();
        System.out.println("Valor a depositar: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        if (opcao == 1){
            menuDepositoCorrente(valor, cpf);
        }
        if (opcao == 2){
            menuDepositoPoupanca(valor, cpf);
        }
    }
    public void menuSacarCorrente(double valor, String cpf){
        ContaCorrente contaCorrente = registrodeContasCorrente.contaCorrenteMap.get(cpf);
        contaCorrente.sacar(valor);
    }
    public void menuSacarPoupanca(double valor, String cpf){
        ContaPoupanca contaPoupanca = registrodeContasPoupanca.contaPoupancaMap.get(cpf);
        contaPoupanca.sacar(valor);
    }
    public void menuSaque(){
        System.out.println("Selecione uma opção:");
        System.out.println("1. Sacar da conta corrente");
        System.out.println("2. Sacar da conta poupança");
        System.out.println("3. Sair");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite seu cpf: ");
        System.out.println("Cpf: ");
        String cpf = scanner.nextLine();
        System.out.println("Valor a sacar: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        if (opcao == 1){
            menuSacarCorrente(valor, cpf);
        }
        if (opcao == 2){
            menuSacarPoupanca(valor, cpf);
        }
    }

    public void menuExtrato(){
        System.out.println("Selecione uma opção:");
        System.out.println("1. Extrato da conta corrente");
        System.out.println("2. Extrato da conta poupança");
        System.out.println("3. Sair");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite seu cpf: ");
        System.out.println("Cpf: ");
        String cpf = scanner.nextLine();

        if (opcao == 1){
            registrodeContasCorrente.mostrarContaCorrente(cpf);
        }
        if (opcao == 2){
            ContaPoupanca contaPoupanca = registrodeContasPoupanca.contaPoupancaMap.get(cpf);
            contaPoupanca.extrato();
        }
    }
    public void menuCriarContaCorrente(){
        System.out.println("Por favor escreva seus dados: ");
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Cpf: ");
        String cpf = scanner.nextLine();
        int numeroConta = random.nextInt(10000);
        int numeroAgencia = random.nextInt(1000);
        Cliente cliente = new Cliente(nome, cpf);
        ContaCorrente contaCorrente = new ContaCorrente(cliente.getNome(),
                numeroConta, numeroAgencia);
        registrodeContasCorrente.adicionarContaCorrente(cliente, contaCorrente);
        System.out.println("Conta Corrente criada com sucesso!");
    }
    public void menuCriarContaPoupanca(){
        System.out.println("Por favor escreva seus dados: ");
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Cpf: ");
        String cpf = scanner.nextLine();
        int numeroConta = random.nextInt(10000);
        int numeroAgencia = random.nextInt(1000);
        Cliente cliente = new Cliente(nome, cpf);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente.getNome(),
                numeroConta, numeroAgencia);
        registrodeContasPoupanca.adicionarContaPoupanca(cliente, contaPoupanca);
    }

    public void menuCriarConta(){
        System.out.println("Selecione uma opção:");
        System.out.println("1. Criar conta corrente");
        System.out.println("2. Criar conta poupança");
        System.out.println("3. Sair");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1){
            menuCriarContaCorrente();
        }
        if (opcao == 2){
            menuCriarContaPoupanca();
        }
    }
}
