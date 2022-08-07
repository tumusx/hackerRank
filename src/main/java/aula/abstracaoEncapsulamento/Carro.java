package aula.abstracaoEncapsulamento;

public class Carro {
    private int marcha;
    private int motor;

    public int mudarMarcha(int qntAumentar) {
        if (qntAumentar <= 0) {
            System.out.println("nao foi possivel aumentar. Valor invalido");
        } else {
            this.marcha += qntAumentar;
        }
        System.out.println("marcha atual " + this.marcha);
        return this.marcha;
    }

    public int mudarMotor(int qntAumentar){
        this.motor += qntAumentar;
        System.out.println("motor atual "+ this.motor);
        return this.motor;
    }

    public int getMarcha() {
        return marcha;
    }

    public int getMotor() {
        return motor;
    }

}
