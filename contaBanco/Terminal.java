package contaBanco;

import java.util.Scanner;

public class Terminal {
    int valorDeposito ;

    public Cliente criarConta() {

        Cliente novoCliente = new Cliente();

        Scanner dataTerminal = new Scanner(System.in);

        System.out.println("Por favor, digite seu Nome !");
        novoCliente.nome = dataTerminal.next();

        System.out.println("Por favor, digite seu Sobrenome !");
        novoCliente.sobrenome = dataTerminal.next();

        System.out.println("Por favor, digite o número da Agência !");
        novoCliente.numeroAgencia = dataTerminal.nextInt();

        System.out.println("Por favor, digite o número da Conta !");
        novoCliente.numeroConta = dataTerminal.nextInt();

        System.out.println("Por favor, digite quanto vai depositar !");
        valorDeposito = dataTerminal.nextInt();
        novoCliente.saldo = novoCliente.saldo + valorDeposito ;

        System.out.println("Olá " + novoCliente.nome + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + novoCliente.numeroAgencia + "," +
                " conta " + novoCliente.numeroConta +
                " e seu novo saldo é : " + novoCliente.saldo +
                " e  já está disponível para saque") ;

        System.out.println( "Nome: " + novoCliente.nome + " " +  novoCliente.sobrenome);
        System.out.println("Agência: " + novoCliente.numeroAgencia);
        System.out.println("Numero da Conta: " + novoCliente.numeroConta);
        System.out.println("Saldo: " + novoCliente.saldo);

        return novoCliente;

    }
}
