public class Jogador{
        public int num = 1000;
        private int numPriv = 0;
        private int vidas = 0;
        final int maxVidas = 10;

        public Jogador(int num){
        
        // num = num;
        this.num = num;
        this.vidas = 3;

        System.out.printf("o jogador número %d--------", num);
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

}