    package bicicletinha;
    public class Bicicleta {
    private int velocidade;
    private int marcha;

    public Bicicleta() {
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void acelerar() {
        this.velocidade++;
        ajusteMarcha();
    }

    public void frear() {
        if (this.velocidade > 0) {
            this.velocidade--;
            ajusteMarcha();
        }
    }

    private void ajusteMarcha() {
        if (velocidade == 0) {
            this.marcha = 0;
        } else if (velocidade <= 5) {
            this.marcha = 1;
        } else if (velocidade <= 10) {
            this.marcha = 2;
        } else {
            this.marcha = 3;
        }
    }

    public void imprimir() {
        System.out.println("Velocidade: " + this.velocidade + " km/h | Marcha: " + this.marcha);
    }
}
