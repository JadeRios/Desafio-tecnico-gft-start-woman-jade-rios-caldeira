package veiculo;

public class Esportivo extends Caminhao{

    public Esportivo(String combustivel) {
        super(combustivel);
    }

    @Override
    public String toString() {
        return "Esportivo{" +
                "combustivel='" + "Gasolina" + '\'' +
                '}';
    }
}
