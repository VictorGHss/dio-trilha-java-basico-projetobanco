package dio.bancoterminal;

public class ContaBanco {

    public String nomeCliente;
    public String cpf;
    public int numConta;
    public String agencia;
    public double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("Valor de deposito invalido!");
        }
    }
}