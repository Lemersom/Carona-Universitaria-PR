public class Principal {

    private static int resp = 0;

    public static int verResp(int resp){
        if(resp == 1 || resp == 2){
            return resp;
        }
        else{
            resp = 0;
            return resp;
        }
    }

    public static void main(String[] arg){
        Leitura l = new Leitura();
        Passageiro pa = new Passageiro();
        Piloto pi = new Piloto();

        try{
            resp = Integer.parseInt(l.entDados("(1) - Piloto\n(2) - Passageiro"));
            resp = verResp(resp);
        }
        catch(NumberFormatException erro){
            System.out.println("\n Valor deve ser um inteiro");
        }

        if(resp == 1){
            pi.pegarDados();
        }
        else if(resp == 2){
            pa.pegarDados();
        }
        else{
            System.out.println("\n\tERRO! Tente Novamente");
        }
    }
}
