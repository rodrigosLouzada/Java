public class Jogador{
        public int num = 1000;
        private int numPriv = 0;
        private int vidas = 0;
        final int maxVidas = 10;
        static boolean alerta = false;
        static int qtdJogadores = 0;
        static int pontosJogadores = 0;


        public Jogador(int num){
        
        // num = num;
        this.num = num;
        this.vidas = 3;

        System.out.printf("o jogador número %d--------", num);
        qtdJogadores++;
    }

    public int getVidas(){
        return this.vidas;
    }

    public void setVidas(int vidas){

        if(vidas < this.maxVidas){
            this.vidas = maxVidas;

        }else if(vidas < 0){
            this.vidas = 0;

        }else{
            this.vidas = vidas;

        }
    }

    static void pontos(){
        pontosJogadores += 10;
    }

    public void info(){
        System.out.printf("%njogador:%d", this.num);
        System.out.printf("%nVidas: %d", this.vidas);
        System.out.printf("%nAlerta:%s",( alerta ? "sim": "não"));
        System.out.printf("%nJogador:%d" , qtdJogadores);
        System.out.printf("%n pontos jogadores%d", pontosJogadores);
        System.out.printf("%n---------------%n");
    }

}