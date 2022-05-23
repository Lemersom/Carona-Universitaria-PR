public class Piloto extends Pessoa{
    private String veiculo = "";
    private int ganhos = 0; //ganhos pessoais das corridas R$

    Leitura l = new Leitura();

    public void pegarDados(){
        System.out.println("\n\t Dados do Piloto: ");

        setNome(l.entDados("Nome: "));
        setSobrenome(l.entDados("Sobrenome: "));
        setIdade(Integer.parseInt(l.entDados("Idade: ")));
        setVeiculo(l.entDados("Veiculo: "));
    }

    public String getVeiculo() {
        return veiculo;
    }
    public int getGanhos() {
        return ganhos;
    }
    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    public void setGanhos(int ganhos) {
        this.ganhos = ganhos;
    }
}
