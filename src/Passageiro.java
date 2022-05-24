public class Passageiro extends Pessoa{
    public int conta_banco = 0;
    Leitura l = new Leitura();

    public void pegarDados(){
        System.out.println("\n\t Dados do Passageiro: ");

        setNome(l.entDados("Nome: "));
        setSobrenome(l.entDados("Sobrenome: "));
        setIdade(Integer.parseInt(l.entDados("Idade: ")));
        setConta_banco(Integer.parseInt(l.entDados("Conta do banco: ")));

    }

    public int getConta_banco() {
        return conta_banco;
    }
    public void setConta_banco(int conta_banco) {
        this.conta_banco = conta_banco;
    }
}
