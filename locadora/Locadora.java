package locadora;
public class Locadora {
    public static void main(String[] args){
        Carro carro = new Carro("Celta", 2011);
        Moto moto = new Moto ("Apache", 2008);
        BicicletaEletrica bike = new BicicletaEletrica("Oggi", 2023);

        carro.alugar();
        carro.abastecer();

        moto.alugar();
        moto.abastecer();

        bike.alugar();
    }
}