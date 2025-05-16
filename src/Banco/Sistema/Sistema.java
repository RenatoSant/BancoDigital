package Banco.Sistema;

import Banco.Clientes.Cliente;
import Banco.Contas.ContaCorrente;
import Banco.Contas.ContaPoupanca;

import java.util.Random;
import java.util.Scanner;

public class Sistema extends SistemaMenu{


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
        System.out.println("1. Criar conta");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Extrato Bancario");
        System.out.println("5. Transferir");
        System.out.println("6. Deletar conta");
        System.out.println("7. Sair");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao ==  1){
            menuCriarConta();
        }
        if (opcao == 2){
            menuDeposito();
        }
        if (opcao == 3){
            menuSaque();
        }
        if (opcao == 4){
            menuExtrato();
        }
        if (opcao == 5){
            menuTransferir();
        }
        if (opcao == 6){
            menuDeletarConta();
        }
        if(opcao == 7){
            System.out.println("Saindo do sistema...");

        }
    }

}
