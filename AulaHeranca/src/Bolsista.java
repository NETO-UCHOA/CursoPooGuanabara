public final class Bolsista extends Aluno{ //classe final, é filho na herança mas tem terá filho
    
    private int bolsa;

    public void renovarMatricula(){
        System.out.println("Renovando matricula do Bolsista "+ getNome());
    }

    @Override // sobreposição ao mesmo método de aluno, mas eu testei e não precisa do @overing pois ele ja sobrepoes sozinho.
    public void pagarMensalidade(){
        System.out.println(getNome() + " é Bolsista");
    }

        
    
    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, int bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }



    
    public int getBolsa() {
        return bolsa;
    }
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    
    
}
