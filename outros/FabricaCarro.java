public class FabricaCarro {

    //atributos
    String modelo;
    String marca;
    int ano;
    int velocidade;

    //metodos
    void acelerar(int aceleracao){
        velocidade += aceleracao;
    }
    void freiar (int reduzir){
        velocidade-= reduzir;
    }
    void buzinar (){
        System.out.println("bi bi bi");
    }
    public FabricaCarro(String modelo, String marca, int ano, int velocidade) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    
}