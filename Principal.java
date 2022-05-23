public class Principal {

    public static void main(String arg[]){
        Leitura l = new Leitura();
        Passageiro pa = new Passageiro();
        Piloto pi = new Piloto();

        int resp = 0;
        resp = Integer.parseInt(l.entDados("(1) - Piloto\n(2) - Passageiro"));

        if(resp == 1){
            pi.pegarDados();
        }
        else if(resp == 2){
            pa.pegarDados();
        }
        else{
            System.out.println("ERRO! Tente Novamente");
        }
    }
}
