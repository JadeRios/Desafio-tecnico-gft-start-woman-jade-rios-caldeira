public class Agenda {
    public int pessoa;
    public int telefone;
    public int idade;

    public Agenda(int pessoa, int telefone, int idade) {
        this.pessoa = pessoa;
        this.telefone = telefone;
        this.idade = idade;
    }

    public int getPessoa() {
        return pessoa;
    }

    public void setPessoa(int pessoa) {
        this.pessoa = pessoa;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
