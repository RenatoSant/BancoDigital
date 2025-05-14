package Banco.Sistema;

import Banco.Clientes.Cliente;
import Banco.Contas.ContaCorrente;
import Banco.Contas.ContaPoupanca;

import java.util.Random;
import java.util.Scanner;

public class Sistema {

     Scanner scanner = new Scanner(System.in);
     Random random = new Random();
    RegistrodeContas registrodeContasCorrente = new RegistrodeContas();
    RegistrodePoupanca registrodeContasPoupanca = new RegistrodePoupanca();

    public void iniciarSistema(){
        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.println("Deseja usar nossos serviços? (sim/não)");
        String resposta = scanner.nextLine();
        while (resposta.equalsIgnoreCase("sim")) {
            menu();
            System.out.println("Deseja continuar? (sim/não)");
            resposta = scanner.nextLine();
        }
        System.out.println("Obrigado por usar nosso sistema!");

    }

    public void menu(){
        System.out.println("Selecione uma opção:");
        System.out.println("1. Criar conta corrente");
        System.out.println("2. Criar conta poupança");
        System.out.println("3. Depositar");
        System.out.println("4. Sacar");
        System.out.println("5. Extrato Conta Corrente");
        System.out.println("6. Extrato Conta Poupança");
        System.out.println("7. Transferir");
        System.out.println("8. Sair");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao ==  1){

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
        if (opcao == 2){
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
        if (opcao == 3){
            System.out.println("Digite seu cpf: ");
            System.out.println("Cpf: ");
            String cpf = scanner.nextLine();
            System.out.println("Valor a depositar: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();
            ContaCorrente contaCorrente = registrodeContasCorrente.contaCorrenteMap.get(cpf);
            contaCorrente.depositar(valor);
        }
        if (opcao == 5){
            System.out.println("Digite seu cpf: ");
            System.out.println("Cpf: ");
            String cpf = scanner.nextLine();
            registrodeContasCorrente.mostrarContaCorrente(cpf);
        }
        if(opcao == 8){
            System.out.println("Saindo do sistema...");

        }
    }
}
