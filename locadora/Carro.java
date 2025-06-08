package locadora;
public class Carro extends Veiculo implements Motorizado {
    public Carro(String modelo, int ano){
        super(modelo,ano);
    }
    
    @Override
    public void abastecer(){
        System.out.println("Carro "+ modelo +" está sendo abastecido.");
    }
}