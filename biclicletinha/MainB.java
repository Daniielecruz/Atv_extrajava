package bicicletinha;
public class MainB {
    public static void main(String[] args) {
        Bicicleta bycicle = new Bicicleta();

        bycicle.imprimirEstado();

        for (int i = 0; i < 7; i++) {
            bycicle.acelerar();
            bycicle.imprimirEstado();
        }

        for (int i = 0; i < 4; i++) {
            bycicle.frear();
            bycicle.imprimirEstado();
        }
    }
}