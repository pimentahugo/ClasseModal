package application;

public class Bloqueada implements Estado{
    @Override
    public void depositar(double valor) {
        this.valor += valor;
        if(this.valor < -100) {
            this.estado = new Negativa();
        }
    }
    @Override
    public void sacar(double valor) {
        System.out.prinln("Conta bloqueada");
    }
}
