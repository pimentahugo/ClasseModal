package application;

public class Conta {
    public double saldo;
    public Estado estado;

    public Conta(double saldo) {
        this.saldo = saldo;
        this.estado = new Positiva();
    }
    public Conta() {
        this.saldo = 0;
        this.estado = new Positiva();
    }
}
