public class Aula25 {
    public static void main(String[] args){

        Carro[] carros = new Carro[5];
        Carro[] carros2 = new Carro[5];

        String[] nomesCarros = {"corolla", "ford", "mustang", "fusca", "fiat"};

        carros[0] = new Carro("corolla");
        carros[1] = new Carro("ford");
        carros[2] = new Carro("mustang");
        carros[3] = new Carro("fusca");
        carros[4] = new Carro("fiat");


         for(int i = 0; i< carros.length ; i++){
            carros2[i] = new Carro(nomesCarros[i]);
        }


        for(int i = 0; i < carros.length ; i++){
            carros2[i].info();
        }


        for(Carro c : carros2){
            c.info();
        }


    } 
}
