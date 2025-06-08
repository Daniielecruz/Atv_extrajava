package atvzoo;

public class Peixe extends Animal implements Aquatico {
    @Override
        public void emitirSom(){
            System.out.println("O peixe faz: Blub Blub!");
        }
    @Override
        public void Alimentar(){
            System.out.println("O peixe está comendo");
        }
    @Override
        public void nadar(){
            System.out.println("O peixe nada");
        }
}