import aula.abstracaoEncapsulamento.Carro;

public class TestMainJV {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.getMarcha());
        System.out.println(carro.getMotor());
        carro.mudarMarcha(0);
        carro.mudarMotor(35);
        System.out.println(carro.getMarcha());
        System.out.println(carro.getMotor());
        carro.mudarMotor(35);
        System.out.println(carro.getMotor());
    }
}
