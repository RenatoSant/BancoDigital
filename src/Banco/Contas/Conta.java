package Banco.Contas;

public class Conta {
    private String nomeCliente;
    private int agencia;
    private int numeroConta;
    private double saldo;

    public Conta(String nomeCliente,int agencia, int numeroConta) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = 0d;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", agencia='" + agencia + '\'' +
                ", numero='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
