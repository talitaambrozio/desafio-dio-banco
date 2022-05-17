import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome: ");
        Integer cpf = Integer.valueOf(JOptionPane.showInputDialog("Digite o seu CPF: "));

        Cliente cliente = new Cliente(nome, sobrenome,cpf);
        cliente.setNome(nome);
        cliente.setSobrenome(sobrenome);
        cliente.setCpf(cpf);

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        System.out.println("Bem vindo ao Banco X" + "\nDados cliente: ");
        cliente.imprimeDadosCliente();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        Integer continuar;

        do {

            System.out.println("\n==================Escolha uma opção=====================");
            System.out.println("\n1 - Depósito" + "\n2 - Saque" + "\n3 - Transferência");

            Scanner inicio = new Scanner(System.in);
            Integer opcao = Integer.valueOf(JOptionPane.showInputDialog("Digite a opção desejada: "));
            System.out.println("\nOpção escolhida: " + opcao);


            switch (opcao) {
                case 1:
                    Integer operacaoConta = Integer.valueOf(JOptionPane.showInputDialog("Escola qual Conta deseja utilizar: " +
                            "\n1 - Conta Corrente" + "\n2 - Conta Poupança"));
                    System.out.println("\nConta escolhida: " + operacaoConta);
                    if (operacaoConta == 1) {
                        Double valor = Double.valueOf(JOptionPane.showInputDialog("Digite o valor que deseja depositar: "));
                        cc.depositar(valor);
                        cc.imprimirExtrato();
                        break;
                    } else if (operacaoConta == 2) {
                        Double valor = Double.valueOf(JOptionPane.showInputDialog("Digite o valor que deseja depositar: "));
                        poupanca.depositar(valor);
                        poupanca.imprimirExtrato();
                    }
                    break;
                case 2:
                    Integer operacaoConta2 = Integer.valueOf(JOptionPane.showInputDialog("Escola qual Conta deseja utilizar: " + "\n1 - Conta Corrente" + "\n2 - Conta Poupança"));
                    System.out.println("\nConta escolhida: " + operacaoConta2);
                    if (operacaoConta2 == 1) {
                        Double valor = Double.valueOf(JOptionPane.showInputDialog("Digite o valor que deseja sacar: "));
                        cc.sacar(valor);
                        cc.imprimirExtrato();
                        break;
                    } else if (operacaoConta2 == 2) {
                        Double valor = Double.valueOf(JOptionPane.showInputDialog("Digite o valor que deseja sacar: "));
                        poupanca.sacar(valor);
                        poupanca.imprimirExtrato();
                    }
                    break;
                default:
                    Integer operacaoConta3 = Integer.valueOf(JOptionPane.showInputDialog("Escolha qual Conta deseja utilizar: " + "\n1 - Conta Corrente" + "\n2 - Conta Poupança"));
                    System.out.println("\nConta escolhida: " + operacaoConta3);
                    if (operacaoConta3 == 1) {
                        Double valor = Double.valueOf(JOptionPane.showInputDialog("Digite o valor que deseja transferir: "));
                        cc.transferir(poupanca, valor);
                        cc.imprimirExtrato();
                    } else if (operacaoConta3 == 2) {
                        Double valor = Double.valueOf(JOptionPane.showInputDialog("Digite o valor que deseja transferir: "));
                        poupanca.transferir(cc, valor);
                        poupanca.imprimirExtrato();
                    }
                    break;
            }
            continuar = Integer.valueOf(JOptionPane.showInputDialog("\nDeseja realizar outra operação?" + "\n1 - Sim" + "\n2 - Não"));
            System.out.println("\nOpção escolhida : " + continuar);


       }while(continuar == 1);
    }
}
