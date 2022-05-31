package veiculo;

public class Caminhao extends Automovel{
    public Caminhao(String combustivel) {
        super(combustivel);
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "combustivel='" + "Diesel" + '\'' +
                '}';
    }
}
