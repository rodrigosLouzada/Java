public class Veiculo {
    private String nome;
    private int tipo;

    public Veiculo(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public void info(){
        System.out.printf("nome:%s%n", this.nome);
        System.out.printf("tipo:%d%n", this.tipo);
    }

    public String getNome(){
        return this.nome;
    }
    
}
