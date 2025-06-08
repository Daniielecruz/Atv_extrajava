package locadora;
public class Moto extends Veiculo implements Motorizado {
    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void abastecer() {
        System.out.println("Moto " + modelo + " está sendo abastecida.");
    }
}