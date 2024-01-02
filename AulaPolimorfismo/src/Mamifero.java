public class Mamifero extends Animal {
    private String corDoPelo;

    public Mamifero(float peso, int idade, int membros, String corDoPelo) {
        super(peso, idade, membros);
        this.corDoPelo = corDoPelo;
    }
    
   
    @Override
    public void alimentar() {
       System.out.println("MAMANDO");        
    }

    @Override
    public void emitirSon() {
        System.out.println("SOM DE MAMIFERO");
    }

    @Override
    public void locomover() {
      System.out.println("CORRENDO");
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    
    


  


}
