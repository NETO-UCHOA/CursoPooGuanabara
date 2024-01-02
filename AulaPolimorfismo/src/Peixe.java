public class Peixe extends Animal {
    // Atributo próprio

    private String corNadareira;

   
    //construtor mãe e próprio
    public Peixe(float peso, int idade, int membros, String corNadareira) {
        super(peso, idade, membros);
        this.corNadareira = corNadareira;
    }

    //metodos mãe sobrepostos

    @Override
    public void locomover() {
       System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
       System.out.println("Come Água");
    }

    @Override
    public void emitirSon() {
        System.out.println("Peixe não faz som");
    }

    //metodo próprio
    public void soltarBolhas(){
        System.out.println("blo blo blo");
    }

    // get e set próprio
    
    public String getCorNadareira() {
        return corNadareira;
    }

    public void setCorNadareira(String corNadareira) {
        this.corNadareira = corNadareira;
    }


    

    
}
