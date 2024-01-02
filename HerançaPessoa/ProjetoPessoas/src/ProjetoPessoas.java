
public class ProjetoPessoas {

    public static void main(String[] args) {
        
      Pessoa p1 = new Pessoa("pedro", 10, "M");
      Aluno p2 = new Aluno("Antonio", 15, "m", "abc2023", "java POO");
      Professor p3 = new Professor("Caudia", 33, "F", "Programação", 10000);
      Funcionario p4 = new Funcionario("fabiana", 40, "F", "Segurança", false);


      System.out.println(p1.toString());
      System.out.println(p2.toString());
      System.out.println(p3.toString());
      System.out.println(p4.toString());

    }
}
