package bicicletinha;
public class Bprincipal {
    public static void main(String[] args){
        Bicicleta2 bicycle2 = new Bicicleta2(12);

        for (int i = 0; i < 15; i++){
            bicycle2.acelerar();
            bicycle2.imprimirEstados();
        }

        for (int i=0; i< 5; i++){
            bicycle2.frear();
            bicycle2.imprimirEstados();
        }
    }
}