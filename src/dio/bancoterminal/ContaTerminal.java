package dio.bancoterminal;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();

        System.out.println("======Bradesco======");
        System.out.println("Obrigado por escolher o Banco Bradesco!");

        System.out.println("Por favor, digite o número da Agência !");
        conta.setAgencia(sc.nextLine());

        System.out.println("Por favor, digite o número da Conta !");
        conta.setNumConta(sc.nextInt());
        sc.nextLine();

        System.out.println("Por favor, digite seu nome completo");
        conta.setNomeCliente(sc.nextLine());

        System.out.println("Por ultimo, digite seu CPF");
        conta.setCpf(sc.nextLine());

        System.out.println("Parabéns, sua conta foi criada com sucesso!");
        System.out.println("=====================");

        System.out.println("Olá " + conta.getNomeCliente() + " portador do cpf: " +
                conta.getCpf() + " seja bem vindo!");

        System.out.println("Sua Agencia é: " + conta.getAgencia() +
                " e o numero da Conta é: " + conta.getNumConta());


        System.out.println("Digite a quantidade que deseja depositar na sua conta: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);

        System.out.println(conta.getNomeCliente() + " seu deposito foi realizado com sucesso!");
        System.out.println("Seu saldo atual é de: " + conta.getSaldo());
    }
}