import javax.swing.*;
import java.util.Scanner;

public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    @Override
    public void sacar(double valor) {

               saldo -= valor;
    }
    @Override
    public void depositar(double valor) {
             saldo += valor;
    }
    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor); //saca o valor da conta origem;
        contaDestino.depositar(valor);// e deposita na conta destino.
    }
    protected void imprimirInfosComuns(){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
