public class Reptil extends Animal {
    

    public Reptil(float peso, int idade, int membros) {
        super(peso, idade, membros);
        
    }

    @Override
    public void locomover() {
     System.out.println("RASTEJANDO");   
    }

    @Override
    public void alimentar() {
     System.out.println("COMENTO VEJETAIS");       
    }

    @Override
    public void emitirSon() {
     System.out.println("SOM DE RÉPTIL");   
    }
    
    
}
