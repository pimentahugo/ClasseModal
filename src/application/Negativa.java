package application;

public class Negativa implements Estado {
    @Override
    public void depositar(double valor) {
        this.valor += valor;
    }
    @Override
    public void sacar(double valor) {
        if(this.valor < -100) {
            this.estado = new Bloqueada();
        }
    }
}
