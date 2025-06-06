package bicicletinha;
public class MainB {
    public static void main(String[] args) {
        Bicicleta bicycle = new Bicicleta();

        bicycle.imprimirEstado();

        for (int i = 0; i < 7; i++) {
            bicycle.acelerar();
            bicycle.imprimirEstados();
        }

        for (int i = 0; i < 4; i++) {
            bicycle.frear();
            bicycle.imprimirEstados();
        }
    }
}