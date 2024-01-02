public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public void cancelarMatricula(){

    }

    

    public Aluno(String nome, int idade, String sexo, String matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }



    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    

}
