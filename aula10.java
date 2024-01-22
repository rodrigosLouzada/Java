public class aula10 {
    public static void main(String[] args){
        int num = 0;

        Jogador.pontos();
        Jogador.pontos();
        Jogador.pontos();

        System.out.printf("%nalerta:%s", Jogador.alerta ? "sim" : "não");

        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);

        Jogador.alerta = true;

        j1.info();
        j2.info();
        j3.info();

        //j1.setVidas(100000);

        //System.out.printf("vidas do jogador: %d", j1.getVidas());


        /*j1.numPriv; 
        j1.num = 1000;
        j2.num = 3000;
        System.out.printf("%d", j1.num);
        System.out.printf("%d", j2.num);
        */
    }
}
