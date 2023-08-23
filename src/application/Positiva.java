package application;

public class Positiva implements Estado {
    @Override
    public void depositar(double valor) {
        this.valor += valor;
    }
    @Override
    public void sacar(double valor) {
        if(this.valor < -100) {
            this.valor -= valor;
        } else {
            this.estado = new Negativa();
        }
    }
}
