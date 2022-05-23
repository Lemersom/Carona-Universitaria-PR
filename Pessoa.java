public class Pessoa {
    private String nome = "";
    private String sobrenome = "";
    private int idade = 0;
    private int avaliacao = 0; // de 0 a 5 estrelas

    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public int getIdade() {
        return idade;
    }
    public int getAvaliacao() {
        return avaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
}
