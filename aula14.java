public class aula14 {
    public static void main(String[] args){

        Carro c1 = new Carro("Corolla");
        Carro c2 = new Carro("hb20");
        CarroCombate c3 = new CarroCombate("leoparto", 100);
        CarroCombate c4 = new CarroCombate("pantera", 70);

        c1.setLigado(true);

        c4.atirar();
        c4.atirar();
        c4.atirar();
        c4.SofrerDano(30);
        c3.SofrerDano(20);

        c1.info();
        c2.info();
        c3.info();
        c4.info();

    }
    
}
