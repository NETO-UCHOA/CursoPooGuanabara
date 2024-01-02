public class Aves extends Animal {
    
    //atributo proprio
    private String corPena;

    
    //metodos mãe
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("come fruta");
    }

    @Override
    public void emitirSon() {
        System.out.println("Som de Ave");
    }

    
    //get e set atributo p´roprio
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
      //Construtor mão e próprio

    public Aves(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

  

    
    
    
    
}
