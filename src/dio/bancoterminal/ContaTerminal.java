package dio.bancoterminal;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();

        System.out.println("======Bradesco======");
        System.out.println("Obrigado por escolher o Banco Bradesco!");

        System.out.println("Por favor, digite o número da Agência !");
        conta.agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        conta.numConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite seu nome completo");
        conta.nomeCliente = sc.nextLine();

        System.out.println("Por ultimo, digite seu CPF");
        conta.cpf = sc.nextLine();

        System.out.println("Parabéns, sua conta foi criada com sucesso!");
        System.out.println("=====================");

        System.out.println("Olá " + conta.nomeCliente + " portador do cpf: " + conta.cpf + " seja bem vindo!");
        System.out.println("Sua Agencia é: " + conta.agencia + " e o numero da Conta é: " + conta.numConta);
        System.out.println("Digite a quantidade que deseja depositar na sua conta: ");

        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);

        System.out.println(conta.nomeCliente + " seu deposito foi realizado com sucesso!");
        System.out.println("Seu saldo atual é de: " + conta.saldo);
    }
}